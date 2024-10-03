package com.learning.java.sept21;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        System.out.println("****************");
        System.out.println("Welcome to My Calculator");
        System.out.println("****************");
        System.out.println("1. Addition \n 2. Substraction \n 3. Multiplication \n 4. Division \n 5. Modulus \n 0. Exit");

        Scanner sc = new Scanner(System.in);
        System.out.print("Please select an option: ");
        int option = sc.nextInt();

    }
}
