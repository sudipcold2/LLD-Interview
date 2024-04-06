package com.sudipcold.designpatterns.structural.facade;

public interface BoeingNavigationSystem {
    void setDirectionBasedOnSpeedAndFuel(int speed, int fuel);
    void turnOff();
}
