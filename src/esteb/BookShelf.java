package esteb;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class BookShelf {
    
    private static final String FILE_PATH = "./src/db/books.json";
    private List<Book> books = new ArrayList<>();
    
    public BookShelf() {
        readBooksFromJSON();
    }
    
    public List<Book> getBooks() {
        return this.books;
    }
    
    public void addBook(Book book) {
        addBookToJSON(book, FILE_PATH);
        addBookToList(book);
    }
    
    private void addBookToList(Book book) {
        books.add(book);
    }
    
    private void readBooksFromJSON() {

        try (Scanner scanner = new Scanner(new File(FILE_PATH))) {
            StringBuilder jsonContent = new StringBuilder();
            while (scanner.hasNextLine()) {
                jsonContent.append(scanner.nextLine());
            }

            String json = jsonContent.toString().trim();
            if (json.startsWith("[") && json.endsWith("]")) {
                json = json.substring(1, json.length() - 1);

                String[] bookEntries = json.split("\\{");
                for (String entry : bookEntries) {
                    if (!entry.trim().isEmpty()) {
                        String[] keyValuePairs = entry.split(",");
                        Book book = new Book();

                        for (String pair : keyValuePairs) {
                            String[] keyValue = pair.split(":");

                            if (keyValue.length == 2) {
                                String key = keyValue[0].trim();
                                String value = keyValue[1].trim();

                                if (key.equals("\"title\"")) {
                                    book.setTitle(removeQuotes(value));
                                } else if (key.equals("\"author\"")) {
                                    book.setAuthor(removeQuotes(value));
                                } else if (key.equals("\"genre\"")) {
                                    book.setGenre(removeQuotes(value));
                                } else if (key.equals("\"numberOfPages\"")) {
                                    book.setNumberOfPages(Integer.parseInt(value));
                                } else if (key.equals("\"publishDate\"")) {
                                    book.setPublishDate(Integer.parseInt(value));
                                } else if (key.equals("\"language\"")) {
                                    book.setLanguage(removeQuotes(value));
                                } else if (key.equals("\"ISBN\"")) {
                                    book.setIsbn(removeQuotes(value));
                                } else if (key.equals("\"rating\"")) {
                                    book.setRating(Integer.parseInt(value));
                                } else if (key.equals("\"fragment\"")) {
                                    book.setFragment(removeQuotes(value));
                                }
                            }
                        }

                        books.add(book);
                    }
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    
    private void addBookToJSON(Book book, String filename) {
        try (FileWriter fileWriter = new FileWriter(filename, true)) {
            // Create a JSON representation of the book
            String json = "{\"title\":\"" + escapeQuotes(book.getTitle()) + "\","
                    + "\"author\":\"" + escapeQuotes(book.getAuthor()) + "\","
                    + "\"genre\":\"" + escapeQuotes(book.getGenre()) + "\","
                    + "\"numberOfPages\":" + book.getNumberOfPages() + ","
                    + "\"publishDate\":" + book.getPublishDate() + ","
                    + "\"language\":\"" + escapeQuotes(book.getLanguage()) + "\","
                    + "\"ISBN\":\"" + escapeQuotes(book.getIsbn()) + "\","
                    + "\"rating\":" + book.getRating() + ","
                    + "\"fragment\":\"" + escapeQuotes(book.getFragment()) + "\"}";

            // Write the JSON representation to the file
            fileWriter.write("," + System.lineSeparator() + json);
            fileWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    private String removeQuotes(String value) {
        return value.replaceAll("\"", "").trim();
    }
    
    private String escapeQuotes(String value) {
        return value.replace("\"", "\\\"");
    }
    
    public static void main(String[] args) {
        BookShelf bs = new BookShelf();
        
        List<Book> myBooks = bs.getBooks();
        bs.addBook(new Book("Prueba", "AAAA", "aaASD", 777, 2014, "asdasdd", "1-6548-1255-9", 4, "Este es un fragmento"));
        
        for (Book book : myBooks) {
            System.out.println("Title: " + book.getTitle());
            System.out.println("Author: " + book.getAuthor());
            System.out.println("Genre: " + book.getGenre());
            System.out.println("Number of Pages: " + book.getNumberOfPages());
            System.out.println("Publish Date: " + book.getPublishDate());
            System.out.println("Language: " + book.getLanguage());
            System.out.println("ISBN: " + book.getIsbn());
            System.out.println("Rating: " + book.getRating());
            System.out.println("Fragment: " + book.getFragment());
            System.out.println();
        }
    }
}
