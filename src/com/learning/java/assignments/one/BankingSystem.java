package com.learning.java.assignments.one;

import java.util.Scanner;

public class BankingSystem {

    public static void main(String[] args) {
        int option;
        double balance=0.0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the XYZ Banking System!");
        System.out.print("Please enter a PIN (numeric): ");
        int pin = sc.nextInt();
        int verify;
        do {
            System.out.println("Please select an option: ");
            System.out.println("1. Check Balance \n2. Deposit Money \n3. Withdraw Money \n4. Exit");
            System.out.print("> ");
            option = sc.nextInt();
            switch (option) {
                case 1:
                    System.out.printf("Your current balance is: $%.2f%n", balance);
                    break;
                case 2:
                    System.out.print("Please enter your PIN: ");
                    verify = sc.nextInt();
                    if(pin == verify) {
                        System.out.print("Please enter the amount you wish to deposit: $");
                        double deposit = sc.nextDouble();
                        if (deposit > 0) {
                            balance += deposit;
                            System.out.printf("$%.2f has been deposited to your account.%n", deposit);
                        }
                        else {
                            System.out.println("Deposit amount must be positive.");
                        }
                    }
                    else{
                        System.out.println("Incorrect PIN.");
                    }
                    break;
                case 3:
                    System.out.print("Please enter your PIN: ");
                    verify = sc.nextInt();
                    if(pin == verify) {
                        System.out.print("Please enter the amount you wish to withdraw: $");
                        double withdraw = sc.nextDouble();
                        if (withdraw > 0 && withdraw <= balance) {
                            balance -= withdraw;
                            System.out.printf("$%.2f has been withdrawn from your account.%n", withdraw);
                        }
                        else if(withdraw > balance) {
                            System.out.println("Insufficient funds available.");
                        }
                        else {
                            System.out.println("Withdrawal amount must be positive.");
                        }
                    }
                    else {
                        System.out.println("Incorrect PIN.");
                    }
                    break;
                case 4:
                    System.out.println("Thank you using the XYZ Banking System. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        } while (option != 4);
        sc.close();
    }
}
