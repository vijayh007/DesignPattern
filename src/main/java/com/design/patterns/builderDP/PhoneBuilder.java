package com.design.patterns.builderDP;

/**
 * Created by vijay.hathimare on 5/13/20.
 *
 */
public class PhoneBuilder {
    private String os;
    private String processor;
    private Double screenSize;
    private Integer battery;
    private Integer camera;

    public PhoneBuilder setOs(String os) {
        this.os = os;
        return this;
    }

    public PhoneBuilder setProcessor(String processor) {
        this.processor = processor;
        return this;
    }

    public PhoneBuilder setScreenSize(Double screenSize) {
        this.screenSize = screenSize;
        return this;
    }

    public PhoneBuilder setBattery(Integer battery) {
        this.battery = battery;
        return this;
    }

    public PhoneBuilder setCamera(Integer camera) {
        this.camera = camera;
        return this;
    }

    public Phone getPhone(){
        return new Phone(os, processor, screenSize, battery, camera);
    }
}
