package com.learning.java.oct8;

public class BookMain {
    public static void main(String[] args) {
        Book book = new Book();
        Book book2 = new Book("Shoe Dog");
        Book book3 = new Book("The Alchemist","Paulo Coelho");
        System.out.println("Book 1");
        book.display();
        System.out.println("Book 2");
        book2.display();
        System.out.println("Book 3");
        book3.display();
    }

}
