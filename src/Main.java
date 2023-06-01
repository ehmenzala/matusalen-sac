
import admin.controller.AdminController;
import admin.view.AdminLogin;
import book.controller.MainWindowController;
import book.model.BookShelf;
import book.view.MainWindow;

public class Main {

    public static void main(String[] args) {
        
        // MainWindow
        MainWindow mainWindow = new MainWindow();
        BookShelf bs = new BookShelf();
        MainWindowController controller = new MainWindowController(mainWindow, bs);

        controller.showWindow();

        // AdminLogin
        AdminLogin al = new AdminLogin();
        AdminController ctrl = new AdminController(al);
        
        ctrl.iniciar();
        al.setVisible(true);

        
    }

    
}
