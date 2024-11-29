package com.learning.java.assignments.four;

import java.util.ArrayList;
import java.util.List;

public class Store {

    List<Product> products;
    List<User> users;
    List<Order> orders;

    public Store() {
        this.products = new ArrayList<>();
        this.users = new ArrayList<>();
        this.orders = new ArrayList<>();
    }

    public void registerProduct(Product product) {
        // Ensure no duplicate product IDs are registered
        for (Product existingProduct : products) {
            if (existingProduct.getProductId() == product.getProductId()) {
                System.out.println("Error: Product ID " + product.getProductId() + " already exists.");
                return;
            }
        }
        products.add(product);
        System.out.println("Product: \"" + product.getName() + "\" with price $" + product.getPrice() + " added to the store.");
    }

    public void registerUser(User user) {
        for (User existingUser : users) {
            if (existingUser.getUserId() == user.getUserId()) {
                throw new IllegalArgumentException("Error: User ID " + user.getUserId() + " already exists.");
            }
        }
        users.add(user);
        System.out.println("User: " + user.getName() + " registered as a " + user.getRole() + '.');
    }

    public void placeOrder(Order order) {
        // Deduct stock for each product in the order
        for (Product product : order.getProductList()) {
            for (Product storeProduct : products) {
                if (storeProduct.getProductId() == product.getProductId()) {
                    storeProduct.setStockQuantity(storeProduct.getStockQuantity() - 1);
                }
            }
        }

        // Add the order to store records
        orders.add(order);
        //Add customer's order history
        order.getCustomer().addOrder(order);

        System.out.println("Order placed successfully! Total amount: $" + order.getTotalAmount());
    }

    public void getOrderHistory(Customer customer) {
        for (Order orderHistory : customer.getOrderHistory()) {
            System.out.println("Order ID: " + orderHistory.getOrderId());
            System.out.println(orderHistory.getProductList());
        }
    }

    public void addProduct(Product product, Admin admin) {
        if (admin.getRole().equals("Admin")) {
            products.add(product);
            System.out.println(admin.getName() + " adds a new product " + "\"" +
                    product.getName() + "\"" + " with price $" + product.getPrice() + " added to the store.");
        } else {
            throw new IllegalArgumentException("Access denied: Only admins can add products.");
        }
    }

    public void removeProduct(int productId, Admin admin) {
        if (admin.getRole().equals("Admin")) {

            Product productToRemove = null;
            for (Product product : products) {
                if (product.getProductId() == productId) {
                    productToRemove = product;
                }
            }
            if (productToRemove != null) {
                products.remove(productToRemove);
                System.out.println(admin.getName() + " removes " + "\""
                        + productToRemove.getName() + "\"" + " from the inventory.");
            } else {
                System.out.println("Product with ID " + productId + " not found in the inventory.");
            }
        } else {
            throw new IllegalArgumentException("Access denied: Only admins can remove products.");
        }
    }

    public void updateProductStock(int productId, int newStock, Admin admin) {
        if (admin.getRole().equals("Admin")) {
            for (Product product : products) {
                if (product.getProductId() == productId) {
                    product.setStockQuantity(newStock);
                    System.out.println(admin.getName() + " updates stock for \"" +
                            product.getName() + "\" to " + newStock + " units.");
                    break;
                } else {
                    throw new IllegalArgumentException("Product not found.");
                }
            }
        } else {
            throw new IllegalArgumentException("Access denied: Only admins can update products.");
        }
    }

    public void displayProducts() {
        int i = 1;
        for (Product p : products) {
            System.out.println(i++ + ". " + p.getName() + "- $"
                    + p.getPrice() + " (Stock: " + p.getStockQuantity() + ")");
        }
    }

}
