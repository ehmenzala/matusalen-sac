package book.controller;

import author.model.AuthorGraphGenerator;
import book.model.Book;
import book.model.BookQuery;
import book.model.BookShelf;
import book.view.MainWindow;
import javax.swing.BoxLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class MainWindowController {

    private final MainWindow mainWindow;
    private final BookShelf bookShelf;
    private final AuthorGraphGenerator authorGraph;
    private Book[] searchResults = {};

    public MainWindowController(MainWindow mainWindow, BookShelf bookShelf, AuthorGraphGenerator authorGraph) {
        this.authorGraph = authorGraph;
        this.mainWindow = mainWindow;
        this.bookShelf = bookShelf;
        loadAuthors();
        setActionListeners();
    }

    public void showWindow() {
        mainWindow.setTitle("Ventana Principal");
        mainWindow.setLocationRelativeTo(null);
        mainWindow.setVisible(true);
    }

    private void setActionListeners() {

        mainWindow.onSearchClick((e) -> {
            BookQuery bq = new BookQuery(
                    mainWindow.getSearchType(),
                    mainWindow.getSearchTerm());
            searchResults = bookShelf.searchBook(bq);
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
    
    private void loadAuthors() {
        JPanel authorsPanel = mainWindow.getAuthorsPanel();
        authorsPanel.setLayout(new BoxLayout(authorsPanel, BoxLayout.Y_AXIS));;
        authorGraph.displayGraphOnJPnael(authorsPanel);
    }

    private void showErrorMessage(String message, String title) {
        JOptionPane.showMessageDialog(null, message, title, JOptionPane.ERROR_MESSAGE);
    }
}
  
