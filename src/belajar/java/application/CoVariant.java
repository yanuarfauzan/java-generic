package belajar.java.application;

import belajar.java.generic.MyData;

public class CoVariant {
    public static void main(String[] args) {
        MyData<String> stringData = new MyData<>("Yanuar");
        process(stringData);

    }

    // Syntax CoVariant
    public static void process(MyData<? extends Object> myData) {
        System.out.println(myData.getData());
    }
}
