package belajar.java.application;

import belajar.java.generic.MyData;

public class WildCardApp {
    public static void main(String[] args) {
        print(new MyData<String>("Yanuar"));
        print(new MyData<Integer>(1));
    }
    // WildCard <?> tidak peduli tipe data nya apa
    // hanya bisa get
    public static void print(MyData<?> myData)
    {
        System.out.println(myData.getData());
    }
}
