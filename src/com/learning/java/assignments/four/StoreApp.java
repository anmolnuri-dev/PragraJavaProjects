package com.learning.java.assignments.four;

public class StoreApp {

    public static void main(String[] args) {
        System.out.println("Welcome to the E-commerce Management System!");

        // Step 1: Create the Store and Register Products
        Store store = new Store();
        store.registerProduct(new Product(101, "Laptop", 1200.00, 10));
        store.registerProduct(new Product(102, "Smartphone", 800.00, 15));

        // Step 2: Register Admins and Customers
        Admin sarahSmith = new Admin(1, "Sarah Smith", "sarah@example.com", "123-456-7890");
        Customer johnDoe = new Customer(2, "John Doe", "john@example.com", "987-654-3210", "123 Main St");

        System.out.println("\nRegistering users...");
        store.registerUser(sarahSmith);  // Register Admin
        store.registerUser(johnDoe);  // Register Customer

        System.out.println("\nAdmin Actions:");
        // Step 3: Admin adds products to the store
        Product headphones = new Product(103, "Headphones", 200.0, 20);
        Product macbook = new Product(104, "Macbook Pro", 2000.00,10);

        store.addProduct(macbook,sarahSmith);// Admin adds a product
        store.addProduct(headphones, sarahSmith);  // Admin adds another product

        System.out.println("\nProducts added to the store!");

        // Step 4: Display available products
        System.out.println("\nAvailable products in the store:");
        store.displayProducts();

        // Step 5: Customer browses and adds products to the cart
        Cart johnsCart = new Cart();  // Create a cart for the customer

        System.out.println("\nCustomer browses and adds products to the cart.");
        johnsCart.addProduct(headphones);
        johnsCart.addProduct(macbook);

        System.out.println("\nJohn's cart contents:");
        johnsCart.displayCart();

        // Step 6: Customer places an order
        System.out.println("\nJohn places an order...");
        Order order1 = johnsCart.checkout(johnDoe);


        if (order1 != null) {
            store.placeOrder(order1);  // Place the order in the store
        }
        // Step 7: Display John's order history
        System.out.println("\nOrder history for John:");
        store.getOrderHistory(johnDoe);

        // Step 8: Admin updates product stock
        System.out.println("Admin updates product stock");
        store.updateProductStock(101, 5, sarahSmith);  // Update stock for Laptop
        store.removeProduct(102, sarahSmith);  // Remove Smartphone from the inventory

        // Step 9: Display updated product inventory
        System.out.println("\nUpdated product inventory:");
        store.displayProducts();

    }

}
