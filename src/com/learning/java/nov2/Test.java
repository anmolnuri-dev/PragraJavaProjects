package com.learning.java.nov2;

public class Test {
    public static void main(String[] args) {

        Student student = new SchoolStudent("Anmol","anmol@gmail.com");

        SchoolStudent schoolStudent = (SchoolStudent) new Student("Anmol","anmol@gmail.com");

        // wrapper classes ?
        /*

        primitves ---- > classes, Object
        int ---- Integer
        float --- Float
        boolean --- Boolean


         */

    }
}
/*

      // type casting
 float x = 10.23f;

        int y = (int)x;

        System.out.println(y);


        int a = 10;

        float b = a;
        System.out.println(b);
 */