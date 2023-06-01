package admin.view;

import utilities.MetodoGeneral;

public class AdminLogin extends javax.swing.JFrame {

    public AdminLogin() {
        initComponents();
        
        MetodoGeneral.colocarImagen(lblBiblio, "./src/images/biblio.jpg");
        MetodoGeneral.colocarImagen(lblcorreo,"./src/images/correo.png" );
        MetodoGeneral.colocarImagen(lblpassword,"./src/images/contraseña.png");
        MetodoGeneral.colocarImagen(lblnegro, "./src/images/descargar.jpeg");
        MetodoGeneral.colocarImagen(lblmatusalen, "./src/images/matusalen-logo-dark.png");
        MetodoGeneral.colocarImagen(lblNombre, "./src/images/perfil.png");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        lblNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lblcorreo = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        lblmatusalen = new javax.swing.JLabel();
        btnIngresar = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        pswContraseña = new javax.swing.JPasswordField();
        lblpassword = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblBiblio = new javax.swing.JLabel();
        lblnegro = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 130, 30, 30));

        txtNombre.setBackground(new java.awt.Color(0, 0, 0));
        txtNombre.setForeground(new java.awt.Color(255, 255, 255));
        txtNombre.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        jPanel2.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 130, 210, 40));
        jPanel2.add(lblcorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 230, 30, 30));

        txtCorreo.setBackground(new java.awt.Color(0, 0, 0));
        txtCorreo.setForeground(new java.awt.Color(255, 255, 255));
        txtCorreo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoActionPerformed(evt);
            }
        });
        jPanel2.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 230, 210, 40));

        jSeparator3.setBackground(new java.awt.Color(0, 0, 255));
        jSeparator3.setForeground(new java.awt.Color(199, 160, 46));
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 170, 260, 10));

        jLabel4.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(199, 160, 46));
        jLabel4.setText("Nombre");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 80, 130, 40));

        lblmatusalen.setFont(new java.awt.Font("Rockwell Condensed", 0, 48)); // NOI18N
        lblmatusalen.setForeground(new java.awt.Color(255, 255, 0));
        lblmatusalen.setToolTipText("");
        jPanel2.add(lblmatusalen, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 325, 325));

        btnIngresar.setBackground(new java.awt.Color(199, 160, 46));
        btnIngresar.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        btnIngresar.setText("Ingresar");
        btnIngresar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.add(btnIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 390, 130, 40));

        jSeparator2.setForeground(new java.awt.Color(199, 160, 46));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 360, 260, 10));

        pswContraseña.setBackground(new java.awt.Color(0, 0, 0));
        pswContraseña.setForeground(new java.awt.Color(255, 255, 255));
        pswContraseña.setBorder(null);
        jPanel2.add(pswContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 320, 210, 40));
        jPanel2.add(lblpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 320, 30, 30));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 255));
        jSeparator1.setForeground(new java.awt.Color(199, 160, 46));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 270, 260, 10));

        jLabel2.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(199, 160, 46));
        jLabel2.setText("Correo Electrónico");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 180, 130, 40));

        jLabel3.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(199, 160, 46));
        jLabel3.setText("Contraseña");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 290, -1, -1));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Bodoni Bd BT", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(199, 160, 46));
        jLabel1.setText("Iniciar Sesión");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, 200, 50));
        jPanel2.add(lblBiblio, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 310, 450));
        jPanel2.add(lblnegro, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, 370, 450));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AdminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnIngresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    public javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lblBiblio;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblcorreo;
    private javax.swing.JLabel lblmatusalen;
    private javax.swing.JLabel lblnegro;
    private javax.swing.JLabel lblpassword;
    public javax.swing.JPasswordField pswContraseña;
    public javax.swing.JTextField txtCorreo;
    public javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
