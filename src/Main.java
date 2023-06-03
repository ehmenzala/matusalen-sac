
import admin.controller.AdminController;
import admin.view.AdminLogin;
import admin.view.AdminManagement;
import book.controller.MainWindowController;
import book.model.BookShelf;
import book.view.MainWindow;
import com.sun.org.apache.bcel.internal.generic.AALOAD;
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
        
        AdminLogin vistaLogin = new AdminLogin();
        AdminManagement adminManagement = new AdminManagement();
                
        
        AdminController ac = new AdminController(vistaLogin, adminManagement);
        ac.iniciarVentanaPrincipal();


        
        
//        AdminLogin al = new AdminLogin();
//        AdminManagement am = new AdminManagement();
//        
//        AdminController ctrl = new AdminController(al, am);
//        
//        ctrl.iniciarLogin();
//        ctrl.iniciarAdminManagement();

    }

}
