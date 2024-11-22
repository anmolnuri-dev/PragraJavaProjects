package com.learning.java.nov19;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Stock {
    public static void main(String[] args) {

        HashMap<String, Integer> stock = new HashMap<>();
        stock.put("Laptop", 100);
        stock.put("Mobile", 150);
        stock.put("Mouse", 250);
        stock.put("Keyboard", 124);
        stock.put("Cables", 29);

        System.out.println(stock); //Prints out the entire HashMap

        //
        Set<String> productNames = stock.keySet();
        Collection<Integer> quantities = stock.values();
        System.out.println(productNames);
        System.out.println(quantities);

        System.out.println("*****************************************");
        //Entry Set
        Set<Map.Entry<String, Integer>> entrySet = stock.entrySet();


        Integer highestStock = 0;
        String productHighestStock = null;
        int numOfProducts = stock.size();
        int totalStock = 0;
        System.out.println("Product Name | Quantity ");
        for(Map.Entry<String,Integer> e: entrySet) {
            System.out.println(e.getKey() + " | " + e.getValue());
            if(e.getValue() > highestStock) {
                highestStock = e.getValue();
                productHighestStock = e.getKey();
            }
            totalStock += e.getValue();
        }

        System.out.println("*****************************************");

        //Calculating the average stock
        int avg = totalStock/numOfProducts;

        System.out.println("Product with the highest stock: " + productHighestStock);
        System.out.println("Highest stock: " + highestStock);
        System.out.println("Average Stock: " + avg);

    }
}
