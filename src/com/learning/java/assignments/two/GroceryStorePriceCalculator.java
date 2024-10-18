package com.learning.java.assignments.two;

import java.util.Scanner;

public class GroceryStorePriceCalculator {

    int numOfItems = 5;
    String[] fruits;
    double[] pricesPerKg;

    public GroceryStorePriceCalculator(String[] fruits, double[] prices) {
        if (fruits.length == numOfItems) {
            this.fruits = fruits;
            this.pricesPerKg = prices;
        } else {
            System.out.println("Error: The number of fruits provided does not match the expected inventory size.");
        }
    }

    public void calculatePrice(String fruit, double kilograms) {
        int index = -1;
        for (int i = 0; i < numOfItems; i++) {
            if (fruits[i].equalsIgnoreCase(fruit)) {
                index = i;
            }
        }
        if (index == -1) {
            System.out.println(fruit + " is not available.");
        } else {
            double price = kilograms * pricesPerKg[index];
            System.out.printf("The total price for " + "%,.2f" + " kg of " + fruit + " is $" + "%,.2f\n", kilograms, price);
        }
    }

    public void handleUserInput() {
        Scanner sc = new Scanner(System.in);
        String exit;
        do {
            System.out.println("Which fruit do you want to buy?");
            String fruit = sc.nextLine();
            System.out.println("How many kilograms did you want?");
            double weight = sc.nextDouble();
            sc.nextLine(); // Consume the newline after double input
            calculatePrice(fruit, weight);
            System.out.print("Did you want to continue? (Y/N): " );
            exit = sc.nextLine();

        } while(exit.equalsIgnoreCase("y"));
        sc.close();
    }

    public static void main(String[] args) {
        String[] fruits = {"apple", "banana", "orange", "kiwi", "peach"};
        double[] priceKg = {2.50, 1.20, 3.00, 4.50, 2.80};

        GroceryStorePriceCalculator longos = new GroceryStorePriceCalculator(fruits, priceKg);

        //Hard-code purchases
        longos.calculatePrice("orange", 5);
        longos.calculatePrice("peach", 2.5);
        longos.calculatePrice("blueberry", 2);

        //User input
        longos.handleUserInput();


    }
}
