package com.sudipcold.designpatterns.creational.builder;

public abstract class AircraftBuilder {
    public abstract void buildEngine();
    public abstract void buildWings();
    public abstract void buildCockpit();
    public abstract void buildBathrooms();

    public abstract IAircraft getResult();
}
