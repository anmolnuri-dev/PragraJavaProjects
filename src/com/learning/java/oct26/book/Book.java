package com.learning.java.oct26.book;

public class Book {
     // Common properties for all books
     private String title;
     private String author;
     private String isbn;
     private int numberOfPages;

     // Constructor
     public Book(String title, String author, String isbn, int numberOfPages) {
          this.title = title;
          this.author = author;
          this.isbn = isbn;
          this.numberOfPages = numberOfPages;
     }

     // Getter and Setter methods
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

     public String getIsbn() {
          return isbn;
     }

     public void setIsbn(String isbn) {
          this.isbn = isbn;
     }

     public int getNumberOfPages() {
          return numberOfPages;
     }

     public void setNumberOfPages(int numberOfPages) {
          this.numberOfPages = numberOfPages;
     }

     // Common method for displaying book information
     public void displayInfo() {
          System.out.println("Title: " + title);
          System.out.println("Author: " + author);
          System.out.println("ISBN: " + isbn);
          System.out.println("Pages: " + numberOfPages);
     }
}
