package com.learning.java.oct26.book;

public class Main {
    public static void main(String[] args) {
        // Creating Fiction book instance
        Fiction fictionBook = new Fiction("Dune", "Frank Herbert", "9780441013593", 412, "Science Fiction");
        System.out.println("Fiction Book Details:");
        fictionBook.displayInfo();

        System.out.println();

        // Creating NonFiction book instance
        NonFiction nonFictionBook = new NonFiction("Sapiens", "Yuval Noah Harari", "9780062316097", 498, "History");
        System.out.println("NonFiction Book Details:");
        nonFictionBook.displayInfo();
    }