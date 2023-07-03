package book.controller;

import book.view.BookDetail;
import java.awt.event.ActionListener;
import book.view.RequestDetails;
import java.awt.event.ActionEvent;

public class BookDetailController implements ActionListener{
    BookDetail vista;
    RequestDetails Re;

    public BookDetailController(BookDetail Bd){
        this.vista = Bd; 
        this.Re = new RequestDetails(); 
        this.vista.btnSolicitar.addActionListener(this);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.btnSolicitar) {  
            Re.setVisible(true);
        }
    }   
}
    