package admin.controller;

import admin.view.AdminLogin;
import admin.model.Admin;
import admin.model.AdminSessionFetcher;
import admin.model.AdminSession;
import java.awt.event.ActionEvent;
import admin.view.AdminWelcome;
import admin.view.AdminManagement;
import book.model.BookShelf;
import book.model.Book;
import admin.view.BookIdPrompt;
import admin.view.DeleteBookPrompt;
import admin.view.GestionSolicitudes;
import java.awt.event.ActionListener;
import book.model.BookFetcher;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import presentation.Welcome;
import utilities.*;

public class AdminController implements ActionListener {

    private final AdminManagement adminManagement;
    private final AdminLogin vistaLogin;
    private final GestionSolicitudes panelSolicitudes;
    private final AdminWelcome aw;
    private final BookShelf bs;
    private final BookFetcher bf;
    private final SolicitudFetcher sf;

    DefaultTableModel bookTblModel = new DefaultTableModel();
    DefaultTableModel soliTblModel = new DefaultTableModel();

    public AdminController(AdminLogin vistaLogin,
            AdminManagement adminManagement) {
        this.vistaLogin = vistaLogin;
        this.adminManagement = adminManagement;
        this.vistaLogin.btnIngresar.addActionListener(this);
        this.vistaLogin.btnRegresar.addActionListener(this);
        this.aw = new AdminWelcome();
        this.bs = new BookShelf();
        this.bf = new BookFetcher();
        this.sf = new SolicitudFetcher();
        this.panelSolicitudes = new GestionSolicitudes();
        setActionListeners();
    }

    public void cargarLibros() {

        if (bookTblModel.getColumnCount() == 0) {
            ArrayList<Object> colum = new ArrayList<Object>();
            colum.add("ID");
            colum.add("Titulo");
            colum.add("Autor");
            colum.add("Género");
            colum.add("N° Páginas");
            colum.add("Año de publicación");
            colum.add("Idioma");
            colum.add("ISBN");
            colum.add("Rating");

            for (Object columna : colum) {
                bookTblModel.addColumn(columna);
            }

            adminManagement.tblLibros.setModel(bookTblModel);
        }

        ArrayList<Book> books = bf.readAllBooks();

        for (Book book : books) {
            Object[] datos = new Object[]{
                book.getId(),
                book.getTitle(),
                book.getAuthor(),
                book.getGenre(),
                book.getNumberOfPages(),
                book.getPublishedDate(),
                book.getLanguage(),
                book.getIsbn(),
                book.getRating()
            };

            bookTblModel.addRow(datos);
        }

        adminManagement.tblLibros.setModel(bookTblModel);
    }

    public void cargarSolicitudes() {

        boolean tablaNoTieneColumnas = soliTblModel.getColumnCount() == 0;

        if (tablaNoTieneColumnas) {
            addTableHeaders();
        }

        Queue<Solicitud> enEsperaQueue = new LinkedList<>();
        Queue<Solicitud> procesadoQueue = new LinkedList<>();

        ArrayList<Solicitud> solicitudes = sf.readAllSolicitudes();

        for (Solicitud solicitud : solicitudes) {
            if (solicitud.getEstado().equals("En espera")) {
                enEsperaQueue.add(solicitud);
            } else if (solicitud.getEstado().equals("Procesado")) {
                procesadoQueue.add(solicitud);
            }
        }

        for (Solicitud solicitud : enEsperaQueue) {
            soliTblModel.addRow(new Object[]{
                solicitud.getId(),
                solicitud.getTitulo(),
                solicitud.getEstado(),
                solicitud.getDNI()
            });
        }

        for (Solicitud solicitud : procesadoQueue) {
            soliTblModel.addRow(new Object[]{
                solicitud.getId(),
                solicitud.getTitulo(),
                solicitud.getEstado(),
                solicitud.getDNI()
            });
        }

        panelSolicitudes.tblSolicitudes.setModel(soliTblModel);
    }

    private void addTableHeaders() {
        ArrayList<Object> columns = new ArrayList<>(Arrays.asList(
                "ID", "Titulo", "Estado", "DNI"
        ));

        for (Object column : columns) {
            soliTblModel.addColumn(column);
        }

        panelSolicitudes.tblSolicitudes.setModel(soliTblModel);
    }

    private boolean losCamposEstanCompletos() {
        String title = adminManagement.getTitulo();
        String author = adminManagement.getAutor();
        String genre = adminManagement.getGenero();
        String language = adminManagement.getIdioma();
        String ISBN = adminManagement.getISBN();
        String fragment = adminManagement.getFragmento();
        String numPagesString = adminManagement.getNumPaginas();
        String publishedDateString = adminManagement.getAnio();
        String ratingString = adminManagement.getRating();

        // Verificar si algún campo está vacío
        if (title.isEmpty() || author.isEmpty() || genre.isEmpty() || language.isEmpty()
                || ISBN.isEmpty() || fragment.isEmpty() || numPagesString.isEmpty()
                || publishedDateString.isEmpty() || ratingString.isEmpty()) {
            return false; // Al menos un campo está vacío
        }

        return true; // Todos los campos están completos
    }

    private boolean losCamposNumericosSonValidos() {

        String numPagesString = adminManagement.getNumPaginas();
        String publishedDateString = adminManagement.getAnio();
        String ratingString = adminManagement.getRating();

        try {
            Integer.parseInt(numPagesString);
            Integer.parseInt(publishedDateString);
        } catch (NumberFormatException e) {
            return false; // Al menos uno de los campos no es un número válido
        }

        return true; // Todos los campos numéricos válidos
    }

    private boolean ratingEstaDentroDeRango() {
        String ratingString = adminManagement.getRating();
        int rating = Integer.parseInt(ratingString);
        return !(rating < 1 || rating > 5);
    }

    private void setActionListeners() {

        adminManagement.onSearchByIdClick((e) -> {

            BookIdPrompt bip = new BookIdPrompt();
            bip.setVisible(true);
            bip.setLocationRelativeTo(null);

            bip.btnOK.addActionListener((ev) -> {
                String idInput = bip.txtID.getText();

                // Validar si el campo de ID está vacío o no es un número
                if (idInput.isEmpty() || !idInput.matches("\\d+")) {
                    JOptionPane.showMessageDialog(null,
                            "Ingresa un valor numérico válido. Ej: 25",
                            "Error: ID inválido",
                            JOptionPane.ERROR_MESSAGE
                    );
                    return;
                }

                int id = Integer.parseInt(idInput);
                Book foundBook = bs.getBook(id);

                adminManagement.setTitulo(foundBook.getTitle());
                adminManagement.setAutor(foundBook.getAuthor());
                adminManagement.setGenero(foundBook.getGenre());
                adminManagement.setIdioma(foundBook.getLanguage());
                adminManagement.setISBN(foundBook.getIsbn());
                adminManagement.setFragmento(foundBook.getFragment());
                adminManagement.setId(String.valueOf(foundBook.getId()));
                adminManagement.setNumPaginas(String.valueOf(foundBook.getNumberOfPages()));
                adminManagement.setAnio(String.valueOf(foundBook.getPublishedDate()));
                adminManagement.setRating(String.valueOf(foundBook.getRating()));
                bip.setVisible(false);
                JOptionPane.showMessageDialog(null, "ID Encontrado\nPuede hacer modificaciones.");
            });

            bip.btnCancelar.addActionListener((ev) -> {
                bip.setVisible(false);
            });
        });

        adminManagement.onModifyClick((e) -> {
            if (losCamposEstanCompletos() && losCamposNumericosSonValidos() && ratingEstaDentroDeRango() && !adminManagement.getId().isEmpty()) {
                String title = adminManagement.getTitulo();
                String author = adminManagement.getAutor();
                String genre = adminManagement.getGenero();
                String language = adminManagement.getIdioma();
                String ISBN = adminManagement.getISBN();
                String fragment = adminManagement.getFragmento();
                int id = Integer.parseInt(adminManagement.getId());
                int numPages = Integer.parseInt(adminManagement.getNumPaginas());
                int publishedDate = Integer.parseInt(adminManagement.getAnio());
                int rating = Integer.parseInt(adminManagement.getRating());

                bs.updateBook(new Book(id, title, author, genre,
                        numPages, publishedDate,
                        language, ISBN, rating, fragment));

                bookTblModel.setRowCount(0);
                cargarLibros();
            } else {
                String errorMessage = "";

                if (adminManagement.getId().isEmpty()) {
                    errorMessage += "El ID está vacío. Por favor haga clic en el botón BUSCAR ID.\nAsí podrá modificar un libro existente.";
                    JOptionPane.showMessageDialog(null, errorMessage, "Error: Verifique el ingreso de datos", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                if (!losCamposEstanCompletos()) {
                    errorMessage += "Hay campos vacíos existentes.\n";
                }

                if (!losCamposNumericosSonValidos()) {
                    errorMessage += "Algunos campos numéricos no son válidos.\n";
                } else if (!ratingEstaDentroDeRango()) {
                    errorMessage += "Verifique que el rating esté entre 1 y 5.";
                }

                JOptionPane.showMessageDialog(null, errorMessage, "Error: Verifique el ingreso de datos", JOptionPane.ERROR_MESSAGE);
            }
        });

        adminManagement.onDeleteClick((e) -> {
            DeleteBookPrompt bdp = new DeleteBookPrompt();
            bdp.setVisible(true);
            bdp.setLocationRelativeTo(null);

            bdp.btnOK.addActionListener((ev) -> {
                String idInput = bdp.txtID.getText();

                // Validar si el campo de ID está vacío o no es un número
                if (idInput.isEmpty() || !idInput.matches("\\d+")) {
                    JOptionPane.showMessageDialog(null,
                            "Ingresa un valor numérico válido. Ej: 25",
                            "Error: ID inválido",
                            JOptionPane.ERROR_MESSAGE
                    );
                    return;
                }

                int bookId = Integer.parseInt(adminManagement.getId());
                bs.deleteBook(bookId);
                bookTblModel.setRowCount(0);
                cargarLibros();
            });

            bdp.btnCancelar.addActionListener((ev) -> {
                bdp.setVisible(false);
            });

        });

        adminManagement.onAddClick((e) -> {
            if (losCamposEstanCompletos() && losCamposNumericosSonValidos() && ratingEstaDentroDeRango()) {
                String title = adminManagement.getTitulo();
                String author = adminManagement.getAutor();
                String genre = adminManagement.getGenero();
                String language = adminManagement.getIdioma();
                String ISBN = adminManagement.getISBN();
                String fragment = adminManagement.getFragmento();
                int numPages = Integer.parseInt(adminManagement.getNumPaginas());
                int publishedDate = Integer.parseInt(adminManagement.getAnio());
                int rating = Integer.parseInt(adminManagement.getRating());
                int id = bf.createNewId();

                Book bookToAdd = new Book(
                        id, title, author, genre,
                        numPages, publishedDate,
                        language, ISBN, rating, fragment);
                bs.addBook(bookToAdd);
                bookTblModel.setRowCount(0);
                cargarLibros();
            } else {
                String errorMessage = "";

                if (!losCamposEstanCompletos()) {
                    errorMessage += "Hay campos vacíos existentes.\n";
                }

                if (!losCamposNumericosSonValidos()) {
                    errorMessage += "Algunos campos numéricos no son válidos.\n";
                } else if (!ratingEstaDentroDeRango()) {
                    errorMessage += "Verifique que el rating esté entre 1 y 5.";
                }

                JOptionPane.showMessageDialog(null, errorMessage, "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        });

        adminManagement.onCleanClick((e) -> {
            adminManagement.setTitulo("");
            adminManagement.setAutor("");
            adminManagement.setGenero("");
            adminManagement.setIdioma("");
            adminManagement.setISBN("");
            adminManagement.setFragmento("");
            adminManagement.setId("");
            adminManagement.setNumPaginas("");
            adminManagement.setAnio("");
            adminManagement.setRating("");

        });

        panelSolicitudes.buscarPorID((e) -> {
            String idInputStr = panelSolicitudes.txtID.getText().trim();

            if (idInputStr.isEmpty()) {
                JOptionPane.showMessageDialog(null,
                        "Ingrese un valor en el campo ID",
                        "Error: ID vacío",
                        JOptionPane.ERROR_MESSAGE
                );
                return;
            }

            if (!idInputStr.matches("\\d+")) {
                JOptionPane.showMessageDialog(null,
                        "Ingrese un valor numérico válido en el campo ID",
                        "Error: ID no numérico",
                        JOptionPane.ERROR_MESSAGE
                );
                return;
            }

            int idInput = Integer.parseInt(idInputStr);

            SolicitudFetcher sf = new SolicitudFetcher();
            boolean existeID = sf.existeSolicitudPorID(idInput);

            if (!existeID) {
                JOptionPane.showMessageDialog(null,
                        "El ID no está registrado en la base de datos",
                        "Error: ID no encontrado",
                        JOptionPane.ERROR_MESSAGE
                );
                return;
            }
            String titulo = buscarTituloPorID(idInput);

            if (titulo != null) {
                panelSolicitudes.txtTitulo.setText(titulo);
            } else {
                panelSolicitudes.txtTitulo.setText("");
            }
        });

        panelSolicitudes.procesarSolicitud((e) -> {
            String idInputStr = panelSolicitudes.txtID.getText().trim();

            if (idInputStr.isEmpty()) {
                JOptionPane.showMessageDialog(null,
                        "Ingrese un valor en el campo ID",
                        "Error: ID vacío",
                        JOptionPane.ERROR_MESSAGE
                );
                return;
            }

            if (!idInputStr.matches("\\d+")) {
                JOptionPane.showMessageDialog(null,
                        "Ingrese un valor numérico válido en el campo ID",
                        "Error: ID no numérico",
                        JOptionPane.ERROR_MESSAGE
                );
                return;
            }

            int idInput = Integer.parseInt(idInputStr);

            SolicitudFetcher sf = new SolicitudFetcher();
            boolean existeID = sf.existeSolicitudPorID(idInput);

            if (!existeID) {
                JOptionPane.showMessageDialog(null,
                        "El ID no está registrado en la base de datos",
                        "Error: ID no encontrado",
                        JOptionPane.ERROR_MESSAGE
                );
                return;
            }

            procesarSoli(idInput);
        });

        panelSolicitudes.recargarSoli((e) -> {
            soliTblModel.setRowCount(0);
            cargarSolicitudes();
        });

        adminManagement.regresar((e) -> {
            iniciarLogin();
            adminManagement.setVisible(false);
        });

        panelSolicitudes.regresar((e) -> {
            iniciarLogin();
            panelSolicitudes.setVisible(false);
        });

    }

    public void iniciarAdminManagement() {
        adminManagement.setTitle("Zona de Administración");
        adminManagement.setLocationRelativeTo(null);
        adminManagement.setVisible(true);
    }

    public void iniciarSolicitudes() {
        panelSolicitudes.setTitle("SOLICITUDES");
        panelSolicitudes.setLocationRelativeTo(null);
        panelSolicitudes.setVisible(true);
    }

    public void iniciarLogin() {
        vistaLogin.setTitle("Iniciar Sesión");
        vistaLogin.setLocationRelativeTo(null);
        vistaLogin.setVisible(true);
    }

    private void procesarSoli(int id) {

        for (int i = 0; i < soliTblModel.getRowCount(); i++) {
            int solicitudID = (int) soliTblModel.getValueAt(i, 0);
            if (solicitudID == id) {

                if (soliTblModel.getValueAt(i, 2).equals("Procesado")) {
                    JOptionPane.showMessageDialog(null, "Esta solicitud ya está procesada");
                } else {
                    JOptionPane.showMessageDialog(null, "Solicitud Procesada");
                    Solicitud solis = new Solicitud(solicitudID, (String) (soliTblModel.getValueAt(i, 1)), "Procesado", (String) soliTblModel.getValueAt(i, 3));
                    sf.updateSolicitud(solis);
                    soliTblModel.setRowCount(0);
                    cargarSolicitudes();
                    return;
                }
            }
        }
    }

    private String buscarTituloPorID(int id) {
        for (int i = 0; i < soliTblModel.getRowCount(); i++) {
            int solicitudID = (int) soliTblModel.getValueAt(i, 0);
            if (solicitudID == id) {
                return (String) soliTblModel.getValueAt(i, 1);
            }
        }
        return null;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vistaLogin.btnIngresar) {
            Admin ad = new Admin(vistaLogin.txtNombre.getText());

            AdminSessionFetcher ads = new AdminSessionFetcher();
            AdminSession as = new AdminSession(ad, vistaLogin.txtCorreo.getText(), vistaLogin.pswContraseña.getText());
            if (ads.exists(as)) {
                AdminWelcome aw = new AdminWelcome();
                aw.setVisible(true);
                aw.setLocationRelativeTo(null);
                aw.lblAdminWelcome.setText("Bienvenido, " + as.getAdmin().getName());
                vistaLogin.setVisible(false);

                aw.btnPanelAdmin.addActionListener((event) -> {
                    iniciarAdminManagement();
                    cargarLibros();
                    aw.setVisible(false);
                });

                aw.btnSolicitudes.addActionListener((event) -> {
                    iniciarSolicitudes();
                    cargarSolicitudes();
                    aw.setVisible(false);
                });
            } else {
                System.out.println("USUARIO O CONTRASEÑA INCORRECTA");
            }
        }

        if (e.getSource() == vistaLogin.btnRegresar) {
            iniciarVentanaPrincipal();
            vistaLogin.setVisible(false);
        }
    }

    public void iniciarVentanaPrincipal() {
        Welcome w = new Welcome();
        w.setTitle("PANTALLA DE INICIO");
        w.setVisible(true);
        w.setLocationRelativeTo(null);
        ControladorPrincipal cp = new ControladorPrincipal(w);
    }

}
