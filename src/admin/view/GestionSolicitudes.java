package admin.view;

import java.awt.event.ActionListener;
import utilities.MetodoGeneral;

public class GestionSolicitudes extends javax.swing.JFrame {

    public GestionSolicitudes() {
        initComponents();
        setLocationRelativeTo(null);
        MetodoGeneral.colocarImagen(lblFondo, "./src/images/Pluma_moderna.jpg");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        lblSolidelibros = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        txtTitulo = new javax.swing.JTextField();
        btnRecargar = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnProcesar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSolicitudes = new javax.swing.JTable();
        lblFondo = new javax.swing.JLabel();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("GESTION DE SOLICITUDES");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblSolidelibros.setFont(new java.awt.Font("Segoe UI Emoji", 3, 18)); // NOI18N
        lblSolidelibros.setForeground(new java.awt.Color(255, 255, 0));
        lblSolidelibros.setText("Solicitud De Libros");
        jPanel1.add(lblSolidelibros, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, -1, -1));

        txtID.setBackground(new java.awt.Color(0, 0, 0));
        txtID.setForeground(new java.awt.Color(255, 255, 51));
        txtID.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ID", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Black", 1, 14), new java.awt.Color(255, 255, 51))); // NOI18N
        jPanel1.add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, 60, 60));

        txtTitulo.setBackground(new java.awt.Color(0, 0, 0));
        txtTitulo.setForeground(new java.awt.Color(255, 255, 51));
        txtTitulo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "LIBRO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Black", 1, 14), new java.awt.Color(255, 255, 0))); // NOI18N
        txtTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTituloActionPerformed(evt);
            }
        });
        jPanel1.add(txtTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, 140, 60));

        btnRecargar.setBackground(new java.awt.Color(0, 0, 0));
        btnRecargar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnRecargar.setForeground(new java.awt.Color(255, 255, 0));
        btnRecargar.setText("Recargar");
        jPanel1.add(btnRecargar, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 10, -1, 30));

        btnRegresar.setBackground(new java.awt.Color(0, 0, 0));
        btnRegresar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnRegresar.setForeground(new java.awt.Color(255, 255, 0));
        btnRegresar.setText("Regresar");
        jPanel1.add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 110, 30));

        btnBuscar.setBackground(new java.awt.Color(0, 0, 0));
        btnBuscar.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(255, 255, 0));
        btnBuscar.setText("BUSCAR");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 40, 150, 40));

        btnProcesar.setBackground(new java.awt.Color(0, 0, 0));
        btnProcesar.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        btnProcesar.setForeground(new java.awt.Color(255, 255, 51));
        btnProcesar.setText("PROCESAR");
        btnProcesar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcesarActionPerformed(evt);
            }
        });
        jPanel1.add(btnProcesar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 90, 150, 40));

        tblSolicitudes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblSolicitudes);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 560, 240));
        jPanel1.add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -90, 630, 500));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTituloActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
     }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnProcesarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcesarActionPerformed

    }//GEN-LAST:event_btnProcesarActionPerformed

    public void buscarPorID(ActionListener listener) {
        btnBuscar.addActionListener(listener);
    }

    public void recargarSoli(ActionListener listener) {
        btnRecargar.addActionListener(listener);
    }

    public void regresar(ActionListener listener) {
        btnRegresar.addActionListener(listener);
    }

    public void procesarSolicitud(ActionListener listener) {
        btnProcesar.addActionListener(listener);
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new GestionSolicitudes().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnBuscar;
    public javax.swing.JButton btnProcesar;
    private javax.swing.JButton btnRecargar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblSolidelibros;
    public javax.swing.JTable tblSolicitudes;
    public javax.swing.JTextField txtID;
    public javax.swing.JTextField txtTitulo;
    // End of variables declaration//GEN-END:variables
}
