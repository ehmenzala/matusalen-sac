package book.view;

import book.model.Book;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.awt.Image;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.ParallelGroup;
import javax.swing.GroupLayout.SequentialGroup;

public class MainWindow extends javax.swing.JFrame {

    public MainWindow() {
        initComponents();
        colocarImagen(lblWeAreHereImg, "./src/images/we-are-here.png");
        colocarImagen(lblOptionsImg, "./src/images/combo-options.png");
        colocarImagen(lblMiBusquedaImg, "./src/images/busqueda.png");
        colocarImagen(lblBtnBuscarImg, "./src/images/btn-buscar.png");
        colocarImagen(lblBtnOrdenarImg, "./src/images/btn-ordenar.png");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        pnlBuscar = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtSearchBox = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cbxCriteria = new javax.swing.JComboBox<>();
        btnOrder = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        resultsFrame = new javax.swing.JInternalFrame();
        resultsScrollPane = new javax.swing.JScrollPane();
        pnlResults = new javax.swing.JPanel();
        pnlNosotros = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        pnlTutorial = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblWeAreHereImg = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        lblOptionsImg = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        lblMiBusquedaImg = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        lblBtnBuscarImg = new javax.swing.JLabel();
        lblBtnOrdenarImg = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        pnlBuscar.setBackground(new java.awt.Color(102, 102, 102));
        pnlBuscar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("por");
        pnlBuscar.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, -1, -1));

        txtSearchBox.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        pnlBuscar.add(txtSearchBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 120, 30));

        jLabel2.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Búsqueda");
        pnlBuscar.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        cbxCriteria.setBackground(new java.awt.Color(51, 51, 51));
        cbxCriteria.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        cbxCriteria.setForeground(new java.awt.Color(255, 255, 255));
        cbxCriteria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Título", "Género", "Autor", "No. páginas" }));
        pnlBuscar.add(cbxCriteria, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, 110, 30));

        btnOrder.setBackground(new java.awt.Color(51, 51, 51));
        btnOrder.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        btnOrder.setForeground(new java.awt.Color(255, 255, 255));
        btnOrder.setText("Ordenar");
        btnOrder.setBorder(null);
        pnlBuscar.add(btnOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 20, 110, 30));

        btnSearch.setBackground(new java.awt.Color(51, 51, 51));
        btnSearch.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        btnSearch.setForeground(new java.awt.Color(255, 255, 255));
        btnSearch.setText("Buscar");
        btnSearch.setBorder(null);
        pnlBuscar.add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 20, 110, 30));

        resultsFrame.setBackground(new java.awt.Color(153, 153, 153));
        resultsFrame.setVisible(true);

        resultsScrollPane.setForeground(new java.awt.Color(204, 204, 204));

        pnlResults.setBackground(new java.awt.Color(204, 204, 204));
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

        pnlNosotros.setBackground(new java.awt.Color(237, 228, 219));
        pnlNosotros.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(227, 228, 219));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setText("Matusalén S.A.C.");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, -1, -1));

        jLabel22.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel22.setText("12345678901");
        jPanel3.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, -1, -1));

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel23.setText("¡Visita nuestra página web!");
        jPanel3.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));

        jLabel24.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel24.setText("«Ayudándote a fortalecer tu conocimiento»");
        jPanel3.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, -1, -1));

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel25.setText("• RUC:");
        jPanel3.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        jLabel26.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel26.setText("• Teléfono:");
        jPanel3.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        jLabel27.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel27.setText("+51 941887654");
        jPanel3.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, -1, -1));

        jLabel28.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel28.setText("• Dirección:");
        jPanel3.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        jLabel29.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel29.setText("Av. José Larco 1301, Miraflores, Lima 15074, Perú");
        jPanel3.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, -1, -1));

        jLabel30.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(102, 102, 0));
        jLabel30.setText("<html><u>https://bibliotecamatusalen.com</u></html>");
        jPanel3.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, -1, -1));

        jLabel31.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel31.setText("• Correo:");
        jPanel3.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

        jLabel32.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel32.setText("Nuestra información:");
        jPanel3.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        jLabel33.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel33.setText("contacto@matusalenbib.com");
        jPanel3.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, -1, -1));
        jPanel3.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 170, 30));

        jScrollPane2.setViewportView(jPanel3);

        pnlNosotros.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 680, 410));

        jTabbedPane1.addTab("Nosotros", pnlNosotros);

        pnlTutorial.setBackground(new java.awt.Color(190, 219, 223));
        pnlTutorial.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        jPanel2.setBackground(new java.awt.Color(212, 231, 233));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("¿Cómo realizo mi búsqueda?");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("    criterio de búsqueda que haya utilizado) haga clic en el botón Ordenar.");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 670, -1, -1));
        jPanel2.add(lblWeAreHereImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 259, 61));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Esta es nuestra nueva herramienta de búsqueda. Te enseñaremos cómo utilizarla.");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("Nuestra herramienta consta de 3 pestañas.");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("• Búsqueda:");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setText("• Nosotros:");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel12.setText("Aquí encontraras información sobre nuestra empresa y contacto.");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, -1, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel13.setText("Aquí te mostrarmos brevemente cómo utilizar nuestr herramienta.");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, -1, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setText("• ¿Cómo usar?:");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel15.setText("¡Bienvenido(a)!");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel16.setText("En esta pestaña se realiza la búsqueda de libros");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, -1, -1));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel17.setText("1) Dirígete a la pestaña de Búsqueda.");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, -1, -1));
        jPanel2.add(lblOptionsImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 124, 140));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel18.setText("2) Escoge el criterio de búsqueda en la caja de opciones");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, -1, -1));
        jPanel2.add(lblMiBusquedaImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 540, 233, 62));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel19.setText("3) Digite en la caja de texto su búsqueda");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 510, -1, -1));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel20.setText("4) Haga clic en el botón Buscar y ¡Listo!");
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 610, -1, -1));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel21.setText("5) Si desea ordenar los resultados de búsqueda en forma ascendente (Dependiendo del");
        jPanel2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 650, -1, -1));
        jPanel2.add(lblBtnBuscarImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 600, 130, 48));
        jPanel2.add(lblBtnOrdenarImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 700, 127, 46));
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 750, 170, 30));

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
    
    public void onSearchClick(ActionListener listener) {
        btnSearch.addActionListener(listener);
    }
    
    public void onOrderClick(ActionListener listener) {
        btnOrder.addActionListener(listener);
    }

    public String getSearchTerm() {
        return txtSearchBox.getText().toLowerCase();
    }
    
    public String getSearchType() {
        return ((String) cbxCriteria.getSelectedItem()).toLowerCase();
    }

    public void createResultItems(Book[] books) {
        cleanResultEntries();
        
        GroupLayout pnlResultsLayout = new GroupLayout(pnlResults);
        ParallelGroup hResultados = pnlResultsLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false);
        SequentialGroup vResultados = pnlResultsLayout.createSequentialGroup();
        pnlResults.setLayout(pnlResultsLayout);
        
        int noOfItems = books.length;

        for (int i = 0; i < noOfItems; i++) {
            Book book = books[i];
            BookResultPanel resultItem;

            if (i == 0) {
                resultItem = new BookResultPanel(book, BookResultPanel.PanelType.LONG);
            } else {
                resultItem = new BookResultPanel(book, BookResultPanel.PanelType.DEFAULT);
            }

            if (i < noOfItems) {
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
                                .addGroup(hResultados) // HORIZONTAL GROUP
                                .addContainerGap(109, Short.MAX_VALUE))
        );

        pnlResultsLayout.setVerticalGroup(
                pnlResultsLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(vResultados) // VERTICAL GROUP
        );
    }
    
    private void cleanResultEntries() {
        pnlResults.removeAll();
        pnlResults.revalidate();
        pnlResults.repaint();
        
        resultsScrollPane.setViewportView(pnlResults);
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
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblBtnBuscarImg;
    private javax.swing.JLabel lblBtnOrdenarImg;
    private javax.swing.JLabel lblMiBusquedaImg;
    private javax.swing.JLabel lblOptionsImg;
    private javax.swing.JLabel lblWeAreHereImg;
    private javax.swing.JPanel pnlBuscar;
    private javax.swing.JPanel pnlNosotros;
    private javax.swing.JPanel pnlResults;
    private javax.swing.JPanel pnlTutorial;
    private javax.swing.JInternalFrame resultsFrame;
    private javax.swing.JScrollPane resultsScrollPane;
    private javax.swing.JTextField txtSearchBox;
    // End of variables declaration//GEN-END:variables
}
