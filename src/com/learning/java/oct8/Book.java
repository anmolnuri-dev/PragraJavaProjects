package com.learning.java.oct8;

public class Book {
    String title;
    String author;

    public Book() {
        this.title = "Unknown";
        this.author = "Unknown";
    }

    public Book(String title) {
        this();
        this.title = title;

    }

    public Book(String title, String author) {
        this(title);
        this.author = author;
        this.title = title;
    }

    public void display() {
        System.out.println("Title: " + title );
        System.out.println("Author: " + author);
        System.out.println("");
    }

}
