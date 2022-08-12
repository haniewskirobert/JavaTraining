package com.testinglaboratory.basics.lesson8.collections;

public class ArraysExample {
    public static void main(String[] args) {
        /**
         * tables
         * type [] name;
         * type [] name = new type [size]
         * type [] name = {element1,element2,...}
         */
        int[] justDeclaredArray;
        int[] fixedSizeArray = new int[10];
        int[] inPlaceArray = {1, 2, 3, 4};

        System.out.println(inPlaceArray);
        System.out.println(fixedSizeArray[5]);
        fixedSizeArray[5] = 1234;
        System.out.println(fixedSizeArray[5]);

        System.out.println(inPlaceArray[0]);


        int[][] twoDimensionsArray = {{1, 2, 3}, {4, 5, 6}};
        System.out.println("hello " + twoDimensionsArray[1][2]);
        String[][][] threeDimensionalArray = {{{}, {}}, {{}, {}, {}}, {{}}, {{},
                {"this is maaaaaaadnes!"}}, {{}, {}},
                {{}, {}, {}}, {{}}, {{},
                {"SPARTAAAAAAAAAAAAA!!!!!!!!!!!1oneoneelvenstojedenaście"}}, {{}}};

        //todo declare yours own array of type double having 5 elements.
        // Fill first and last value and display them. try to access third element
        // find (manually) the strings buried deep within threeDimensionalArray and display them

        double [] x = {1.22, 1.35, 5.45, 10.3, 8.90};

        System.out.println("first " + x[0]);
        System.out.println("last value " + x[4]);
        System.out.println("third element " + x[2]);

        System.out.println(threeDimensionalArray[3][1][0]);
        System.out.println(threeDimensionalArray[7][1][0]);

    }
}
