package com.testinglaboratory.basics.lesson9_loops;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LoopThatWeDoNotLike {
    public static void main(String[] args) {

        int i = 0;
        do {
            i++;
            System.out.println("iteration of do while " + i);
        }
        while (i < 20);


        List<Integer> sampleList = new ArrayList<>();

        do {
            sampleList.add(1);
            sampleList.add(2);
            sampleList.add(3);
            System.out.println("adding to lists" + sampleList);
        } while (sampleList.size()<10);


//
//        List<Integer> list2 = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
//        System.out.println("// iteration");
//        int index21 = 4;
//
//        do {
//            System.out.print(list2.get(index21) + ", ");
//            index21++;
//        }while(index21<list2.size());
//        System.out.println("\n");



        //todo find a practical use to do while loop

    }
}
