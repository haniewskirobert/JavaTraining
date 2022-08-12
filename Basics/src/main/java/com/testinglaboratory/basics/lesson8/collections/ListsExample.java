package com.testinglaboratory.basics.lesson8.collections;

import java.util.ArrayList;
import java.util.List;

public class ListsExample {

    public static void main(String[] args) {
        List<String> listsOfTexts = new ArrayList<String>();

        listsOfTexts.add("xxx");
        System.out.println(listsOfTexts.size());
        System.out.println(listsOfTexts.get(0));

//        List<Double> doubles = List.of(1.0, 2.0);
//
//        doubles.remove(1);
//        doubles.remove(2.0);
//
//        System.out.println(doubles.get(0));

        //doubles.add(5.0);

        //todo create your own list and fill it wit sample data
        //todo OPTIONAL create lists with other list in in it. And Fill it;

        List<Integer> number = List.of(23, 42, 90,11,12);

        System.out.println(number.toString());

        List <Integer> listofN = new ArrayList<Integer>(){{
            add(1);
            add(343);
            add(896845);
            add(23423);
            add(234);
        }};

        listofN.add(5555);
        System.out.println(listofN);
        System.out.println(listofN.get(2));

        listofN.remove(2);
        System.out.println(listofN);
        System.out.println(listofN.get(2));





    }
}
