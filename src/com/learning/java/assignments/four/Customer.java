package com.learning.java.assignments.four;

import java.util.ArrayList;
import java.util.List;

public class Customer extends User {

    private String address;
    private List<Order> orderHistory;

    public Customer(int userId, String name, String email, String phoneNumber, String address) {
        super(userId, name, email, phoneNumber);
        this.address = address;
        this.orderHistory = new ArrayList<>();
    }

    public String getAddress() {
        return address;
    }

    public List<Order> getOrderHistory() {
        return orderHistory;
    }

    public void addOrder(Order order) {
        this.orderHistory.add(order);
    }

    @Override
    public String getRole() {
        return "Customer";
    }
}
