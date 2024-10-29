package com.learning.java.assignments.three;

public class Vehicle {
    String brand;
    int speed;

    public Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    public void displayInfo(){
        System.out.println("Brand: " + brand + "\nSpeed: " + speed);
    }
}
