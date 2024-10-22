package com.learning.java.oct5;

public class CarMain {
    public static void main(String[] args) {
       Car car = new Car(100, 4, "SUV");
        System.out.println(car.model);
        System.out.println(car.totalSeats);
        System.out.println(car.topSpeed);

        Car car2 = new Car();


    }
}
