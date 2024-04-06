package com.sudipcold.designpatterns.creational.factory;

public interface IAircraftFactory {
    IEngine createEngine();

    IWings createWings();

    ICockpit createCockpit();
}
