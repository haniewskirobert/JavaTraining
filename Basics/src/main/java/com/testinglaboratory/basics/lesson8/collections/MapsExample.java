package com.testinglaboratory.basics.lesson8.collections;

import com.testinglaboratory.basics.lesson6_classes_introduction.ClassConventions;
import com.testinglaboratory.basics.lesson6_classes_introduction.Toy;

import java.util.HashMap;
import java.util.Map;

public class MapsExample {
    public static void main(String[] args) {
        Map<String, Integer> stringKeyIntValue;
        Map<String, Integer> stringKeyIntValueOf = Map.of("Str", 1);
        Map<String, ClassConventions> myMap = new HashMap<>();

        ClassConventions clasCon = new ClassConventions();
        myMap.put("My convention", clasCon);

        System.out.println(myMap);

        ClassConventions objectClassConventions = myMap.get("My convention");

        myMap.remove("someKey");

        //todo create map with numbers as Keys and YourOwnClass form lesson 6. Discover some useful maps methods

        Map<String, Toy> map = new HashMap<>();

        Toy myToy = new Toy("kot", "red", false, 3);
        map.put(new String("blal"), myToy);

        System.out.println(map);

       Map<String, Integer> maps = new HashMap<>();

       maps.put("OK", 1);
       maps.put("OK1", 1);
       maps.put("OK2", 1);

        System.out.println("pierwsza mapa: " + maps);

        maps.put("OK1", 55);

        System.out.println("druga mapa: " + maps);

    }

}
