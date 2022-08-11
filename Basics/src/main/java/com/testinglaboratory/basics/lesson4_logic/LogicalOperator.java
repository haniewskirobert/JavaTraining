package com.testinglaboratory.basics.lesson4_logic;

public class LogicalOperator {


    public static void main(String[] args) {
        int one = 1;
        int two = 2;

        String four = "four";
        String five = "five";

        System.out.println("Logical Operators < > == !=  <= >=");
        System.out.println("is one is smaller than two? " + (one < two));
        System.out.println("is two is smaller than one? " + (one > two));
        System.out.println("is one is equal than two? " + (one == two));
        System.out.println("is one is different than two? " + (one != two));

        System.out.println(four == five);

        System.out.println(four.equals(five));

        //TODO declare two identical numbers and string and try to compare it

        int first = 11;
        int second = 11;
        String name = "jedena";
        String name2 = "jedena";

        System.out.println("czy liczby sa takie same " + (first == second));
        System.out.println("czy liczby sa rozne " + (first != second));

        System.out.println("Czy wyrazy sa takie same? " + (name == name2));

        System.out.println("Czy ta sa takie same wyrazy? " + name.equals(name2));


    }
}
