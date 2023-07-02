package admin.view;

import admin.controller.AdminController;
import java.awt.Image;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import utilities.MetodoGeneral;

public class AdminWelcome extends javax.swing.JFrame {
    
    public AdminWelcome() {
        initComponents();
        MetodoGeneral.colocarImagen(lblLibrosImg, "./src/images/old-books.jpg");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblAdminWelcome = new javax.swing.JLabel();
        btnEntrar = new javax.swing.JButton();
        btnSolicitudes = new javax.swing.JButton();
        lblLibrosImg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Welcome Adm");
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                formMouseExited(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Old English Text MT", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 0));
        jLabel1.setText("Matusalén S.A.C");
        jLabel1.setToolTipText("");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, -1, 80));

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("<html><div style='text-align: center;'>\"AYUDÁNDOTE A FORTALECER<br/>TU CONOCIMIENTO\"</div></html>");
        jLabel2.setFocusable(false);
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 380, 60));

        String nombre = "Juan xd";
        lblAdminWelcome.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        lblAdminWelcome.setForeground(new java.awt.Color(255, 255, 0));
        jPanel1.add(lblAdminWelcome, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, 310, 30));

        btnEntrar.setBackground(new java.awt.Color(255, 255, 51));
        btnEntrar.setText("PANEL ADMINISTRACIÓN");
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, -1, -1));

        btnSolicitudes.setBackground(new java.awt.Color(255, 255, 51));
        btnSolicitudes.setText("SOLICITUDES");
        btnSolicitudes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSolicitudesActionPerformed(evt);
            }
        });
        jPanel1.add(btnSolicitudes, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 240, -1, -1));

        lblLibrosImg.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(lblLibrosImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 330));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 330));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
        
    }//GEN-LAST:event_btnEntrarActionPerformed

    private void formMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_formMouseExited

    private void btnSolicitudesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSolicitudesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSolicitudesActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnEntrar;
    public javax.swing.JButton btnSolicitudes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JLabel lblAdminWelcome;
    private javax.swing.JLabel lblLibrosImg;
    // End of variables declaration//GEN-END:variables
}
