package belajar.java.application;

import java.util.Arrays;

import belajar.java.generic.Person;

public class ComparableApp {
    public static void main(String[] args) {
        Person[] people = {
            new Person("Yanuar", "Indonesia"),
            new Person("Jujun", "Indonesia"),
            new Person("Mumu", "Indonesia"),
        };

        Arrays.sort(people);

        System.out.println();

        System.out.println(Arrays.toString(people));
    }
}
