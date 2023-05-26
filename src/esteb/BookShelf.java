package esteb;

import java.util.ArrayList;

public class BookShelf {
    
    private BookRepository br;
    private ArrayList<Book> books;
    
    public BookShelf() {
        br = new BookRepository();
        books = br.readAllBooks();
    }
    
    public ArrayList<Book> getBooks() {
        return this.books;
    }
    
    public void addBook(Book book) {
        books.add(book);
        br.createBook(book);
    }
    
}
