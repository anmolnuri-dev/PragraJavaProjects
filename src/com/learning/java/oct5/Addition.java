package com.learning.java.oct5;

public class Addition {

    // method overloading..
    // same name and diff parameters...

    public double sum(int a , int b, float c){
        return a + b + c;
    }

    public int sum(int a , int b, int c){
        return a + b + c;
    }

    public int sum(int a , int b, int c, int d){
        return a + b + c + d;
    }

}
// Clean code...