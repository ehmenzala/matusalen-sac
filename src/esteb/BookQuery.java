package esteb;

public class BookQuery {
    
    private String searchType;
    private String searchTerm;

    public BookQuery(String searchType, String searchTerm) {
        this.searchType = searchType;
        this.searchTerm = searchTerm;
    }

    public String getSearchType() {
        return searchType;
    }

    public String getSearchTerm() {
        return searchTerm;
    }
}
