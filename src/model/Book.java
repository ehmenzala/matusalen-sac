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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getPublicDate() {
        return publicDate;
    }

    public void setPublicDate(int publicDate) {
        this.publicDate = publicDate;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getFragment() {
        return fragment;
    }

    public void setFragment(String fragment) {
        this.fragment = fragment;
    }
    
    
    
}
