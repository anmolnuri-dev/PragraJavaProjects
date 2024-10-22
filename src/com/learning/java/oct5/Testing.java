package com.learning.java.oct5;

public class Testing {

    static int x = 10;

    Testing(){
        x = 20;
    }

    public static void main(String[] args) {

        Testing testing = new Testing();
        System.out.println(testing.x);
    }
}
