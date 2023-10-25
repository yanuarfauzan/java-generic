package belajar.java.application;

import belajar.java.utils.ArrayHelper;

public class ArrayHelperApp {
    public static void main(String[] args) {
        String[] names = {"Yanuar", "Jujun", "Mumu"};
        Integer[] numbers = {1,4,5,6,3,2};

        System.out.println(ArrayHelper.count(names));
        System.out.println(ArrayHelper.count(numbers));
    }
}
