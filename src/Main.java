
import admin.controller.AdminController;
import admin.view.AdminLogin;
import admin.view.AdminManagement;
import book.controller.MainWindowController;
import book.model.BookShelf;
import book.view.MainWindow;
import presentation.Welcome;
import utilities.ControladorPrincipal;

public class Main {

    public static void main(String[] args) {

//         Initial window
//        new Welcome().setVisible(true);
//         MainWindow
//        MainWindow mainWindow = new MainWindow();
//        BookShelf bs = new BookShelf();
//        MainWindowController controller = new MainWindowController(mainWindow, bs);
//
//        controller.showWindow();
//         AdminLogin}
        
        
        
        Welcome w = new Welcome();
        w.setTitle("PANTALLA DE INICIO");
        w.setVisible(true);
        w.setLocationRelativeTo(null);
        
        ControladorPrincipal cp = new ControladorPrincipal(w);


        
        
//        AdminLogin al = new AdminLogin();
//        AdminManagement am = new AdminManagement();
//        
//        AdminController ctrl = new AdminController(al, am);
//        
//        ctrl.iniciarLogin();
//        ctrl.iniciarAdminManagement();

    }

}
