package com.design.patterns.factoryDP.phone;

/**
 * Created by vijay.hathimare on 5/11/20.
 */
public class PhoneOSFactory {
    public OS getInstance(String st){
        if(st.equalsIgnoreCase("open")){
            return new Android();
        }else if(st.equalsIgnoreCase("close")){
            return new IOS();
        }else {
            return new Window();
        }
    }
}
