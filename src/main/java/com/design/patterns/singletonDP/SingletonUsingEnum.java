package com.design.patterns.singletonDP;

/**
 * Singleton class using enum, we are using INSTANCE keyword for create class as singleton using enum below is the example.
 */

public class SingletonUsingEnum {

    public static void main(String[] args) {
        Abc obj = Abc.INSTANCE;
        obj.i = 5;
        obj.show();
        Abc obj1 = Abc.INSTANCE;
        obj1.i = 10;
        obj.show();
    }

}

enum Abc{
    INSTANCE;
    int i ;
    public void show(){
        System.out.println(i);
    }
}
