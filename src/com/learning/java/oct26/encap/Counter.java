package com.learning.java.oct26.encap;

public class Counter {
    protected int counter  = 0;
    public int incrementCounter(){
        return counter++; //++counter
    }

    int sum(int a, int b ){
        return 0;
    }

    double sum(int a, double b){
        return a+b;
    }

}

class AdvanceCounter  extends Counter {

    @Override
    double sum(double a, double b ){
        return a+b;
    }


    public int jumpBy5(){
        counter = counter+5;
        return counter;
    }
}