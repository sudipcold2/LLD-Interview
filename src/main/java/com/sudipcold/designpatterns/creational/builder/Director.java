package com.sudipcold.designpatterns.creational.builder;

public class Director {
    AircraftBuilder aircraftBuilder;

    public Director(AircraftBuilder aircraftBuilder) {
        this.aircraftBuilder = aircraftBuilder;
    }

    public void constructAirCraft(boolean isPassenger){
        aircraftBuilder.buildCockpit();
        aircraftBuilder.buildEngine();
        aircraftBuilder.buildWings();
        if(isPassenger)
            aircraftBuilder.buildBathrooms();
    }
}
