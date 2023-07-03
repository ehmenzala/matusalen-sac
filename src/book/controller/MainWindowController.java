package book.controller;

import book.model.Book;
import book.model.BookQuery;
import book.model.BookShelf;
import book.view.MainWindow;
import javax.swing.JOptionPane;

public class MainWindowController {

    private MainWindow mainWindow;
    private BookShelf bookShelf;
    private Book[] searchResults = {};

    public MainWindowController(MainWindow mainWindow, BookShelf bookShelf) {
        this.mainWindow = mainWindow;
        this.bookShelf = bookShelf;
        setActionListeners();
    }

    public void showWindow() {
        mainWindow.setTitle("Ventana Principal");
        mainWindow.setLocationRelativeTo(null);
        mainWindow.setVisible(true);
    }

    private void setActionListeners() {

        mainWindow.onSearchClick((e) -> {
            System.out.println("Clcik en Search");
            BookQuery bq = new BookQuery(
                    mainWindow.getSearchType(),
                    mainWindow.getSearchTerm());
            searchResults = bookShelf.searchBook(bq);
            System.out.println("# SEARCH RESULTS");
            System.out.println("# SEARCH LENGHT: " + searchResults.length);
            for (Book book : searchResults) {
                System.out.println("> Title: " + book.getTitle());
            }
            mainWindow.createResultItems(searchResults);
        });

        mainWindow.onOrderClick((e) -> {
            String sortCriteria = mainWindow.getSearchType();

            if (searchResults.length != 0) {
                Book[] sortedResults = bookShelf.sortBooksByCriteria(searchResults, sortCriteria);
                mainWindow.createResultItems(sortedResults);
            } else {
                showErrorMessage(
                        "No se encontraron resultados de búsqueda",
                        "Error de ordenamiento");
            }
        });
        
    }

    private void showErrorMessage(String message, String title) {
        JOptionPane.showMessageDialog(null, message, title, JOptionPane.ERROR_MESSAGE);
    }
}
  
