package com.learning.java.oct15;

public class StringDemo {
    public StringDemo() {
    }

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Pragra");
        System.out.println(sb);
        sb.append(" Inc");
        System.out.println(sb);
        StringBuilder reverse = sb.reverse();
        System.out.println(reverse);
    }
}
