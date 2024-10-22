package com.learning.java.assignments.two;

import java.util.Scanner;

public class ECommerceSalesAnalysis {

    int numOfItems = 7;
    String[] products;
    int[] productSales;

    public ECommerceSalesAnalysis(String[] products, int[] sales) {
        if (products.length == 0 || sales.length == 0 || sales.length != products.length) {
            System.out.println("Error: No products or sales are available");
        }
        this.products = products;
        this.productSales = sales;
    }

    public void searchProduct(String itemName) {
        int index = -1;
        for (int i = 0; i < numOfItems; i++) {
            if (products[i].equalsIgnoreCase(itemName)) {
                index = i;
                break;
            }
        }
        if(index != -1) {
            System.out.println("Product Name: " + products[index] + '\n' + "Total Sales: " + productSales[index]);
        }


        else{
                System.out.println( itemName + " was not found.");
        }
    }

    public static void main(String[] args) {

        String[] products = {
                "Laptop",
                "Smartphone",
                "Tablet",
                "Headphones",
                "Smartwatch",
                "Camera",
                "Printer"
        };
        int[] productSales = {120, 350, 200, 150, 100, 80, 60};

        // Create an instance of ECommerceSalesAnalysis
        ECommerceSalesAnalysis analysis = new ECommerceSalesAnalysis(products, productSales);

        // Create a scanner object to allow user input
        Scanner sc = new Scanner(System.in);
        String exit;

        do {
            // Ask the user to input a product name to search for
            System.out.println("Enter the product name to check sales:");
            String productName = sc.nextLine();

            // Call the method to search for the product
            analysis.searchProduct(productName);
            System.out.print("Did you want to continue? (Y/N): ");
            exit = sc.nextLine();
        }
        while (exit.equalsIgnoreCase("y"));


        sc.close();
    }
}
