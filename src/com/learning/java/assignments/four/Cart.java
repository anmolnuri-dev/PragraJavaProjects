package com.learning.java.assignments.four;

import java.util.ArrayList;
import java.util.List;

public class Cart {

    List<Product> items;

    public Cart() {
        items = new ArrayList<>();
    }

    public void addProduct(Product product) {
        items.add(product);
        System.out.println(product.getName() + " added to the cart.");
    }

    public void removeProduct(Product product) {
        if (items.remove(product)) {
            System.out.println(product.getName() + " removed from the cart.");
        } else {
            System.out.println(product.getName() + " is not in the cart.");
        }
    }

    public Order checkout(Customer customer) {
        if (items.isEmpty()) {
            System.out.println("Cart is empty. Add items before checking out.");
            return null;
        }

        double totalAmount = 0;
        for (Product product : items) {
            totalAmount += product.getPrice();
        }

        // Create and return the order
        Order order = new Order(customer, new ArrayList<>(items), totalAmount);
        items.clear(); // Clear the cart after checkout
        return order;
    }

    public void displayCart() {
        if (items.isEmpty()) {
            System.out.println("Your cart is empty.");
        } else {
            for (Product product : items) {
                System.out.println(product.getName() + " - $" + product.getPrice());
            }
        }
    }
}

