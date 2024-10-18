package com.learning.java.assignments.two;

import java.util.Scanner;

public class GroceryStorePriceCalculator {

    int numOfItems = 5;
    String [] fruits;
    double [] pricesPerKg;

    public GroceryStorePriceCalculator(String [] fruits, double [] prices){
        if(fruits.length == numOfItems) {
            this.fruits = fruits;
            this.pricesPerKg = prices;
        }
        else {
            System.out.println("Error: The number of fruits provided does not match the expected inventory size.");
        }
    }

    public void calculatePrice(String fruit, double kilograms){
        int index = 0;
        for(int i = 0; i< numOfItems; i++) {
            if(fruits[i].equalsIgnoreCase(fruit)) {
                index = i;
            }
        }
        if(index == 0) {
            System.out.println(fruit + " is not available." );
        }
        else {
            double price = kilograms * pricesPerKg[index];
            System.out.printf("The total price for " + "%,.2f" +  " kg of " + fruit + " is $" + "%,.2f", kilograms, price);
        }
    }

    public static void main(String[] args) {
        String [] fruits = {"apple", "banana", "orange", "kiwi", "peach"};
        double [] priceKg = {2.50, 1.20, 3.00, 4.50, 2.80};

        GroceryStorePriceCalculator longos = new GroceryStorePriceCalculator(fruits, priceKg);
        longos.calculatePrice("orange", 5);
        longos.calculatePrice("peach", 2.5);
        longos.calculatePrice("blueberry", 2);

        //User input
        Scanner sc = new Scanner(System.in);
        System.out.println("Which fruit do you want to buy?");
        String fruit = sc.nextLine();
        System.out.println("How many kilograms did you want?");
        double weight = sc.nextDouble();
        longos.calculatePrice(fruit,weight);


        sc.close();
    }
}
