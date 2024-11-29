package com.learning.java.assignments.four;

public class Product {
    //Data Members
    private int productId;
    private String name;
    private double price;
    private int stockQuantity;

    //All Arg Constructor
    public Product(int productId, String name, double price, int stockQuantity) {
        this.productId = productId;
        this.name = name;

        // Ensure price and stockQuantity are non-negative
        if (price < 0) {
            throw new IllegalArgumentException("Price cannot be negative.");
        }
        if (stockQuantity < 0) {
            throw new IllegalArgumentException("Stock quantity cannot be negative.");
        }
        this.price = price;
        this.stockQuantity = stockQuantity;
    }

    //Getter and Setter Methods
    public int getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 0) {
            throw new IllegalArgumentException("Price cannot be negative.");
        }
        this.price = price;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(int stockQuantity) {
        if (stockQuantity < 0) {
            throw new IllegalArgumentException("Stock Quantity cannot be negative.");
        }
        this.stockQuantity = stockQuantity;
    }

    public boolean isAvailable(){
        return getStockQuantity() > 0;
    }

    @Override
    public String toString() {
        return name + " ($" + price + ")";
    }


}
