package com.learning.java.assignments.two;

public class ProductInventoryManagement {
    public int numOfItems = 5;
    String[] products = new String[numOfItems];
    double [] prices = new double[numOfItems];

    public ProductInventoryManagement(String[] products, double[] prices) {
        this.products = products;
        this.prices = prices;
    }

    public void searchPrice(String product) {
        boolean found = false;
        for (int i = 0; i < products.length; i++) {
            if(products[i].equalsIgnoreCase(product)) {
                System.out.println("Product: " + products[i] + " = $" + prices[i]);
                found = true;
                break;
            }
        }
        if(!found) {
            System.out.println("Product not found.");
        }
    }

    public void display(){
        for(int i = 0; i < numOfItems ; i++) {
            System.out.println(products[i] + ": $" + prices[i]);
        }
    }

    public static void main(String[] args) {
        // Array of products
        String[] products = {"Laptop", "Smartphone", "Headphones", "Monitor", "Keyboard"};

        // Array of prices
        double[] prices = {999.99, 599.99, 199.99, 299.99, 49.99};
        ProductInventoryManagement amazon = new ProductInventoryManagement(products,prices);
        amazon.display();
        amazon.searchPrice("Laptop");//Return existing product's price
        amazon.searchPrice("Camera"); //Test product does not exist
    }
}
