package com.sudipcold.designpatterns.creational.singleton;

public class AirforceOneClient {
    public static void main(String args[]) {
        AirforceOne airforceOne = AirforceOne.getInstance();
        airforceOne.fly();
    }
}
