package com.learning.java.assignments.two;

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
        System.out.println("\n");
    }

    private static void printSearchResults(String[] results, String keyword) {
        if (results.length == 0) {
            System.out.println("No reviews found that contain the keyword: '" + keyword + "'.");
        } else {
            System.out.println("Matching reviews:");
            for (String review : results) {
                System.out.println(review);
            }
        }
        System.out.println();  // Blank line for separation between tests
    }

    public static void main(String[] args) {
        String[] reviews = {
                "Great service and fast delivery",
                "Poor customer support experience",
                "Quality product but delivery was slow",
                "Excellent packaging and fast shipping",
                "Very happy with the product"
        };

        // Creating an instance for a Sample restaurant
        CustomerFeedbackSystem swissChalet = new CustomerFeedbackSystem(reviews);

        // Displaying available reviews
        swissChalet.display();

        // Test 1: Searching for "fast" keyword (expected 2 results)
        System.out.println("Test 1: Searching for 'fast'");
        String[] result = swissChalet.search("fast");
        printSearchResults(result, "fast");

        // Test 2: Searching for "customer" keyword (expected 2 results)
        System.out.println("Test 2: Searching for 'customer'");
        result = swissChalet.search("customer");
        printSearchResults(result, "customer");

        // Test 3: Searching for "product" keyword (expected 2 results)
        System.out.println("Test 3: Searching for 'product'");
        result = swissChalet.search("product");
        printSearchResults(result, "product");

        // Test 4: Searching for "excellent" keyword (expected 1 result)
        System.out.println("Test 4: Searching for 'excellent'");
        result = swissChalet.search("excellent");
        printSearchResults(result, "excellent");

        // Test 5: Searching for "horrible" keyword (expected 0 results)
        System.out.println("Test 5: Searching for 'horrible'");
        result = swissChalet.search("horrible");
        printSearchResults(result, "horrible");

        // Test 6: Case-insensitive search (Searching for "SERVICE", expected 1 result)
        System.out.println("Test 6: Searching for 'SERVICE'");
        result = swissChalet.search("SERVICE");
        printSearchResults(result, "SERVICE");
    }
}
