
package book.view;
//librerias
import java.awt.BorderLayout;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import book.model.Book;
import book.model.Book;


public class BookDetail extends javax.swing.JFrame {
    
    public BookDetail() {
        initComponents();
        colocarImagen(lblFondo, "./src/images/man-critico-book.jpg");
        colocarImagen(lblStar, "./src/images/estrella-amar.png");
        //cosas del textArea
        textArea.setEditable(false); //para evitar la edición del texto
        textArea.setLineWrap(true); // para ajustar el ancho de línea automáticamente 
        textArea.setWrapStyleWord(true);//pa que no divida las  palabras a lo loco
        //como se veria ejemplo supongo xdxd
        Book Libro1 = new Book(1, "Cien años de soledad", "Gabriel García Márquez", "Realismo mágico",
                        271, 1967, "Español", "9780307474728", 5,
                        "La abuela le había explicado que el mundo estaba cada día más cargado de peso, tanto que ya era difícil sostenerlo sobre las rodillas. La gente se desesperaba por no poder resistir su peso, y se hundía en la tierra hasta la cintura. Por eso había poca comunicación entre los pueblos: cuando alguien quería ir a otra parte tenía que llevarse consigo una buena cantidad del mundo para contrapesar el peso local. —Pero si todo el mundo hace lo mismo —objetó Úrsula. —Por eso es que hay tanta incomprensión —respondió la abuela.\" Este diálogo refleja el humor absurdo e imaginativo característico del estilo literario mágico-realista del autor colombiano. Además, muestra cómo incluso temas profundos como la incomunicación pueden ser tratados con una dosis saludable de humor surrealista en su obra maestra \"Cien años de soledad");
        //metiendolos en los label
        lblCtitulo.setText(Libro1.getTitle());
        lblCautor.setText(Libro1.getAuthor());
        lblCgenero.setText(Libro1.getGenre());
        lblCidioma.setText(Libro1.getLanguage());
        lblCisbn.setText(Libro1.getIsbn());
        lblCaño.setText(String.valueOf(Libro1.getPublishedDate()));
        lblCrating.setText(String.valueOf(Libro1.getRating()));
        //el fragmento
        textArea.setText(Libro1.getFragment());
        
                
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        lblFragmento = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        lblGenero = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        lblAño = new javax.swing.JLabel();
        lblISBN = new javax.swing.JLabel();
        lblIdioma = new javax.swing.JLabel();
        lblAutor = new javax.swing.JLabel();
        lblRating = new javax.swing.JLabel();
        lblCrating = new javax.swing.JLabel();
        lblCtitulo = new javax.swing.JLabel();
        lblCautor = new javax.swing.JLabel();
        lblCgenero = new javax.swing.JLabel();
        lblCidioma = new javax.swing.JLabel();
        lblCisbn = new javax.swing.JLabel();
        lblCaño = new javax.swing.JLabel();
        lblStar = new javax.swing.JLabel();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Libros Matusalen");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblFragmento.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblFragmento.setForeground(new java.awt.Color(255, 255, 0));
        lblFragmento.setText("FRAGMENTO");
        jPanel2.add(lblFragmento, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 130, 20));

        textArea.setColumns(20);
        textArea.setRows(5);
        jScrollPane1.setViewportView(textArea);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 340, 390));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, 360, 470));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblGenero.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblGenero.setForeground(new java.awt.Color(255, 255, 0));
        lblGenero.setText("GÉNERO :");
        jPanel3.add(lblGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 70, 20));

        lblTitulo.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 0));
        lblTitulo.setText("TÍTULO :");
        jPanel3.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 70, 20));

        lblAño.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblAño.setForeground(new java.awt.Color(255, 255, 0));
        lblAño.setText("AÑO:");
        jPanel3.add(lblAño, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 40, 20));

        lblISBN.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblISBN.setForeground(new java.awt.Color(255, 255, 0));
        lblISBN.setText("ISBN :");
        jPanel3.add(lblISBN, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 70, 20));

        lblIdioma.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblIdioma.setForeground(new java.awt.Color(255, 255, 0));
        lblIdioma.setText("IDIOMA :");
        jPanel3.add(lblIdioma, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 70, 20));

        lblAutor.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblAutor.setForeground(new java.awt.Color(255, 255, 0));
        lblAutor.setText("AUTOR :");
        jPanel3.add(lblAutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 70, 20));

        lblRating.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblRating.setForeground(new java.awt.Color(255, 255, 0));
        lblRating.setText("CALIFICACIÓN :");
        jPanel3.add(lblRating, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 130, 20));

        lblCrating.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblCrating.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.add(lblCrating, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 320, 30, 20));

        lblCtitulo.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblCtitulo.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.add(lblCtitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 200, 20));

        lblCautor.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblCautor.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.add(lblCautor, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 200, 20));

        lblCgenero.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblCgenero.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.add(lblCgenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 200, 20));

        lblCidioma.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblCidioma.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.add(lblCidioma, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, 200, 20));

        lblCisbn.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblCisbn.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.add(lblCisbn, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, 110, 20));

        lblCaño.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblCaño.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.add(lblCaño, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, 180, 20));
        jPanel3.add(lblStar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 320, 20, 20));
        jPanel3.add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 470));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 470));

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
            java.util.logging.Logger.getLogger(BookDetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BookDetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BookDetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BookDetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BookDetail().setVisible(true);
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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAutor;
    private javax.swing.JLabel lblAño;
    private javax.swing.JLabel lblCautor;
    private javax.swing.JLabel lblCaño;
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
