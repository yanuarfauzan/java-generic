package belajar.java.application;

import belajar.java.generic.Pair;

public class MultipleGenericClass {
    public static void main(String[] args) {
        Pair<String, Integer> pair = new Pair<String, Integer>("Yanuar", 21);

        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());

    }
}
