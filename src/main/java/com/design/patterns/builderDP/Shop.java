package com.design.patterns.builderDP;

/**
 * Created by vijay.hathimare on 5/11/20.
 *
 */
public class Shop {
    public static void main(String[] args) {
        Phone p = new PhoneBuilder().setOs("Android").setCamera(42).setBattery(3900).getPhone();
        System.out.println(p);
    }
}
