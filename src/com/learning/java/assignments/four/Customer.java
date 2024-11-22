package com.learning.java.assignments.four;

public class Customer extends User {

    private String address;
    private Order[] orderHistory;

    public Customer(int userId, String name, String email, String phoneNumber, String address, Order[] orderHistory) {
        super(userId, name, email, phoneNumber);
        this.address = address;
        this.orderHistory = orderHistory;
    }

    @Override
    public String getRole() {
        return "Customer";
    }
}
