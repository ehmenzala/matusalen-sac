package admin.view;

import utilities.MetodoGeneral;
import java.awt.event.ActionListener;

public class AdminManagement extends javax.swing.JFrame {

    public AdminManagement() {
        initComponents();
        this.setLocationRelativeTo(null);
        MetodoGeneral.colocarImagen(lblModificar, "./src/images/modificar.png");
        MetodoGeneral.colocarImagen(lblAgregar, "./src/images/agregar.png");
        MetodoGeneral.colocarImagen(lblEliminar, "./src/images/eliminar.png");
        MetodoGeneral.colocarImagen(lblLimpiar, "./src/images/limpiar.png");
        MetodoGeneral.colocarImagen(lblFondo, "./src/images/bibliofondo.jpg");
        MetodoGeneral.colocarImagen(lblFondo3, "./src/images/bibliofondo.jpg");
        MetodoGeneral.colocarImagen(lblBuscar, "./src/images/buscar.png");
        MetodoGeneral.colocarImagen(lblFondoFrag, "./src/images/bibliofondo.jpg");
        txtFragmento.setBackground(new java.awt.Color(0,0,0,150));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        txtAutor = new javax.swing.JTextField();
        txtTitulo = new javax.swing.JTextField();
        txtGenero = new javax.swing.JTextField();
        txtPaginas = new javax.swing.JTextField();
        txtAnio = new javax.swing.JTextField();
        txtID = new javax.swing.JTextField();
        txtRating = new javax.swing.JTextField();
        txtISBN = new javax.swing.JTextField();
        txtIdioma = new javax.swing.JTextField();
        lblEliminar = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        lblAgregar = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        lblLimpiar = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JButton();
        lblModificar = new javax.swing.JLabel();
        btnModificar = new javax.swing.JButton();
        lblZonaAdmin = new javax.swing.JLabel();
        lblFondo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblBuscar = new javax.swing.JLabel();
        btnBuscarId = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        lblFondo3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        txtFragmento = new javax.swing.JTextField();
        lblFondoFrag = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(0, 0, 0, 200));

        txtAutor.setBackground(new java.awt.Color(36, 35, 35));
        txtAutor.setForeground(new java.awt.Color(255, 255, 255));
        txtAutor.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Autor", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(255, 255, 0))); // NOI18N

        txtTitulo.setBackground(new java.awt.Color(36, 35, 35));
        txtTitulo.setForeground(new java.awt.Color(255, 255, 255));
        txtTitulo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Título", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(255, 255, 0))); // NOI18N

        txtGenero.setBackground(new java.awt.Color(36, 35, 35));
        txtGenero.setForeground(new java.awt.Color(255, 255, 255));
        txtGenero.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Género", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(255, 255, 0))); // NOI18N

        txtPaginas.setBackground(new java.awt.Color(36, 35, 35));
        txtPaginas.setForeground(new java.awt.Color(255, 255, 255));
        txtPaginas.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "N° Páginas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(255, 255, 0))); // NOI18N

        txtAnio.setBackground(new java.awt.Color(36, 35, 35));
        txtAnio.setForeground(new java.awt.Color(255, 255, 255));
        txtAnio.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Año de publicación", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(255, 255, 0))); // NOI18N

        txtID.setEditable(false);
        txtID.setBackground(new java.awt.Color(36, 35, 35));
        txtID.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtID.setForeground(new java.awt.Color(255, 255, 255));
        txtID.setText("200");
        txtID.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ID", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(255, 255, 0))); // NOI18N
        txtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDActionPerformed(evt);
            }
        });

        txtRating.setBackground(new java.awt.Color(36, 35, 35));
        txtRating.setForeground(new java.awt.Color(255, 255, 255));
        txtRating.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Rating", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(255, 255, 0))); // NOI18N

        txtISBN.setBackground(new java.awt.Color(36, 35, 35));
        txtISBN.setForeground(new java.awt.Color(255, 255, 255));
        txtISBN.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ISBN", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(255, 255, 0))); // NOI18N

        txtIdioma.setBackground(new java.awt.Color(36, 35, 35));
        txtIdioma.setForeground(new java.awt.Color(255, 255, 255));
        txtIdioma.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Idioma", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(255, 255, 0))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(txtISBN, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtRating, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtTitulo, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtAnio)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 6, Short.MAX_VALUE))
                            .addComponent(txtGenero, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAutor)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGap(0, 5, Short.MAX_VALUE)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPaginas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtIdioma, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(txtID))
                    .addComponent(txtAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPaginas, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAnio, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIdioma, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtISBN, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRating, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 330, 440));
        jPanel1.add(lblEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 550, 30, 30));

        btnEliminar.setBackground(new java.awt.Color(0, 0, 0, 100));
        btnEliminar.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Eliminar", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 10), new java.awt.Color(255, 255, 255))); // NOI18N
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 530, 70, 60));
        jPanel1.add(lblAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 550, 30, 30));

        btnAgregar.setBackground(new java.awt.Color(0, 0, 0, 100));
        btnAgregar.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Agregar", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 10), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 530, 60, 60));
        jPanel1.add(lblLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 550, 30, 30));

        btnLimpiar.setBackground(new java.awt.Color(0, 0, 0, 100));
        btnLimpiar.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Limpiar", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 10), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 530, 60, 60));
        jPanel1.add(lblModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 550, 40, 30));

        btnModificar.setBackground(new java.awt.Color(0, 0, 0, 100));
        btnModificar.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Modificar", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 10), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 530, 70, 60));

        lblZonaAdmin.setFont(new java.awt.Font("Tahoma", 3, 22)); // NOI18N
        lblZonaAdmin.setForeground(new java.awt.Color(102, 255, 255));
        lblZonaAdmin.setText("\"Zona de Administración\"");
        jPanel1.add(lblZonaAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 300, 40));

        lblFondo.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jPanel1.add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 370, 700));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Detalle", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 255, 255));
        jLabel1.setText("\" LISTADO DE LIBROS \"");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 300, 40));
        jPanel2.add(lblBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 30, 20, 20));

        btnBuscarId.setBackground(new java.awt.Color(0, 0, 0, 100));
        btnBuscarId.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnBuscarId.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscarId.setText("Buscar por ID");
        btnBuscarId.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel2.add(btnBuscarId, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 20, 140, 40));

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Título", "Autor", "Editorial", "Año", "ISBN", "Género"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 610, 210));
        jPanel2.add(lblFondo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 7, 604, 300));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Fragmento", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtFragmento.setBackground(new java.awt.Color(36, 35, 35));
        txtFragmento.setForeground(new java.awt.Color(255, 255, 255));
        txtFragmento.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Fragmento:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 21), new java.awt.Color(255, 255, 0))); // NOI18N
        jPanel4.add(txtFragmento, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 600, 250));
        jPanel4.add(lblFondoFrag, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 17, 604, 296));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 614, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 607, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDActionPerformed

    public String getId() {
        return this.txtID.getText();
    }
    
    public String getTitulo() {
        return this.txtTitulo.getText();
    }
    
    public String getAutor() {
        return this.txtAutor.getText();
    }
    
    public String getIdioma() {
        return this.txtIdioma.getText();
    }
    
    public String getAnio() {
        return this.txtAnio.getText();
    }
    
    public String getFragmento() {
        return this.txtFragmento.getText();
    }
    
    public String getISBN() {
        return this.txtISBN.getText();
    }
    
    public String getGenero() {
        return this.txtGenero.getText();
    }
    
    public String getRating() {
        return this.txtRating.getText();
    }
    
    public String getNumPaginas() {
        return this.txtPaginas.getText();
    }
    
    public void setId(String newData) {
        this.txtID.setText(newData);
    }
    
    public void setTitulo(String newData) {
        this.txtTitulo.setText(newData);
    }
    
    public void setAutor(String newData) {
        this.txtAutor.setText(newData);
    }
    
    public void setIdioma(String newData) {
        this.txtIdioma.setText(newData);
    }
    
    public void setAnio(String newData) {
        this.txtAnio.setText(newData);
    }
    
    public void setFragmento(String newData) {
        this.txtFragmento.setText(newData);
    }
    
    public void setISBN(String newData) {
        this.txtISBN.setText(newData);
    }
    
    public void setGenero(String newData) {
        this.txtGenero.setText(newData);
    }
    
    public void setRating(String newData) {
        this.txtRating.setText(newData);
    }
    
    public void setNumPaginas(String newData) {
        this.txtPaginas.setText(newData);
    }
    
    public void onModifyClick(ActionListener listener) {
        btnModificar.addActionListener(listener);
    }

    public void onDeleteClick(ActionListener listener) {
        btnEliminar.addActionListener(listener);
    }

    public void onAddClick(ActionListener listener) {
        btnAgregar.addActionListener(listener);
    }

    public void onCleanClick(ActionListener listener) {
        btnLimpiar.addActionListener(listener);
    }

    public void onSearchByIdClick(ActionListener listener) {
        btnBuscarId.addActionListener(listener);
    }

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
            java.util.logging.Logger.getLogger(AdminManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminManagement().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscarId;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblAgregar;
    private javax.swing.JLabel lblBuscar;
    private javax.swing.JLabel lblEliminar;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblFondo3;
    private javax.swing.JLabel lblFondoFrag;
    private javax.swing.JLabel lblLimpiar;
    private javax.swing.JLabel lblModificar;
    private javax.swing.JLabel lblZonaAdmin;
    private javax.swing.JTextField txtAnio;
    private javax.swing.JTextField txtAutor;
    private javax.swing.JTextField txtFragmento;
    private javax.swing.JTextField txtGenero;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtISBN;
    private javax.swing.JTextField txtIdioma;
    private javax.swing.JTextField txtPaginas;
    private javax.swing.JTextField txtRating;
    private javax.swing.JTextField txtTitulo;
    // End of variables declaration//GEN-END:variables
}
