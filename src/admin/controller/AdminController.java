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
import java.awt.event.ActionListener;
import book.model.BookFetcher;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import presentation.Welcome;
import utilities.ControladorPrincipal;

public class AdminController implements ActionListener {

    DefaultTableModel model = new DefaultTableModel();
    private AdminManagement adminManagement;
    private AdminLogin vistaLogin;
    // Maybe we will modify this later.
    private BookShelf bs;
    private BookFetcher bf;

    public AdminController(AdminLogin vistaLogin,
            AdminManagement adminManagement) {
        this.vistaLogin = vistaLogin;
        this.adminManagement = adminManagement;
        this.vistaLogin.btnIngresar.addActionListener(this);
        this.vistaLogin.btnRegresar.addActionListener(this);
        this.bs = new BookShelf();
        this.bf = new BookFetcher();
        setActionListeners();
    }

    public void cargarLibros() {
        
        if (model.getColumnCount() == 0) {
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
                model.addColumn(columna);
            }

            adminManagement.tblLibros.setModel(model);
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

            model.addRow(datos);
        }

//        ArrayList<Object> books = new ArrayList<Object>();
//        Object[] datos = new Object[]{1,"1","1","1",123,123,"1","1",3};
//        
//        model.addRow(datos);
        adminManagement.tblLibros.setModel(model);
    }

    private void setActionListeners() {

        adminManagement.onSearchByIdClick((e) -> {
            // Aquí tiene que abrirse la ventana que pregunta por el ID
            // Y luego, de alguna manera, recuperar la ID que insertó el usuario
            BookIdPrompt bip = new BookIdPrompt();
            bip.setVisible(true);
            bip.setLocationRelativeTo(null);

            bip.btnOK.addActionListener((ev) -> {
                String a = bip.txtID.getText();
                int id = Integer.parseInt(a);

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
            });

            bip.btnCancelar.addActionListener((ev) -> {
                System.out.println("cancelado");
                bip.setVisible(false);
            });
        });

        adminManagement.onModifyClick((e) -> {
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
            
            model.setRowCount(0);
            cargarLibros();
        });

        adminManagement.onDeleteClick((e) -> {
            int bookId = Integer.parseInt(adminManagement.getId());
            bs.deleteBook(bookId);
            model.setRowCount(0);
            cargarLibros();
        });

        adminManagement.onAddClick((e) -> {
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

            // Modificar numero de pagina
            Book bookToAdd = new Book(
                    id, title, author, genre,
                    numPages, publishedDate,
                    language, ISBN, rating, fragment);
            bs.addBook(bookToAdd);
            model.setRowCount(0);
            cargarLibros();
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
    }

    public void iniciarAdminManagement() {
        adminManagement.setTitle("Zona de Administración");
        adminManagement.setLocationRelativeTo(null);
        adminManagement.setVisible(true);
    }

    public void iniciarLogin() {
        vistaLogin.setTitle("Iniciar Sesión");
        vistaLogin.setLocationRelativeTo(null);
        vistaLogin.setVisible(true);
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

                aw.btnEntrar.addActionListener((event) -> {
                    iniciarAdminManagement();
                    cargarLibros();
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
