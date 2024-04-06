package com.sudipcold.designpatterns.creational.singleton;

public class AirforceOneStaticInitialize {
    private static final AirforceOneStaticInitialize onlyInstance = new AirforceOneStaticInitialize();

    private AirforceOneStaticInitialize() {
    }

    public void fly() {
        System.out.println("Airforce one is flying...");
    }

    public static AirforceOneStaticInitialize getInstance() {
        return onlyInstance;
    }
}
