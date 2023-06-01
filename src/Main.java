
import admin.controller.AdminController;
import admin.view.AdminLogin;
import admin.view.AdminManagement;
import book.controller.MainWindowController;
import book.model.BookShelf;
import book.view.MainWindow;
import presentation.Welcome;

public class Main {

    public static void main(String[] args) {
        
        // Initial window
//        new Welcome().setVisible(true);
        
        // MainWindow
//        MainWindow mainWindow = new MainWindow();
//        BookShelf bs = new BookShelf();
//        MainWindowController controller = new MainWindowController(mainWindow, bs);
//
//        controller.showWindow();

        // AdminLogin
        AdminLogin al = new AdminLogin();
        AdminManagement am = new AdminManagement();
        
        AdminController ctrl = new AdminController(al, am);
        
        //ctrl.iniciarLogin();
        ctrl.iniciarAdminManagement();

        
    }

    
}
