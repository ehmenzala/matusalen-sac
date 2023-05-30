package book.model;

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
            case "título":
                searchResults = searchByTitle(searchTerm);
                break;
            case "autor":
                searchResults = searchByAuthor(searchTerm);
                break;
            case "género":
                searchResults = searchByGenre(searchTerm);
                break;
            case "no. páginas":
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
            String bookTitle = book.getTitle().toLowerCase();
            String searchTitle = searchTerm.toLowerCase();
            if (bookTitle.contains(searchTitle)) {
                searchResults.add(book);
            }
        }
        return searchResults.toArray(new Book[0]);
    }
    
    private Book[] searchByAuthor(String searchTerm) {
        ArrayList<Book> searchResults = new ArrayList<>();
        for (Book book : books) {
            String bookAuthor = book.getAuthor().toLowerCase();
            String searchAuthor = searchTerm.toLowerCase();
            if (bookAuthor.contains(searchAuthor)) {
                searchResults.add(book);
            }
        }
        return searchResults.toArray(new Book[0]);
    }
    
    private Book[] searchByGenre(String searchTerm) {
        ArrayList<Book> searchResults = new ArrayList<>();
        for (Book book : books) {
            String bookGenre = book.getGenre().toLowerCase();
            String searchGenre = searchTerm.toLowerCase();
            if (bookGenre.contains(searchGenre)) {
                searchResults.add(book);
            }
        }
        return searchResults.toArray(new Book[0]);
    }
    
    private Book[] searchByPages(String searchTerm) {
        int searchPages = Integer.parseInt(searchTerm);
        ArrayList<Book> searchResults = new ArrayList<>();
        for (Book book : books) {
            if (book.getNumberOfPages() >= searchPages) {
                searchResults.add(book);
            }
        }
        return searchResults.toArray(new Book[0]);
    }
}
