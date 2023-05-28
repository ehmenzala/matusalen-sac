package esteb;

import java.util.ArrayList;

public class BookShelf {

    private BookFetcher bf;
    private ArrayList<Book> books;

    public BookShelf() {
        bf = new BookFetcher();
        books = bf.readAllBooks();
    }
    
    /******************
    * CRUD OPERATIONS *
    ******************/

    public ArrayList<Book> getBooks() {
        return this.books;
    }

    public void addBook(Book book) {
        books.add(book);
        bf.createBook(book);
    }
    
    /********************
    * SEARCH OPERATIONS *
    ********************/
    
    /**
     * @param bookQuery la consulta de búsqueda de libro.
     * @return resultados de la búsqueda.
     */
    public Book[] searchBook(BookQuery bookQuery) {
        String searchType = bookQuery.getSearchType();
        String searchTerm = bookQuery.getSearchTerm();
        Book[] searchResults;
        
        switch (searchType) {
            case "title":
                searchResults = searchByTitle(searchTerm);
                break;
            case "author":
                searchResults = searchByAuthor(searchTerm);
                break;
            case "genre":
                searchResults = searchByGenre(searchTerm);
                break;
            case "numberOfPages":
                searchResults = searchByPages(searchTerm);
                break;
            default:
                throw new AssertionError();
        }
        
        return searchResults;
        
    }
    
    public Book searchById(String id) {
        int searchId = Integer.parseInt(id);
        for (Book book: books) {
            if (book.getId() == searchId) {
                return book;
            }
        }
        return null;
    }
    
    private Book[] searchByTitle(String searchTerm) {
        ArrayList<Book> searchResults = new ArrayList<>();
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(searchTerm)) {
                searchResults.add(book);
            }
        }
        return (Book[]) searchResults.toArray();
    }
    
    private Book[] searchByAuthor(String searchTerm) {
        ArrayList<Book> searchResults = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthor().equalsIgnoreCase(searchTerm)) {
                searchResults.add(book);
            }
        }
        return (Book[]) searchResults.toArray();
    }
    
    private Book[] searchByGenre(String searchTerm) {
        ArrayList<Book> searchResults = new ArrayList<>();
        for (Book book : books) {
            if (book.getGenre().equalsIgnoreCase(searchTerm)) {
                searchResults.add(book);
            }
        }
        return (Book[]) searchResults.toArray();
    }
    
    private Book[] searchByPages(String searchTerm) {
        int searchPages = Integer.parseInt(searchTerm);
        ArrayList<Book> searchResults = new ArrayList<>();
        for (Book book : books) {
            if (book.getNumberOfPages() == searchPages) {
                searchResults.add(book);
            }
        }
        return (Book[]) searchResults.toArray();
    }
}
