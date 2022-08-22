package com.testinglaboratory.basics.lesson7_strings;

public class StringTricksExcercise {

    public static void main(String[] args) {
        String sampleString = "Sample tests Strings";
        System.out.println(sampleString.equals("Sample"));
        System.out.println(sampleString.contains("tests"));

        sampleString.toLowerCase();
        sampleString.toUpperCase();
        System.out.println(sampleString.equals("SaMPle TeStS StriNg"));

        System.out.println(sampleString.compareToIgnoreCase("SaMPle TeStS StriNg"));

        //TODO discover more fancy methods on string and show usages
        System.out.println("paulina");
        String newName = "nowe testy pauliny";
        System.out.println(newName.equals("Sample"));
        System.out.println(newName.contains("pauliny"));

        newName.toLowerCase();
        newName.toUpperCase();
        System.out.println(newName.equals("nowe testy pauliny"));

        String a = "nazwa";
        String b = "naz";
        String c = "nazwaaaaaa";
        String d = "NAZ";

        System.out.println(a.compareToIgnoreCase(b));
        System.out.println(b.compareToIgnoreCase(a));
        System.out.println(c.compareToIgnoreCase(a));
        System.out.println(b.compareToIgnoreCase(d));



    }
}
