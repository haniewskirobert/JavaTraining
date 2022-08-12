package com.testinglaboratory.basics.lesson6_classes_introduction;

public class Toy {

    String name;
    String color;
    boolean isSound;
    int buttons;

    public Toy(String name, String color, boolean isSound, int buttons) {
        this.name = name;
        this.color = color;
        this.isSound = isSound;
        this.buttons = buttons;
    }

    public static void main(String[] args) {

        Toy someToy = new Toy("krowa", "red", true, 4);

        System.out.println(someToy.name);
        System.out.println(someToy.color);
        System.out.println(someToy.isSound);
        System.out.println(someToy.buttons);

    }

}
