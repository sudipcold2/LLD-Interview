package com.sudipcold.designpatterns.creational.builder;

public class F16Builder extends AircraftBuilder {
    F16 f16;

    public F16Builder() {
        this.f16 = new F16();
    }

    @Override
    public void buildEngine() {

    }

    @Override
    public void buildWings() {

    }

    @Override
    public void buildCockpit() {

    }

    @Override
    public void buildBathrooms() {

    }

    @Override
    public IAircraft getResult() {
        return null;
    }
}
