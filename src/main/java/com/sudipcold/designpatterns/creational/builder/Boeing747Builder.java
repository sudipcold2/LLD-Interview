package com.sudipcold.designpatterns.creational.builder;

public class Boeing747Builder extends AircraftBuilder {
    Boeing747 boeing747;


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
        return boeing747;
    }
}
