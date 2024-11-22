package com.learning.java.assignments.four;

public class Order {

    private int orderId;
    private Customer customer;
    private Product[] productList;
    private double totalAmount;

    public Order(int orderId, Customer customer, Product[] productList) {
        this.orderId = orderId;
        this.customer = customer;
        this.productList = productList;
    }

    public double calculateTotalAmount(){
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

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Product[] getProductList() {
        return productList;
    }

    public void setProductList(Product[] productList) {
        this.productList = productList;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }
}
