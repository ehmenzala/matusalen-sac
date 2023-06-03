
import admin.controller.AdminController;
import admin.view.AdminLogin;
import admin.view.AdminManagement;

public class Main {

    public static void main(String[] args) {
        
        AdminLogin vistaLogin = new AdminLogin();
        AdminManagement adminManagement = new AdminManagement();
                
        AdminController ac = new AdminController(vistaLogin, adminManagement);
        ac.iniciarVentanaPrincipal();

    }

}
