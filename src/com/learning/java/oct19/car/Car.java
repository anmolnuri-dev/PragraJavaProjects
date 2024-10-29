package com.learning.java.oct19.car;

public class Car extends Vehicle{

    String fuelType;

    public void brake(){
        System.out.println("brake");
    }

    @Override
    public void start() {
        System.out.println("Car is starting...");
    }
}
