package com.learning.java.assignments.three;

public class Bike extends Vehicle {

    String type;

    public Bike(String brand, int speed, String type) {
        super(brand, speed);
        this.type = type;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Bike Type: " + type);
    }
}
