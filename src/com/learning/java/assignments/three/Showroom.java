package com.learning.java.assignments.three;

// Main class to test Vehicle, Car, and Bike
public class Showroom {
    public static void main(String[] args) {
        // Create a Car instance
        Car car = new Car("Toyota", 180, 4);
        System.out.println("Car Details:");
        car.displayInfo();

        System.out.println("\n");

        // Create a Bike instance
        Bike bike = new Bike("Yamaha", 120, "Sports Bike");
        System.out.println("Bike Details:");
        bike.displayInfo();
    }
}