package book.view;

import book.model.Book;
import java.awt.Font;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.LayoutStyle;
import utilities.SolicitudFetcher;
import utilities.Solicitud;

public class BookResultPanel extends JPanel {

    private final Book book;
    private final PanelType panelType;

    private GroupLayout resultLayout;
    private JButton resultBtn;
    private JLabel resultTitle;
    private JLabel resultAuthor;

    public BookResultPanel(Book book, PanelType panelType) {
        this.book = book;
        this.panelType = panelType;
        initComponents();
    }

    public enum PanelType {
        LONG, DEFAULT;
    }

    private void initComponents() {

        resultBtn = new javax.swing.JButton();
        resultTitle = new javax.swing.JLabel();
        resultAuthor = new javax.swing.JLabel();
        resultLayout = new GroupLayout(this);
        this.setLayout(resultLayout);
        this.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        resultBtn.setFont(new Font("sansserif", 1, 24));
        resultBtn.setText("➡");
        resultTitle.setFont(new Font("sansserif", 1, 18));
        resultTitle.setText(book.getTitle());
        resultAuthor.setFont(new Font("sansserif", 2, 14));
        resultAuthor.setText(book.getAuthor());
        RequestDetails regisSoli = new RequestDetails(book);

        // Setup book detail view
        BookDetail bookDetail = new BookDetail(book);
        bookDetail.onSolicitarClick((e) -> {
            regisSoli.setVisible(true);
            bookDetail.setVisible(false);

        });

        // "Configurar la vista de detalles de la solicitud"
        regisSoli.onRegistrarClick((e) -> {
            String dniStr = regisSoli.txtDni.getText().trim();
            if (!dniStr.matches("\\d+")) {
                JOptionPane.showMessageDialog(null, "El DNI debe contener solo dígitos numéricos", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            int dni = Integer.parseInt(dniStr);
            if (String.valueOf(dni).length() != 8) {
                JOptionPane.showMessageDialog(null, "El DNI debe tener exactamente 8 dígitos", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            SolicitudFetcher sf = new SolicitudFetcher();
            Solicitud solicitud = new Solicitud(sf.createNewId(), book.getTitle(), "En espera", String.valueOf(dni));
            sf.createSolicitud(solicitud);
            JOptionPane.showMessageDialog(null, "SOLICITUD REGISTRADA CON ÉXITO");
            regisSoli.setVisible(false);
        });

        // Open book detail when button clicked
        resultBtn.addActionListener((e) -> bookDetail.setVisible(true));

        if (panelType == PanelType.LONG) {
            resultLayout.setHorizontalGroup(
                    resultLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(GroupLayout.Alignment.TRAILING, resultLayout.createSequentialGroup()
                                    .addGap(18, 18, 18)
                                    .addGroup(resultLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                            .addComponent(resultTitle)
                                            .addComponent(resultAuthor))
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 375, Short.MAX_VALUE)
                                    .addComponent(resultBtn)
                                    .addGap(17, 17, 17)));
        } else {
            resultLayout.setHorizontalGroup(
                    resultLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(GroupLayout.Alignment.TRAILING, resultLayout.createSequentialGroup()
                                    .addGap(18, 18, 18)
                                    .addGroup(resultLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                            .addComponent(resultTitle)
                                            .addComponent(resultAuthor))
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(resultBtn)
                                    .addGap(17, 17, 17)));
        }

        resultLayout.setVerticalGroup(
                resultLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(resultLayout.createSequentialGroup()
                                .addGroup(resultLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(resultLayout.createSequentialGroup()
                                                .addGap(30, 30, 30)
                                                .addComponent(resultBtn))
                                        .addGroup(resultLayout.createSequentialGroup()
                                                .addGap(20, 20, 20)
                                                .addComponent(resultTitle)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(resultAuthor)))
                                .addContainerGap(21, Short.MAX_VALUE))
        );
    }

}
