package com.design.patterns.builderDP;

import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;

/**
 * Created by vijay.hathimare on 5/11/20.
 *
 */
public class Phone {
    private String os;
    private String processor;
    private Double screenSize;
    private Integer battery;
    private Integer camera;

    public Phone(String os, String processor, Double screenSize, Integer battery, Integer camera) {
        this.os = os;
        this.processor = processor;
        this.screenSize = screenSize;
        this.battery = battery;
        this.camera = camera;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "os='" + os + '\'' +
                ", processor='" + processor + '\'' +
                ", screenSize=" + screenSize +
                ", battery=" + battery +
                ", camera=" + camera +
                '}';
    }
}
