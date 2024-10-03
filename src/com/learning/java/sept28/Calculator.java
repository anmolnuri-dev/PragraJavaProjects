package com.learning.java.sept28;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc;
        char exit;
        do {
            //Print calculator menu
            System.out.println("****************");
            System.out.println("Welcome to My Calculator");
            System.out.println("****************");
            System.out.println(" 1. Addition \n 2. Substraction \n 3. Multiplication \n 4. Division \n 5. Modulus \n 0. Exit");

            //User selects an operation
            sc = new Scanner(System.in);
            System.out.print("Please select an option: ");
            int option = sc.nextInt();

            //User inputs 2 digits
            System.out.print("Please enter the first digit: ");
            double fistDigit = sc.nextInt();
            System.out.print("Please enter the second digit: ");
            double secondDigit = sc.nextInt();
            double result = 0;
            double zero = 0.0;
            switch (option) {
                case 1:
                    result = fistDigit + secondDigit;
                    break;
                case 2:
                    result = fistDigit - secondDigit;
                    break;
                case 3:
                    result = fistDigit * secondDigit;
                    break;
                case 4:
                    if (secondDigit != zero) {
                        result = fistDigit / secondDigit;
                    } else {
                        System.out.println("Error - Division by zero ");
                    }
                    break;
                case 5:
                    if (secondDigit != zero) {
                        result = fistDigit % secondDigit;
                    } else {
                        System.out.println("Error - Modulus by zero ");
                    }
                default:
                    System.out.println("Invalid option!");
                    break;
            }
            System.out.println("The result is: " + result);
            System.out.print("Did you want to continue? (Y/N): " );
            exit = sc.next().charAt(0);
        } while(exit == 'y' || exit =='Y');
    }
}

