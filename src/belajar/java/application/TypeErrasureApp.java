package belajar.java.application;

import belajar.java.generic.MyData;

public class TypeErrasureApp {
    public static void main(String[] args) {
        MyData myData = new MyData<>("Yanuar");

        MyData<Integer> integerMyData = (MyData<Integer>) myData;
        Integer integer = integerMyData.getData(); 
    }
}
