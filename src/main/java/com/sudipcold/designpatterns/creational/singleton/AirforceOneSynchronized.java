package com.sudipcold.designpatterns.creational.singleton;

public class AirforceOneSynchronized {
    // The sole instance of the class
    private static AirforceOneSynchronized onlyInstance;

    // Make the constructor private so its only accessible to
    // members of the class.
    private AirforceOneSynchronized() {
    }

    public void fly() {
        System.out.println("Airforce one is flying...");
    }

    // Create a static method for object creation
    public static synchronized AirforceOneSynchronized getInstance() {

        // Only instantiate the object when needed.
        if (onlyInstance == null) {
            onlyInstance = new AirforceOneSynchronized();
        }

        return onlyInstance;
    }
}
