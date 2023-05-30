package book.controller;

import book.model.Book;
import book.model.BookQuery;
import book.model.BookShelf;
import book.view.MainWindow;

public class MainWindowController {
    
    private MainWindow mainWindow;
    private BookShelf bookShelf;
    
    public MainWindowController(MainWindow mainWindow, BookShelf bookShelf) {
        this.mainWindow = mainWindow;
        this.bookShelf = bookShelf;
        setActionListeners();
    }
    
    public void showWindow() {
        mainWindow.setVisible(true);
    }
    
    private void setActionListeners() {
        mainWindow.onSearchClick((e) -> {
            BookQuery bq = new BookQuery(
                    mainWindow.getSearchType(),
                    mainWindow.getSearchTerm());
            Book[] searchResults = bookShelf.searchBook(bq);
            mainWindow.createResultItems(searchResults);
        });
        
        mainWindow.onOrderClick((e) -> System.out.println("Click Order"));
    }
    
    // For demo only
    public static void main(String[] args) {
        
        MainWindow mainWindow = new MainWindow();
        BookShelf bs = new BookShelf();
        MainWindowController controller = new MainWindowController(mainWindow, bs);
        
        controller.showWindow();
    }
}
