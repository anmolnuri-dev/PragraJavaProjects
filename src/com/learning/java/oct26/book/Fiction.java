package com.learning.java.oct26.book;

public class Fiction extends Book {
    // Unique property for Fiction
    private String genre; // e.g., Fantasy, Sci-Fi, Mystery

    // Constructor
    public Fiction(String title, String author, String isbn, int numberOfPages, String genre) {
        super(title, author, isbn, numberOfPages); // Calling the constructor of Book
        this.genre = genre;
    }

    // Getter and Setter for genre
    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    // Overriding displayInfo to include genre
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Genre: " + genre);
    }
}

