package model;

public class Book {
    private String title;
    private String author;
    private String gender;
    private String language;
    private String isbn;
    private int publicDate;
    private int rating; // From 1 to 5
    private String fragment;

    public Book(String title, String author, String gender, String language, String isbn, int publicDate, int rating, String fragment) {
        this.title = title;
        this.author = author;
        this.gender = gender;
        this.language = language;
        this.isbn = isbn;
        this.publicDate = publicDate;
        this.rating = rating;
        this.fragment = fragment;
    }
    
    
}
