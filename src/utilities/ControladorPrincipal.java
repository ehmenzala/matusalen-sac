package utilities;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import admin.view.*;
import admin.controller.*;
import book.controller.MainWindowController;
import book.model.BookShelf;
import book.view.*;
import presentation.Welcome;

public class ControladorPrincipal implements ActionListener {

    Welcome mainVista;

    
    public ControladorPrincipal(Welcome v) {
        mainVista = v;
        mainVista.btnAdmin.addActionListener(this);
        mainVista.btnEntrar.addActionListener(this);

    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == mainVista.btnAdmin) {
            AdminLogin al = new AdminLogin();
            AdminManagement am = new AdminManagement();
            AdminController ad = new AdminController(al,am);
            ad.iniciarLogin();
            mainVista.setVisible(false);
        }

        if (e.getSource() == mainVista.btnEntrar) {
            MainWindow mw = new MainWindow();
            MainWindow mainWindow = new MainWindow();
            BookShelf bs = new BookShelf();
            MainWindowController controller = new MainWindowController(mainWindow, bs);
            
            controller.showWindow();
        }
    }
}
