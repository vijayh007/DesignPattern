package com.design.patterns.singletonDP;

/**
 * Created by vijay.hathimare on 5/10/20.
 *
 */

/*
How to create the class as singleton
 - make static class instance
 - constructor should be private
 - use static method to create the object

 Ways to create the class as singleton
 - Eager type
 - lazy type
 - synchronized block // if we have multiple thread
 - Doble check

*/


public class SingletonClass {
    public static void main(String[] args) {

//        SingleTonObject singleTonObject = SingleTonObject.getInstance();
//        SingleTonObject singleTonObject1 = SingleTonObject.getInstance();
//        SingleTonObject singleTonObject2 = SingleTonObject.getInstance();
//        System.out.println(singleTonObject);
//        System.out.println(singleTonObject1);
//        System.out.println(singleTonObject2);
        Thread t1 = new Thread(new Runnable() {
            public void run() {
                SingleTonObject singleTonObject = SingleTonObject.getInstance();
            }
        });
        Thread t2 = new Thread(new Runnable() {
            public void run() {
                SingleTonObject singleTonObject = SingleTonObject.getInstance();
            }
        });
        Thread t3 = new Thread(new Runnable() {
            public void run() {
                SingleTonObject singleTonObject = SingleTonObject.getInstance();
            }
        });
        t1.start();
        t2.start();
        t3.start();
    }
}

class SingleTonObject{
    private SingleTonObject(){
        System.out.println("Instance created");
    }
    private static SingleTonObject singleTonObject;
    static SingleTonObject getInstance(){
        if (singleTonObject == null) {
            synchronized (SingleTonObject.class) {
                if (singleTonObject == null) {
                    singleTonObject = new SingleTonObject();
                }
            }
        }
        return singleTonObject;
    }
}
