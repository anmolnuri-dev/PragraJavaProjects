package com.learning.java.oct5;

public class Demo {

    int x;
    int y;

    public Demo() {
        System.out.println("Default const ");
    }

    public Demo(int x) {
        this();  // calling the default const
        System.out.println("1 parameter ");
        this.x = x;
    }

    public Demo(int x, int y) {
        this(x);
        System.out.println("2 parameter ");
        this.x = x;
        this.y = y;
    }


    int z;

    public static void main(String[] args) {
        Demo demo = new Demo(10, 10);
       // System.out.println(z);


    }
}
