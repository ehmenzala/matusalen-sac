package admin.controller;

import admin.view.AdminLogin;
import admin.model.Admin;
import admin.model.AdminSessionFetcher;
import admin.model.AdminSession;
import java.awt.event.ActionEvent;
import admin.view.AdminWelcome;
import java.awt.event.ActionListener;

public class AdminController implements ActionListener {

    private AdminLogin vistaLogin;

    public AdminController(AdminLogin vistaLogin) {
        this.vistaLogin = vistaLogin;
        this.vistaLogin.btnIngresar.addActionListener(this);
    }

    public void iniciar() {
        vistaLogin.setTitle("INICIAR SESION");
        vistaLogin.setLocationRelativeTo(null);
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
            } else {
                System.out.println("no");
            }
        }
    }
}
