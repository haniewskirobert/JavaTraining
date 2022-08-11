package com.testinglaboratory.basics.lesson5_access;

public class PlaceToCheckYoursOwn {

    int n1 = 11;
    private int n2 = 22;
    public int n3 = 33;
    protected int n4 = 43;

    static int n5 = 55;
    final int n6 = 65;

    static final private String experimets = "it must be initialized";
    static final public String sampleStaticText = "it must be public";
    final public String sampleText = "it must be final public";

    static PlaceToCheckYoursOwn myOwn = new PlaceToCheckYoursOwn();

    public static void main(String[] args) {

        System.out.println(myOwn.n1);
        System.out.println(myOwn.n2);
        System.out.println(myOwn.n3);
        System.out.println(myOwn.n4);
        System.out.println(myOwn.n5);
        System.out.println(myOwn.n6);
        System.out.println(myOwn.sampleText);
        System.out.println(PlaceToCheckYoursOwn.sampleStaticText);
        System.out.println(PlaceToCheckYoursOwn.experimets);
    }
}
