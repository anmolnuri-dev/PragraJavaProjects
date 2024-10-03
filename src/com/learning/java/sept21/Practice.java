package com.learning.java.sept21;

import java.util.Scanner;

public class Practice {

    /*        Write a Java program to calculate grades based on marks. If the mark is 90 or above,
        the grade is 'A'. If it's between 80 and 89, the grade is 'B'. For marks between 70 and 79,
        the grade is 'C'. If the mark is between 60 and 69, the grade is 'D'. Below 60, it's 'F'.*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is the mark you want to calculate?: ");
        int marks = sc.nextInt();

        if(marks >= 90) {
            System.out.println("The grade is an A");
        }

        else if (marks >= 80) {
            System.out.println("The grade is a B");
        }
        else if (marks >= 70) {
            System.out.println("The grade is a C");
        }
        else if (marks >= 60) {
            System.out.println("The grade is a D");
        }
        else {
            System.out.println("The grade is an F");
        }




    }
}
