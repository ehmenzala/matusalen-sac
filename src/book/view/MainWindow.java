package book.view;

import book.model.Book;
import book.model.Book;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.awt.Image;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JLabel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.ParallelGroup;
import javax.swing.GroupLayout.SequentialGroup;

public class MainWindow extends javax.swing.JFrame {

    public MainWindow() {
        initComponents();
        colocarImagen(lblTutorialImage, "./src/images/tutorial-image.png");
        createResultItems();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        pnlBuscar = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cbxCriteria = new javax.swing.JComboBox<>();
        btnOrder = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        resultsFrame = new javax.swing.JInternalFrame();
        resultsScrollPane = new javax.swing.JScrollPane();
        pnlResults = new javax.swing.JPanel();
        pnlNosotros = new javax.swing.JPanel();
        pnlTutorial = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        lblTutorialImage = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        pnlBuscar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel1.setText("por");
        pnlBuscar.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, -1, -1));
        pnlBuscar.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 120, 30));

        jLabel2.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel2.setText("Búsqueda");
        pnlBuscar.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        cbxCriteria.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        cbxCriteria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Título", "Género", "Autor", "No. páginas" }));
        pnlBuscar.add(cbxCriteria, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, 110, 30));

        btnOrder.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        btnOrder.setText("Ordenar");
        pnlBuscar.add(btnOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 20, 110, 30));

        btnSearch.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        btnSearch.setText("Buscar");
        pnlBuscar.add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 20, 110, 30));

        resultsFrame.setVisible(true);

        pnlResults.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout pnlResultsLayout = new javax.swing.GroupLayout(pnlResults);
        pnlResults.setLayout(pnlResultsLayout);
        pnlResultsLayout.setHorizontalGroup(
            pnlResultsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 703, Short.MAX_VALUE)
        );
        pnlResultsLayout.setVerticalGroup(
            pnlResultsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 438, Short.MAX_VALUE)
        );

        resultsScrollPane.setViewportView(pnlResults);

        javax.swing.GroupLayout resultsFrameLayout = new javax.swing.GroupLayout(resultsFrame.getContentPane());
        resultsFrame.getContentPane().setLayout(resultsFrameLayout);
        resultsFrameLayout.setHorizontalGroup(
            resultsFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(resultsFrameLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(resultsScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 652, Short.MAX_VALUE))
        );
        resultsFrameLayout.setVerticalGroup(
            resultsFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(resultsFrameLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(resultsScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pnlBuscar.add(resultsFrame, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 670, 370));

        jTabbedPane1.addTab("Buscar", pnlBuscar);

        javax.swing.GroupLayout pnlNosotrosLayout = new javax.swing.GroupLayout(pnlNosotros);
        pnlNosotros.setLayout(pnlNosotrosLayout);
        pnlNosotrosLayout.setHorizontalGroup(
            pnlNosotrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 680, Short.MAX_VALUE)
        );
        pnlNosotrosLayout.setVerticalGroup(
            pnlNosotrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 428, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Nosotros", pnlNosotros);

        pnlTutorial.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTutorialImage.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel2.add(lblTutorialImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 493, 310));

        jLabel3.setText("acuerdo a sus preferencias. ¡Esperamos que disfrute de su estadía en la biblioteca!");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 380, -1, -1));

        jLabel4.setText("Para utilizar al máximo nuestra aplicación, debe dirigirse hacia la pestaña de búsqueda");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 340, -1, -1));

        jLabel5.setText("(Según lo indica la imagen superior). Luego de eso, puede realizar su búsqueda de");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 360, -1, -1));

        jScrollPane1.setViewportView(jPanel2);

        pnlTutorial.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 680, 420));

        jTabbedPane1.addTab("¿Cómo usar?", pnlTutorial);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 459, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindow().setVisible(true);
            }
        });
    }

    private void colocarImagen(JLabel lbl, String ruta) {
        ImageIcon image = new ImageIcon(ruta);
        Icon icono = new ImageIcon(image.getImage().getScaledInstance(lbl.getWidth(), lbl.getHeight(), Image.SCALE_DEFAULT));
        lbl.setIcon(icono);
        this.repaint();
    }

    public void createResultItems() {
        GroupLayout pnlResultsLayout = new GroupLayout(pnlResults);
        ParallelGroup hResultados = pnlResultsLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false);
        SequentialGroup vResultados = pnlResultsLayout.createSequentialGroup();
        pnlResults.setLayout(pnlResultsLayout);
        
        ArrayList<Book> books = new ArrayList<>(Arrays.asList(
                new Book(1, "The One Thing", "Gary Keller", "Self-development", 271, 2011, "English", "1-8888-8888-8", 5, "Este es un fragmento"),
                new Book(2, "Cien años de soledad", "No sé quien", "Self-development", 271, 2011, "English", "1-8888-8888-8", 5, "Este es un fragmento"),
                new Book(3, "Poder sin Límites", "Anthony Robbins", "Self-development", 271, 2011, "English", "1-8888-8888-8", 5, "Este es un fragmento"),
                new Book(4, "Amor en tiempos de cólera", "Gabrial García Márquez", "Self-development", 271, 2011, "English", "1-8888-8888-8", 5, "Este es un fragmento"),
                new Book(5, "Sálvense quien pueda", "Andres Oppenheimer", "Self-development", 271, 2011, "English", "1-8888-8888-8", 5, "Este es un fragmento"),
                new Book(6, "Originales", "Adam Grant", "Self-development", 271, 2011, "English", "1-8888-8888-8", 5, "Este es un fragmento"),
                new Book(7, "El Espía del Inca", "Dummet", "Self-development", 271, 2011, "English", "1-8888-8888-8", 5, "Este es un fragmento"),
                new Book(8, "Deep Work", "Cal Newport", "Self-development", 271, 2011, "English", "1-8888-8888-8", 5, "Este es un fragmento")
        ));
        
        int numItems = books.size();

        for (int i = 0; i < numItems; i++) {
            Book book = books.get(i);
            BookResultPanel resultItem;
            
            if (i == 0) {
                resultItem = new BookResultPanel(book, BookResultPanel.PanelType.LONG);
            } else {
                resultItem = new BookResultPanel(book, BookResultPanel.PanelType.DEFAULT);
            }

            if (i < numItems) {
                if ( i == 0) {
                    vResultados.addGap(16, 16, 16)
                        .addComponent(resultItem, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(16, Short.MAX_VALUE);
                } else {
                    vResultados.addComponent(resultItem, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(16, Short.MAX_VALUE);
                }
                hResultados.addComponent(resultItem, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE);
                

            } else {
                hResultados.addComponent(resultItem, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE);
                vResultados.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(resultItem, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(110, Short.MAX_VALUE);
            }

        }

        pnlResultsLayout.setHorizontalGroup(
                pnlResultsLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(pnlResultsLayout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addGroup(hResultados)
                                .addContainerGap(109, Short.MAX_VALUE))
        );

        pnlResultsLayout.setVerticalGroup(
                pnlResultsLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(vResultados)
        );
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOrder;
    private javax.swing.JButton btnSearch;
    private javax.swing.JComboBox<String> cbxCriteria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblTutorialImage;
    private javax.swing.JPanel pnlBuscar;
    private javax.swing.JPanel pnlNosotros;
    private javax.swing.JPanel pnlResults;
    private javax.swing.JPanel pnlTutorial;
    private javax.swing.JInternalFrame resultsFrame;
    private javax.swing.JScrollPane resultsScrollPane;
    // End of variables declaration//GEN-END:variables
}
