package com.sudipcold.designpatterns.behavorial.state;

public class LandState implements IPilotActions {

    F16 f16;

    public LandState(F16 f16) {
        this.f16 = f16;
    }

    @Override
    public void pilotTaxies(F16 f16) {

    }

    @Override
    public void pilotFlies(F16 f16) {

    }

    @Override
    public void pilotEjects(F16 f16) {

    }

    @Override
    public void pilotLands(F16 f16) {

    }

    @Override
    public void pilotParks(F16 f16) {

    }
}
