package esteb;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.awt.Image;
import javax.swing.JLabel;

public class MainWindow extends javax.swing.JFrame {

    public MainWindow() {
        initComponents();
        colocarImagen(lblTutorialImage, "./src/images/tutorial-image.png");
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
        resultOnePanel = new javax.swing.JPanel();
        resultOneBtn = new javax.swing.JButton();
        resultOneTitle = new javax.swing.JLabel();
        resultOneAuthor = new javax.swing.JLabel();
        resultTwoPanel = new javax.swing.JPanel();
        resultTwoBtn = new javax.swing.JButton();
        resultTwoTitle = new javax.swing.JLabel();
        resultTwoAuthor = new javax.swing.JLabel();
        resultThreePanel = new javax.swing.JPanel();
        resultThreeBtn = new javax.swing.JButton();
        resultThreeTitle = new javax.swing.JLabel();
        resultThreeAuthor = new javax.swing.JLabel();
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

        resultsScrollPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        pnlResults.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        resultOnePanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        resultOneBtn.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        resultOneBtn.setText("➡");

        resultOneTitle.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        resultOneTitle.setText("Deep Work");

        resultOneAuthor.setFont(new java.awt.Font("sansserif", 2, 14)); // NOI18N
        resultOneAuthor.setText("Cal Newport");

        javax.swing.GroupLayout resultOnePanelLayout = new javax.swing.GroupLayout(resultOnePanel);
        resultOnePanel.setLayout(resultOnePanelLayout);
        resultOnePanelLayout.setHorizontalGroup(
            resultOnePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, resultOnePanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(resultOnePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(resultOneTitle)
                    .addGroup(resultOnePanelLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(resultOneAuthor)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 404, Short.MAX_VALUE)
                .addComponent(resultOneBtn)
                .addGap(17, 17, 17))
        );
        resultOnePanelLayout.setVerticalGroup(
            resultOnePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(resultOnePanelLayout.createSequentialGroup()
                .addGroup(resultOnePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(resultOnePanelLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(resultOneBtn))
                    .addGroup(resultOnePanelLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(resultOneTitle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(resultOneAuthor)))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        resultTwoPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        resultTwoBtn.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        resultTwoBtn.setText("➡");

        resultTwoTitle.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        resultTwoTitle.setText("Deep Work");

        resultTwoAuthor.setFont(new java.awt.Font("sansserif", 2, 14)); // NOI18N
        resultTwoAuthor.setText("Cal Newport");

        javax.swing.GroupLayout resultTwoPanelLayout = new javax.swing.GroupLayout(resultTwoPanel);
        resultTwoPanel.setLayout(resultTwoPanelLayout);
        resultTwoPanelLayout.setHorizontalGroup(
            resultTwoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, resultTwoPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(resultTwoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(resultTwoTitle)
                    .addGroup(resultTwoPanelLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(resultTwoAuthor)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(resultTwoBtn)
                .addGap(17, 17, 17))
        );
        resultTwoPanelLayout.setVerticalGroup(
            resultTwoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(resultTwoPanelLayout.createSequentialGroup()
                .addGroup(resultTwoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(resultTwoPanelLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(resultTwoBtn))
                    .addGroup(resultTwoPanelLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(resultTwoTitle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(resultTwoAuthor)))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        resultThreePanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        resultThreeBtn.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        resultThreeBtn.setText("➡");

        resultThreeTitle.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        resultThreeTitle.setText("Deep Work");

        resultThreeAuthor.setFont(new java.awt.Font("sansserif", 2, 14)); // NOI18N
        resultThreeAuthor.setText("Cal Newport");

        javax.swing.GroupLayout resultThreePanelLayout = new javax.swing.GroupLayout(resultThreePanel);
        resultThreePanel.setLayout(resultThreePanelLayout);
        resultThreePanelLayout.setHorizontalGroup(
            resultThreePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, resultThreePanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(resultThreePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(resultThreeTitle)
                    .addGroup(resultThreePanelLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(resultThreeAuthor)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(resultThreeBtn)
                .addGap(17, 17, 17))
        );
        resultThreePanelLayout.setVerticalGroup(
            resultThreePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(resultThreePanelLayout.createSequentialGroup()
                .addGroup(resultThreePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(resultThreePanelLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(resultThreeBtn))
                    .addGroup(resultThreePanelLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(resultThreeTitle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(resultThreeAuthor)))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlResultsLayout = new javax.swing.GroupLayout(pnlResults);
        pnlResults.setLayout(pnlResultsLayout);
        pnlResultsLayout.setHorizontalGroup(
            pnlResultsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlResultsLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(pnlResultsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(resultTwoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(resultThreePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(resultOnePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(109, Short.MAX_VALUE))
        );
        pnlResultsLayout.setVerticalGroup(
            pnlResultsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlResultsLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(resultOnePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(resultTwoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(resultThreePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(110, Short.MAX_VALUE))
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
    private javax.swing.JLabel resultOneAuthor;
    private javax.swing.JButton resultOneBtn;
    private javax.swing.JPanel resultOnePanel;
    private javax.swing.JLabel resultOneTitle;
    private javax.swing.JLabel resultThreeAuthor;
    private javax.swing.JButton resultThreeBtn;
    private javax.swing.JPanel resultThreePanel;
    private javax.swing.JLabel resultThreeTitle;
    private javax.swing.JLabel resultTwoAuthor;
    private javax.swing.JButton resultTwoBtn;
    private javax.swing.JPanel resultTwoPanel;
    private javax.swing.JLabel resultTwoTitle;
    private javax.swing.JInternalFrame resultsFrame;
    private javax.swing.JScrollPane resultsScrollPane;
    // End of variables declaration//GEN-END:variables
}
