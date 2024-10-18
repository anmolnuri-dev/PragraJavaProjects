package com.learning.java.assignments.two;

import java.util.Scanner;

public class LibraryBookManagement {
    int numOfItems = 6;
    String [] bookArr;

    public LibraryBookManagement(String[] book) {
        if (book.length == numOfItems) {
            this.bookArr = book;
        }
        else {
            System.out.println("Error: The number of books provided does not match the expected inventory size.");
        }
    }

    public void searchBook(String bookName) {
        boolean found = false;
        for (String s : bookArr) {
            if (s.equalsIgnoreCase(bookName)) {
                System.out.println(s + " is available.");
                found = true;
                break;
            }
        }
        if(!found) {
            System.out.println(bookName + " is not available.");
        }
    }

    public void updateInventory(String existingBook, String replaceBook) {
        boolean found = false;
        for(int i = 0; i < bookArr.length; i++) {
            if(bookArr[i].equalsIgnoreCase(existingBook)) {
                bookArr[i] = replaceBook;
                found = true;
                System.out.println(existingBook + " has been replaced with " + replaceBook);
                break;
            }
        }
        if(!found) {
            System.out.println(existingBook + " was not found.");
        }
    }

    public void display(){
        System.out.println("Current Library Inventory:");
        for( String s : bookArr) {
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        String [] books = {"Game Of Thrones", "The Alchemist", "Harry Potter", "Crime and Punishment","Sapiens","Atomic Habits"};
        LibraryBookManagement mountPleasant = new LibraryBookManagement(books);

        //Searches if the book user inputted exists
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name of a book to search: " );
        String search = sc.nextLine();

        mountPleasant.searchBook(search);

        //Display the list of books in the library
        mountPleasant.display();

        System.out.print("Enter the name of the book you want to replace: " );
        String existing = sc.next();
        System.out.print("Enter the name of the book you want to replace: " );
        String replace = sc.next();

        //Replacing an existing book with a new book.
        mountPleasant.updateInventory(existing, replace);

        //Display the list of books after updating the inventory.
        mountPleasant.display();

        sc.close();
    }

}
