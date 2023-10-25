package belajar.java.application;

import belajar.java.generic.MyData;

public class InvariantApp {
    public static void main(String[] args) {
        MyData<String> stringData = new MyData<>("Yanuar");
        // Doit(stringData); ERROR (Invariant) tidak diperlakukan seperti polymorphisme

    }

    public static void Doit(MyData<Object> objecMyData)
    {
        // Do Something
    }

}
