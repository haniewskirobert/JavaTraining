package com.testinglaboratory.basics.lesson4_logic;

import java.util.Scanner;

public class FlowControlExcercise {

    public static void main(String[] args) {

        int firstNum;
        int secNum;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter same number 1-10 ");
        firstNum = scanner.nextInt();
        if (firstNum > 0 && firstNum < 10) {
            System.out.println("number is correct");
        } else {
            System.out.println("! number should be 0-10");
        }

        System.out.println("Enter same number 0-50");
        secNum = scanner.nextInt();
        if (secNum > 0 && secNum < 50) {
            System.out.println("number is correct");
        } else {
            System.out.println("! number should be 0-50");
        }

        int sum = firstNum + secNum;
        System.out.println("Suma: " + sum);

        System.out.println("Roznica " + (secNum - firstNum));

        System.out.println((secNum * firstNum));
        System.out.println((secNum / firstNum));

        //todo try to load two numbers from user and compare it with all operators that you already know
    }
}
