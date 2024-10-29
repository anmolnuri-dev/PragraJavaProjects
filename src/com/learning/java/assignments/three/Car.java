package com.learning.java.assignments.three;

public class Car extends Vehicle {

    int doors;

    public Car(String brand, int speed, int doors) {
        super(brand, speed);
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Number of doors: " + doors);
    }

}
