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
import presentation.Welcome;
import book.controller.MainWindowController;
import utilities.ControladorPrincipal;


public class AdminController implements ActionListener {
    private AdminManagement adminManagement;
    private AdminLogin vistaLogin;
    // Maybe we will modify this later.
    private BookShelf bs;

 
    public AdminController(AdminLogin vistaLogin,
            AdminManagement adminManagement) {
        this.vistaLogin = vistaLogin;
        this.adminManagement = adminManagement;
        this.vistaLogin.btnIngresar.addActionListener(this);
        this.vistaLogin.btnRegresar.addActionListener(this);
        this.bs = new BookShelf();
        setActionListeners();
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
        });

        adminManagement.onDeleteClick((e) -> {
            int bookId = Integer.parseInt(adminManagement.getId());
            bs.deleteBook(bookId);
        });

        adminManagement.onAddClick((e) -> {
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

            // Modificar numero de pagina
            Book bookToAdd = new Book(
                    id, title, author, genre,
                    numPages, publishedDate,
                    language, ISBN, rating, fragment);
            bs.addBook(bookToAdd);
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
                    aw.setVisible(false);
                });
            } else {
                System.out.println("USUARIO O CONTRASEÑA INCORRECTA");
            }
        } 
        
        if (e.getSource() == vistaLogin.btnRegresar) {
            System.out.println("hola");
        }
    }
}
