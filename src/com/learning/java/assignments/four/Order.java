package com.learning.java.assignments.four;


import java.util.ArrayList;
import java.util.List;

public class Order {

    private static int orderId = 0;
    private Customer customer;
    private List<Product> productList;
    private double totalAmount;

    public Order(Customer customer, List<Product> productList, double totalAmount) {
        ++Order.orderId;
        this.customer = customer;
        this.productList = productList;
        this.totalAmount = totalAmount;

    }
    public double calculateTotal(){
        totalAmount = 0.0;
        for(Product p: productList) {
            if(p != null) {
                totalAmount = totalAmount + p.getPrice();
            }
        }
        return totalAmount;
    }

    public int getOrderId() {
        return orderId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<Product> getProductList() {
        return this.productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Order ID: ").append(orderId).append("\n");
        sb.append("Products:\n");
        for (Product product : productList) {
            sb.append(" - ").append(product).append("\n");
        }
        sb.append("Total Amount: $").append(totalAmount).append("\n");
        return sb.toString();
    }
}
