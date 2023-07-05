package book.view;

import utilities.MetodoGeneral;
import book.model.Book;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RequestDetails extends javax.swing.JFrame {

    public RequestDetails(Book book) {
        initComponents();
        setLocationRelativeTo(null);
        
        MetodoGeneral.colocarImagen(lblFondo, "./src/images/man-critico-book.jpg");
        
        // El libro ahora se pasa por parámetro en el constructor (book)
        lblCtitulo.setText(book.getTitle());
        lblCautor.setText(book.getAuthor());
        lblCgenero.setText(book.getGenre());
        lblCidioma.setText(book.getLanguage());
        lblCisbn.setText(book.getIsbn());
        lblCanio.setText(String.valueOf(book.getPublishedDate()));
        lblCrating.setText(String.valueOf(book.getRating()));
        MetodoGeneral.colocarImagen(lblStar, "./src/images/estrella-amar.png");
    }

    public RequestDetails(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public void onRegistrarClick(ActionListener listener) {
        btnRegistrarDni.addActionListener(listener);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtDni = new javax.swing.JTextField();
        lblDetalles = new javax.swing.JLabel();
        btnRegistrarDni = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        lblFondo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        lblCtitulo = new javax.swing.JLabel();
        lblAutor = new javax.swing.JLabel();
        lblCautor = new javax.swing.JLabel();
        lblGenero = new javax.swing.JLabel();
        lblCgenero = new javax.swing.JLabel();
        lblIdioma = new javax.swing.JLabel();
        lblCidioma = new javax.swing.JLabel();
        lblISBN = new javax.swing.JLabel();
        lblCisbn = new javax.swing.JLabel();
        lblAnio = new javax.swing.JLabel();
        lblCanio = new javax.swing.JLabel();
        lblRating = new javax.swing.JLabel();
        lblStar = new javax.swing.JLabel();
        lblCrating = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SOLICITUD");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtDni.setBackground(new java.awt.Color(36, 35, 35));
        txtDni.setForeground(new java.awt.Color(255, 255, 255));
        txtDni.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DNI ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Black", 1, 14), new java.awt.Color(255, 255, 0))); // NOI18N
        jPanel1.add(txtDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 160, 60));

        lblDetalles.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        lblDetalles.setForeground(new java.awt.Color(255, 255, 0));
        lblDetalles.setText("DETALLES");
        jPanel1.add(lblDetalles, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, -1, -1));

        btnRegistrarDni.setBackground(new java.awt.Color(0, 0, 0));
        btnRegistrarDni.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        btnRegistrarDni.setForeground(new java.awt.Color(0, 204, 102));
        btnRegistrarDni.setText("REGISTRAR");
        btnRegistrarDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarDniActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegistrarDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 120, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 204, 102));
        jLabel2.setText("Ingrese su DNI");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));
        jPanel1.add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 310));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 204, 102));
        jLabel1.setText("Detalles del Libro");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        lblTitulo.setBackground(new java.awt.Color(0, 255, 204));
        lblTitulo.setFont(new java.awt.Font("Segoe UI Black", 1, 10)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 0));
        lblTitulo.setText("TÍTULO :");
        jPanel2.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 80, 20));

        lblCtitulo.setBackground(new java.awt.Color(0, 255, 204));
        lblCtitulo.setFont(new java.awt.Font("Segoe UI Black", 1, 10)); // NOI18N
        lblCtitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblCtitulo.setText("XXXXXXX");
        jPanel2.add(lblCtitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 180, 20));

        lblAutor.setBackground(new java.awt.Color(0, 255, 204));
        lblAutor.setFont(new java.awt.Font("Segoe UI Black", 1, 10)); // NOI18N
        lblAutor.setForeground(new java.awt.Color(255, 255, 0));
        lblAutor.setText("AUTOR :");
        jPanel2.add(lblAutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 80, 20));

        lblCautor.setBackground(new java.awt.Color(0, 255, 204));
        lblCautor.setFont(new java.awt.Font("Segoe UI Black", 1, 10)); // NOI18N
        lblCautor.setForeground(new java.awt.Color(255, 255, 255));
        lblCautor.setText("XXXXXXXXXX");
        jPanel2.add(lblCautor, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 180, 20));

        lblGenero.setBackground(new java.awt.Color(0, 255, 204));
        lblGenero.setFont(new java.awt.Font("Segoe UI Black", 1, 10)); // NOI18N
        lblGenero.setForeground(new java.awt.Color(255, 255, 0));
        lblGenero.setText("GÉNERO :");
        jPanel2.add(lblGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 90, 20));

        lblCgenero.setBackground(new java.awt.Color(0, 255, 204));
        lblCgenero.setFont(new java.awt.Font("Segoe UI Black", 1, 10)); // NOI18N
        lblCgenero.setForeground(new java.awt.Color(255, 255, 255));
        lblCgenero.setText("XXXXXXXXXX");
        jPanel2.add(lblCgenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 170, 20));

        lblIdioma.setBackground(new java.awt.Color(0, 255, 204));
        lblIdioma.setFont(new java.awt.Font("Segoe UI Black", 1, 10)); // NOI18N
        lblIdioma.setForeground(new java.awt.Color(255, 255, 0));
        lblIdioma.setText("IDIOMA :");
        jPanel2.add(lblIdioma, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 90, 20));

        lblCidioma.setBackground(new java.awt.Color(0, 255, 204));
        lblCidioma.setFont(new java.awt.Font("Segoe UI Black", 1, 10)); // NOI18N
        lblCidioma.setForeground(new java.awt.Color(255, 255, 255));
        lblCidioma.setText("XXXXXXXXXX");
        jPanel2.add(lblCidioma, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 180, 20));

        lblISBN.setBackground(new java.awt.Color(0, 255, 204));
        lblISBN.setFont(new java.awt.Font("Segoe UI Black", 1, 10)); // NOI18N
        lblISBN.setForeground(new java.awt.Color(255, 255, 0));
        lblISBN.setText("ISBN :");
        jPanel2.add(lblISBN, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 60, 20));

        lblCisbn.setBackground(new java.awt.Color(0, 255, 204));
        lblCisbn.setFont(new java.awt.Font("Segoe UI Black", 1, 10)); // NOI18N
        lblCisbn.setForeground(new java.awt.Color(255, 255, 255));
        lblCisbn.setText("XXXXXXXXXXXX");
        jPanel2.add(lblCisbn, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, 200, 20));

        lblAnio.setBackground(new java.awt.Color(0, 255, 204));
        lblAnio.setFont(new java.awt.Font("Segoe UI Black", 1, 10)); // NOI18N
        lblAnio.setForeground(new java.awt.Color(255, 255, 0));
        lblAnio.setText("AÑO:");
        jPanel2.add(lblAnio, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 50, 20));

        lblCanio.setBackground(new java.awt.Color(0, 255, 204));
        lblCanio.setFont(new java.awt.Font("Segoe UI Black", 1, 10)); // NOI18N
        lblCanio.setForeground(new java.awt.Color(255, 255, 255));
        lblCanio.setText("XXXXXX");
        jPanel2.add(lblCanio, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, 180, 20));

        lblRating.setBackground(new java.awt.Color(0, 255, 204));
        lblRating.setFont(new java.awt.Font("Segoe UI Black", 1, 10)); // NOI18N
        lblRating.setForeground(new java.awt.Color(255, 255, 0));
        lblRating.setText("CALIFICACIÓN :");
        jPanel2.add(lblRating, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 150, 20));

        lblStar.setBackground(new java.awt.Color(0, 255, 204));
        lblStar.setFont(new java.awt.Font("Segoe UI Black", 1, 10)); // NOI18N
        lblStar.setForeground(new java.awt.Color(255, 255, 255));
        lblStar.setText("X");
        jPanel2.add(lblStar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 20, 20));

        lblCrating.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblCrating.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(lblCrating, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 20, 20));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 230, 310));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 310));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarDniActionPerformed

    }//GEN-LAST:event_btnRegistrarDniActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnRegistrarDni;
    public javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public javax.swing.JLabel lblAnio;
    public javax.swing.JLabel lblAutor;
    public javax.swing.JLabel lblCanio;
    public javax.swing.JLabel lblCautor;
    public javax.swing.JLabel lblCgenero;
    public javax.swing.JLabel lblCidioma;
    public javax.swing.JLabel lblCisbn;
    public javax.swing.JLabel lblCrating;
    public javax.swing.JLabel lblCtitulo;
    public javax.swing.JLabel lblDetalles;
    private javax.swing.JLabel lblFondo;
    public javax.swing.JLabel lblGenero;
    public javax.swing.JLabel lblISBN;
    public javax.swing.JLabel lblIdioma;
    public javax.swing.JLabel lblRating;
    private javax.swing.JLabel lblStar;
    public javax.swing.JLabel lblTitulo;
    public javax.swing.JTextField txtDni;
    // End of variables declaration//GEN-END:variables
}
