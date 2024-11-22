package com.learning.java.nov19;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CompanyNameExample {
    public static void main(String[] args) {

        //Create a HashMap called CEO
        Map<String, String> companyCEOs = new HashMap<>();

        //Added Company Name and respective CEO
        companyCEOs.put("Microsoft","Satya Nadella");
        companyCEOs.put("Tesla", "Elon Musk");
        companyCEOs.put("Google", "Sundar Pichai");
        companyCEOs.put("Zomato", "Deepinder Goyal");
        companyCEOs.put("Pragra", "Atin Singh");
        System.out.println(companyCEOs); //Print out HashMap,

        //List all the keys
        System.out.println("List of companies:");
        Set<String> strings = companyCEOs.keySet();
        System.out.println(strings);

        //List all the values
        System.out.println("List of CEOs:");
        Collection<String> values = companyCEOs.values();
        System.out.println(values);

        System.out.println("----------------------------------------------------");
        //Traverse on Entry set and fetch the key and values
        Set<Map.Entry<String, String>> entries = companyCEOs.entrySet();
        System.out.println("Company Name | CEO Name");
        for(Map.Entry<String, String> e: entries){
            System.out.println(e.getKey() + " | " + e.getValue());
        }
    }
}
