package com.learning.java.nov19;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test {
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();
        // insert into map

        map.put("name", "Anmol");  // this key value pair is called is entry
        map.put("Email ", "anmol@gmail.com");
        map.put("phone ", "1212121212");
        map.put("address ", "Toronto");
        map.put(null, "nothing");
        map.put(null, "something");

        System.out.println(map);

        map.putIfAbsent("name1 ", "Alok");

        System.out.println(map);

        // fetch from map
        String name = map.getOrDefault("name", "xyz"); // if the key is not present, its going to return default value
        System.out.println(name);

        System.out.println(name.toUpperCase());

        // key is present

        boolean name1 = map.containsKey("name");  // check if the key is present or not
        System.out.println(name1);

        Set<String> set = map.keySet();  // this is going to return set of keys in map

        System.out.println("set of all the keys "+set );

        //fetch collection of values
        Collection<String> values = map.values(); // this is going to return set of values in map
        System.out.println(values);


        System.out.println("1111");

        // Map is outer class/interface , Entry is inner class/interface
        // OuterClass.InnerClass - to access inner class element, Outer class is used
        Set<Map.Entry<String, String>> entrySet = map.entrySet();  // map.entrySet will fetch all the set of entry

        for (Map.Entry<String, String>  entry:  entrySet) {
            //System.out.println(entry);   // this is going to give entry which inclues, key and value
            System.out.println(entry.getKey());   // list all the keys
            System.out.println(entry.getValue()); // list all the values

        }







        // parent class ----- list, set , queue    child class
    }

}

/*


Name - Alok
email - alok@gmail.com
address - Toronto
address - Toronto
phone - 23123412341
null - test
 */