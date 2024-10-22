package com.learning.java.oct5;

public class Main {
    public static void main(String[] args) {
        // Object
        Animal animal = new Animal();
        animal.age = 10;
        animal.height = 25.23;
        animal.weight = 100.23;
        animal.color = "Black";

        System.out.println(animal.age);

        animal.makeSound();
        animal.eat();
        animal.sleep();

       // Demo.test();

    }
}
