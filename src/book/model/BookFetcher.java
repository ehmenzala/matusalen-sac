package book.model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class BookFetcher {
    
    private final String FILE_PATH = "./src/db/books.psv";

    public BookFetcher() {
    }
    
    public int createNewId() {
        int maxNumber = 0;
        try {
            BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH));
            String line = reader.readLine();
            while (line != null) {
                String[] parts = line.split("\\|");
                int readNumber = Integer.parseInt(parts[0]);
                if (readNumber > maxNumber) {
                    maxNumber = readNumber;
                }
                line = reader.readLine();

            }
            System.out.println("MAX NUMBER: " + maxNumber);
            return maxNumber + 1;
        } catch (IOException e) {
            e.printStackTrace();
            return 0;
        }
    }

    public void createBook(Book book) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(FILE_PATH, true))) {
            String bookData = getBookDataString(book);
            writer.println(bookData);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<Book> readAllBooks() {
        ArrayList<Book> books = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;
            while ((line = reader.readLine()) != null) {
                Book book = parseBookData(line);
                books.add(book);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return books;
    }

    public void updateBook(Book updatedBook) {
        List<Book> books = readAllBooks();

        for (int i = 0; i < books.size(); i++) {
            Book book = books.get(i);
            if (book.getId() == updatedBook.getId()) {
                books.set(i, updatedBook);
                break;
            }
        }

        saveAllBooks(books);
    }

    public void deleteBook(int id) {
        List<Book> books = readAllBooks();

        for (int i = 0; i < books.size(); i++) {
            Book book = books.get(i);
            if (book.getId() == id) {
                books.remove(i);
                break;
            }
        }

        saveAllBooks(books);
    }

    /**
     * Sobreescribe el contenido del archivo <code>books.psv</code> con la nueva lista de libros
     * que se pase por parámetro.
     * <p>
     * Se suele llamar siempre que se manipulen los datos del archivo mencionado anteriormente para
     * asegurar la persistencia de los datos.
     * @param books la nueva lista de libros que será almacenada.
     */
    private void saveAllBooks(List<Book> books) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(FILE_PATH))) {
            for (Book book : books) {
                String bookData = getBookDataString(book);
                writer.println(bookData);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private String getBookDataString(Book book) {
        return String.format("%d|%s|%s|%s|%d|%d|%s|%s|%d|%s",
                book.getId(), book.getTitle(), book.getAuthor(), book.getGenre(), book.getNumberOfPages(),
                book.getPublishedDate(), book.getLanguage(), book.getIsbn(), book.getRating(), book.getFragment());
    }

    private Book parseBookData(String bookData) {
        String[] parts = bookData.split("\\|");
        int id = Integer.parseInt(parts[0]);
        String title = parts[1];
        String author = parts[2];
        String genre = parts[3];
        int numberOfPages = Integer.parseInt(parts[4]);
        int publishedDate = Integer.parseInt(parts[5]);
        String language = parts[6];
        String isbn = parts[7];
        int rating = Integer.parseInt(parts[8]);
        String fragment = parts[9];

        return new Book(id, title, author, genre, numberOfPages, publishedDate, language, isbn, rating, fragment);
    }
}