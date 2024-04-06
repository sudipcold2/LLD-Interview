package com.sudipcold.designpatterns.behavorial.command;

public class LandingGearDownCommand implements Command{

    LandingGear landingGear;

    public LandingGearDownCommand(LandingGear landingGear) {
        this.landingGear = landingGear;
    }

    @Override
    public void execute() {
        landingGear.up();
    }
}
