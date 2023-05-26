package esteb;

import java.awt.Font;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.LayoutStyle;

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

        if (panelType == PanelType.LONG) {
            System.out.println("LONG");
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
            System.out.println("DEFAULT");
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
