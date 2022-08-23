package com.testinglaboratory.basics.lesson8.exceptions;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;

//TODO create list, map and array with example values
// try to access nonexistent indexes or keys
// see what happens, and think what can be done to fix it
public class ExceptionExercise {
    public static void main(String[] args) {
        try{
            int[] x = {5, 78, 245, 690, 554, 22113};
            System.out.println(x.length);
        }catch (Exception exception){
            System.out.println(exception.getCause());
            System.out.println(exception.getMessage());
            System.out.println(exception.getStackTrace());
        }

        List<Integer> num = List.of(64, 298, 90, 26, 1);
        List<Integer> listofNum = new ArrayList<Integer>() {{
            add(1);
            add(343);
            add(896845);
            add(23423);
            add(234);
        }};

       // System.out.println(x.length);
        System.out.println(num.toString());
        System.out.println(listofNum);



    }
}
