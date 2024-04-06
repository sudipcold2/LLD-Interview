package com.sudipcold.designpatterns.structural.facade;

public interface BoeingEngineController {
    void setEngineSpeed(int speed);
    int getEngineSpeed();

    void turnOff();
}
