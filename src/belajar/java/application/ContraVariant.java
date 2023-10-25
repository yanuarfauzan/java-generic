package belajar.java.application;

import belajar.java.generic.MyData;


public class ContraVariant {
    public static void main(String[] args) {
       MyData<Object> objectMyData = new MyData<>("Yanuar");
       MyData<? super String> myData = objectMyData;

       process(objectMyData);

       System.out.println(objectMyData.getData());


    }
    // ContraVariant
    public static void process(MyData<? super String> myData)
    {
        String value = (String) myData.getData(); 
        System.out.println("Process parameter " + value);

        
        myData.setData("Yanuar Fauzan");
    }
}
