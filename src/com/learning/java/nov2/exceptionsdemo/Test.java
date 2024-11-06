package com.learning.java.nov2.exceptionsdemo;

public class Test {



    public static void show(){
        test();
    }

    public static void test(){
        show();
    }
    public static void main(String[] args) {

        show();




        int[] arr = new int[5];
        arr[0] = 10;
        arr[1] = 10;
        arr[2] = 10;
        arr[3] = 10;
        arr[4] = 10;
        arr[5] = 10;

        System.out.println("Last line");

      /*  int x = 10;
        int y = 0;
        int div = x/y;

        System.out.println(div);
        System.out.println("End of line...");
*/

       /* String s = "PRAGRA";
        s = null;
        String s1 = s.toLowerCase();
        System.out.println("Lower case :  " +s1);
        System.out.println("Line 10");*/


    }
}
