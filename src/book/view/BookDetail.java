
package book.view;
//librerias
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import book.model.Book;
import utilities.MetodoGeneral;


public class BookDetail extends javax.swing.JFrame {
    
    public BookDetail(Book book) {
        initComponents();
        
        setLocationRelativeTo(null);
        setVisible(true);
        
        MetodoGeneral.colocarImagen(lblFondo, "./src/images/man-critico-book.jpg");
        MetodoGeneral.colocarImagen(lblStar, "./src/images/estrella-amar.png");
        
        // Cosas del textArea
        textArea.setEditable(false); //para evitar la edición del texto
        textArea.setLineWrap(true); // para ajustar el ancho de línea automáticamente
        textArea.setWrapStyleWord(true);//para que no dividan las palabras a lo loco
        
        // Metiendo la información en los label
        // El libro ahora se pasa por parámetro en el constructor (book)
        lblCtitulo.setText(book.getTitle());
        lblCautor.setText(book.getAuthor());
        lblCgenero.setText(book.getGenre());
        lblCidioma.setText(book.getLanguage());
        lblCisbn.setText(book.getIsbn());
        lblCanio.setText(String.valueOf(book.getPublishedDate()));
        lblCrating.setText(String.valueOf(book.getRating()));
        //el fragmento
        textArea.setText(book.getFragment());
        
    }
    

    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        lblFragmento = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        lblAutor = new javax.swing.JLabel();
        lblGenero = new javax.swing.JLabel();
        lblIdioma = new javax.swing.JLabel();
        lblISBN = new javax.swing.JLabel();
        lblAnio = new javax.swing.JLabel();
        lblRating = new javax.swing.JLabel();
        lblCrating = new javax.swing.JLabel();
        lblCtitulo = new javax.swing.JLabel();
        lblCautor = new javax.swing.JLabel();
        lblCgenero = new javax.swing.JLabel();
        lblCidioma = new javax.swing.JLabel();
        lblCisbn = new javax.swing.JLabel();
        lblCanio = new javax.swing.JLabel();
        lblStar = new javax.swing.JLabel();
        btnSolicitar = new javax.swing.JButton();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Libros Matusalen");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblFragmento.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblFragmento.setForeground(new java.awt.Color(255, 255, 0));
        lblFragmento.setText("FRAGMENTO");
        jPanel2.add(lblFragmento, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 160, 20));

        textArea.setColumns(20);
        textArea.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        textArea.setRows(5);
        jScrollPane1.setViewportView(textArea);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 340, 390));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, 360, 470));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitulo.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 0));
        lblTitulo.setText("TÍTULO :");
        jPanel3.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 80, 20));

        lblAutor.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblAutor.setForeground(new java.awt.Color(255, 255, 0));
        lblAutor.setText("AUTOR :");
        jPanel3.add(lblAutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 80, 20));

        lblGenero.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblGenero.setForeground(new java.awt.Color(255, 255, 0));
        lblGenero.setText("GÉNERO :");
        jPanel3.add(lblGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 90, 20));

        lblIdioma.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblIdioma.setForeground(new java.awt.Color(255, 255, 0));
        lblIdioma.setText("IDIOMA :");
        jPanel3.add(lblIdioma, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 90, 20));

        lblISBN.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblISBN.setForeground(new java.awt.Color(255, 255, 0));
        lblISBN.setText("ISBN :");
        jPanel3.add(lblISBN, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 60, 20));

        lblAnio.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblAnio.setForeground(new java.awt.Color(255, 255, 0));
        lblAnio.setText("AÑO:");
        jPanel3.add(lblAnio, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 50, 20));

        lblRating.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblRating.setForeground(new java.awt.Color(255, 255, 0));
        lblRating.setText("CALIFICACIÓN :");
        jPanel3.add(lblRating, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 150, 20));

        lblCrating.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblCrating.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.add(lblCrating, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 320, 30, 20));

        lblCtitulo.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblCtitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblCtitulo.setText("XXXXXXX");
        jPanel3.add(lblCtitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 180, 20));

        lblCautor.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblCautor.setForeground(new java.awt.Color(255, 255, 255));
        lblCautor.setText("XXXXXXXXXX");
        jPanel3.add(lblCautor, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 180, 20));

        lblCgenero.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblCgenero.setForeground(new java.awt.Color(255, 255, 255));
        lblCgenero.setText("XXXXXXXXXX");
        jPanel3.add(lblCgenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 170, 20));

        lblCidioma.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblCidioma.setForeground(new java.awt.Color(255, 255, 255));
        lblCidioma.setText("XXXXXXXXXX");
        jPanel3.add(lblCidioma, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 180, 20));

        lblCisbn.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblCisbn.setForeground(new java.awt.Color(255, 255, 255));
        lblCisbn.setText("XXXXXXXXXXXX");
        jPanel3.add(lblCisbn, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, 200, 20));

        lblCanio.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblCanio.setForeground(new java.awt.Color(255, 255, 255));
        lblCanio.setText("XXXXXX");
        jPanel3.add(lblCanio, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, 180, 20));

        lblStar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblStar.setForeground(new java.awt.Color(255, 255, 255));
        lblStar.setText("X");
        jPanel3.add(lblStar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 320, 20, 20));

        btnSolicitar.setBackground(new java.awt.Color(0, 0, 0));
        btnSolicitar.setForeground(new java.awt.Color(255, 255, 51));
        btnSolicitar.setText("SOLICITAR");
        jPanel3.add(btnSolicitar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 380, 110, 40));
        jPanel3.add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 470));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnSolicitar;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAnio;
    private javax.swing.JLabel lblAutor;
    private javax.swing.JLabel lblCanio;
    private javax.swing.JLabel lblCautor;
    private javax.swing.JLabel lblCgenero;
    private javax.swing.JLabel lblCidioma;
    private javax.swing.JLabel lblCisbn;
    private javax.swing.JLabel lblCrating;
    private javax.swing.JLabel lblCtitulo;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblFragmento;
    private javax.swing.JLabel lblGenero;
    private javax.swing.JLabel lblISBN;
    private javax.swing.JLabel lblIdioma;
    private javax.swing.JLabel lblRating;
    private javax.swing.JLabel lblStar;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextArea textArea;
    // End of variables declaration//GEN-END:variables
}
