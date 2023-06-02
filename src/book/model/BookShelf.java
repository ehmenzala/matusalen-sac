package book.model;

import java.util.ArrayList;
import java.util.Arrays;
import utilities.Algorithms;

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
    
    // CREATE
    public void addBook(Book book) {
        books.add(book);
        bf.createBook(book);
        books = bf.readAllBooks(); // Updates the book ArrayList
    }
    
    // READ
    public Book getBook(int id) {
        int[] idArrays = new int[books.size()];
        for (int i = 0; i < books.size(); i++) {
            idArrays[i] = books.get(i).getId();
        }
        
        System.out.println("IDs ordenadas: " + Arrays.toString(idArrays));
        
        int foundBookIdIndex = Algorithms.binarySearch(idArrays, id);

        return books.get(foundBookIdIndex);
    }
    
    // UPDATE
    public void updateBook(Book toUpdateBook) {
        bf.updateBook(toUpdateBook);
        books = bf.readAllBooks(); // Updates the book ArrayList
    }
    
    // DELETE
    public void deleteBook(int id) {
        bf.deleteBook(id);
        books = bf.readAllBooks(); // Updates the book ArrayList
    }
    
    /******************
    * SORT OPERATIONS *
    ******************/
    
    /**
     * @param bookResults el arreglo de resultados obtenidos.
     * @param criteria el criterio de búsqueda (título, género, autor o no. páginas).
     * @return resultados de la búsqueda ordenados.
     */
    public Book[] sortBooksByCriteria (Book[] bookResults, String criteria) {
        Book[] sortedResults;
        
        switch (criteria) {
            case "título":
                sortedResults = sortByTitle(bookResults);
                break;
            case "autor":
                sortedResults = sortByAuthor(bookResults);
                break;
            case "género":
                sortedResults = sortByGenre(bookResults);
                break;
            case "no. páginas":
                sortedResults = sortByPages(bookResults);
                break;
            default:
                throw new AssertionError();
        }
        
        return sortedResults;
    }
    
    private Book[] sortByTitle(Book[] bookResults) {
        String[] titles = new String[bookResults.length];
        
        for (int i = 0; i < bookResults.length; i++) {
            titles[i] = bookResults[i].getTitle();
        }
        
        titles = Algorithms.shellSortStrings(titles);
        Book[] sortedBooks = new Book[bookResults.length];
        
        for (int i = 0; i < titles.length; i++) {
            for (Book bookResult : bookResults) {
               if (bookResult.getTitle().equals(titles[i])) {
                   sortedBooks[i] = bookResult;
                   break;
               }
            }
        }
        
        return sortedBooks;
    }
    
    private Book[] sortByAuthor(Book[] bookResults) {
        String[] authors = new String[bookResults.length];
        
        for (int i = 0; i < bookResults.length; i++) {
            authors[i] = bookResults[i].getAuthor();
        }
        
        authors = Algorithms.shellSortStrings(authors);
        Book[] sortedBooks = new Book[bookResults.length];
        
        for (int i = 0; i < authors.length; i++) {
            for (Book bookResult : bookResults) {
               if (bookResult.getAuthor().equals(authors[i])) {
                   sortedBooks[i] = bookResult;
                   break;
               }
            }
        }
        
        return sortedBooks;
    }
    
    private Book[] sortByGenre(Book[] bookResults) {
        String[] genres = new String[bookResults.length];
        
        for (int i = 0; i < bookResults.length; i++) {
            genres[i] = bookResults[i].getGenre();
        }
        
        genres = Algorithms.insertionSortStrings(genres);
        Book[] sortedBooks = new Book[bookResults.length];
        
        for (int i = 0; i < genres.length; i++) {
            for (Book bookResult : bookResults) {
               if (bookResult.getGenre().equals(genres[i])) {
                   sortedBooks[i] = bookResult;
                   break;
               }
            }
        }
        
        return sortedBooks;
    }
    
    private Book[] sortByPages(Book[] bookResults) {
        int[] pages = new int[bookResults.length];
        
        for (int i = 0; i < bookResults.length; i++) {
            pages[i] = bookResults[i].getNumberOfPages();
        }
        
        pages = Algorithms.quicksort(pages);
        Book[] sortedBooks = new Book[bookResults.length];
        
        for (int i = 0; i < pages.length; i++) {
            for (Book bookResult : bookResults) {
               if (bookResult.getNumberOfPages() == pages[i]) {
                   sortedBooks[i] = bookResult;
                   break;
               }
            }
        }
        
        return sortedBooks;
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
