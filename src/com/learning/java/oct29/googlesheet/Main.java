package com.learning.java.oct29.googlesheet;

public class Main {

    public static void main(String[] args) {
        // Testing ReadOnlyLoginManager
        System.out.println("Testing ReadOnlyLoginManager:");
        ReadOnlyLoginManager readOnly = new ReadOnlyLoginManager("user1", "pass123");
        System.out.println("Username: " + readOnly.getUserName()); // Should print the username
        readOnly.setPassword("newpass123"); // Should deny write access
        System.out.println();

        // Testing WriteOnlyLoginManager
        System.out.println("Testing WriteOnlyLoginManager:");
        WriteOnlyLoginManager writeOnly = new WriteOnlyLoginManager("user2", "pass456");
        System.out.println("Username: " + writeOnly.getUserName()); // Should deny read access
        writeOnly.setPassword("newpass456"); // Should allow write access
        System.out.println();

        // Testing ReadWriteLoginManager
        System.out.println("Testing ReadWriteLoginManager:");
        ReadWriteLoginManager readWrite = new ReadWriteLoginManager("user3", "pass789");
        System.out.println("Username: " + readWrite.getUserName()); // Should print the username
        readWrite.setPassword("newpass789"); // Should allow write access
        System.out.println();

        // Testing login functionality
        System.out.println("Testing login with ReadWriteLoginManager:");
        readWrite.login("user3", "newpass789"); // Should authenticate successfully
        readWrite.login("user3", "wrongpass"); // Should fail authentication
    }

}
