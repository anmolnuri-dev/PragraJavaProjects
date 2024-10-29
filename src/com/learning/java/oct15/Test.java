package com.learning.java.oct15;

public class Test {
    public Test() {
    }

    public static void main(String[] args) {
        String s1 = "Pragra";
        String s2 = "Pragra";
        String s3 = new String("Pragra");
        s2 = "test";
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        char[] myArray = s1.toCharArray();
        char[] var5 = myArray;
        int var6 = myArray.length;

        for(int var7 = 0; var7 < var6; ++var7) {
            char element = var5[var7];
            System.out.print(" " + element);
        }

    }
}
