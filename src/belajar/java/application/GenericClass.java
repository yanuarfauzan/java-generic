package belajar.java.application;

import belajar.java.generic.MyData;

public class GenericClass {
    public static void main(String[] args) {

        MyData<String> stringMyData = new MyData<String>("Yanuar");
        MyData<Integer> integerMyData = new MyData<Integer>(10);

        System.out.println(stringMyData.getData());
        System.out.println(integerMyData.getData());

    }
}
