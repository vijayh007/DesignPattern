package com.design.patterns.factoryDP;

import com.design.patterns.factoryDP.phone.Android;
import com.design.patterns.factoryDP.phone.OS;
import com.design.patterns.factoryDP.phone.PhoneOSFactory;

/**
 * Created by vijay.hathimare on 5/11/20.
 */
public class FactoryClass {
    public static void main(String[] args) {
        PhoneOSFactory phoneOSFactory = new PhoneOSFactory();
        OS os = phoneOSFactory.getInstance("Close");
        os.spec();
    }
}
