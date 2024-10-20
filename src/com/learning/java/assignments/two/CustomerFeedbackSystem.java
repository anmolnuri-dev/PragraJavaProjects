package com.learning.java.assignments.two;

import java.util.Scanner;

public class CustomerFeedbackSystem {

    int numOfReviews = 5;
    String[] reviews;

    public CustomerFeedbackSystem(String[] reviews) {
        if (reviews.length == numOfReviews) {
            this.reviews = reviews;
        } else {
            System.out.println("Error: The number of reviews provided does not match the expected size in the Customer Review System.");
        }
    }

    public String[] search(String keyword) {
        int count = 0; //Number of reviews that contain the keywords
        for (int i = 0; i < numOfReviews; i++) {
            if (reviews[i].toLowerCase().contains(keyword.toLowerCase())) {
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Error: " + keyword + " match result found in the Customer Feedback.");
            return new String[0];
        }
        String[] matches = new String[count]; //Created an array size of the number of matches
        int index = 0;
        for (int i = 0; i < numOfReviews; i++) {
            if (reviews[i].toLowerCase().contains(keyword.toLowerCase())) {
                matches[index] = reviews[i];
                index++;
            }
        }
        return matches;
    }

    public void display() {
        System.out.println("Customer Reviews:");
        for (String s : reviews) {
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        // Sample destinations
        String[] reviews = {"Amazing Pasta", "Great Atmosphere", "Fantastic food", "Bad light", "Exceptional Service"};

        // Creating an instance for a Sample restaurant
        CustomerFeedbackSystem swissChalet = new CustomerFeedbackSystem(reviews);

        // Displaying available reviews
        swissChalet.display();

    }
}
