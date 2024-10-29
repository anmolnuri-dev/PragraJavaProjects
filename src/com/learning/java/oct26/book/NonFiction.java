package com.learning.java.oct26.book;

public class NonFiction extends Book {
    // Unique property for NonFiction
    private String subjectArea; // e.g., Science, History, Self-help

    // Constructor
    public NonFiction(String title, String author, String isbn, int numberOfPages, String subjectArea) {
        super(title, author, isbn, numberOfPages); // Calling the constructor of Book
        this.subjectArea = subjectArea;
    }

    // Getter and Setter for subjectArea
    public String getSubjectArea() {
        return subjectArea;
    }

    public void setSubjectArea(String subjectArea) {
        this.subjectArea = subjectArea;
    }

    // Overriding displayInfo to include subjectArea
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Subject Area: " + subjectArea);
    }
}