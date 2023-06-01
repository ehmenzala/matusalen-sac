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
import java.awt.event.ActionListener;

public class AdminController implements ActionListener {

    private AdminManagement adminManagement;
    private AdminLogin vistaLogin;
    // Maybe we will modify this later.
    private BookShelf bs;

    public AdminController(AdminLogin vistaLogin,
            AdminManagement adminManagemet) {
        this.vistaLogin = vistaLogin;
        this.adminManagement = adminManagemet;
        this.vistaLogin.btnIngresar.addActionListener(this);
        setActionListeners();
    }

    private void setActionListeners() {

        adminManagement.onModifyClick((e) -> {

        });

        adminManagement.onDeleteClick((e) -> {
        });

        adminManagement.onAddClick((e) -> {
            
            String title = adminManagement.getTitulo();
            String author = adminManagement.getAutor();
            String genre = adminManagement.getGenero();
            String language = "Idioma";
            String ISBN = adminManagement.getISBN();
            String fragment = "Aasdkjhajd";
            int id = Integer.parseInt(adminManagement.getId());
            int numPages = 55555;
            int publishedDate = Integer.parseInt(adminManagement.getAnio());
            int rating = 5;

            // Modificar numero de pagina
            Book bookToAdd = new Book(
                    id, title, author, genre, 
                    numPages, publishedDate,
                    language, ISBN, rating, fragment);
            bs.addBook(bookToAdd);
        });

        adminManagement.onCleanClick((e) -> {
        });

        adminManagement.onSearchByIdClick((e) -> {
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
            } else {
                System.out.println("no");
            }
        }
    }
}
