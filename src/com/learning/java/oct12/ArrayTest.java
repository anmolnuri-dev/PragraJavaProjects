package com.learning.java.oct12;

import java.util.Scanner;

public class ArrayTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many elements would to like to add to the array?: ");
        int len = scanner.nextInt();
        System.out.println("Enter the elements for the Array ");
        int [] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = scanner.nextInt();
        }
        int [] arr2 = printArray(arr);

        System.out.println("Display the elements in array ");
        for (int element : arr2) {
            System.out.println(element);
        }

    }

    public static int[] printArray(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int temp = arr[end];
            arr[end] = arr[start];
            arr[start] = temp;

            start++;
            end--;
        }
        return arr;
    }

// pass by value
    // pass by ref
}
