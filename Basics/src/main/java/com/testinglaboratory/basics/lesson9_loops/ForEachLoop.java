package com.testinglaboratory.basics.lesson9_loops;

import java.util.ArrayList;
import java.util.List;

public class ForEachLoop {

    public static void main(String[] args) {
        List<String> people = new ArrayList<>();

        people.add("Mateusz");
        people.add("Anna");
        people.add("Paulina");

        System.out.println("for loop");
        for (int i = 0; i < people.size(); i++) {
            String person = people.get(i);
            if (person.length() == 4) {
                System.out.println(person);
            }
        }

        System.out.println("for each loop");
        for (String person : people) {
            if (person.length() == 4) {
                System.out.println(person);
            }
        }
    }

    //todo try to copy to other list only those person who name have 4 letters.


}
