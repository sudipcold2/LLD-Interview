package com.sudipcold.designpatterns.behavorial.command;

public class Client {

    public static void main(String[] args) {
        LandingGear landingGear = new F16LandingGear();
        LandingGearDownCommand landingGearDownCommand = new LandingGearDownCommand(landingGear);

        // Create the instrument panel
        InstrumentPanel instrumentPanel = new InstrumentPanel();

        // Assign the commands
        instrumentPanel.setCommand(0, landingGearDownCommand);

        // Lower the landing gear
        instrumentPanel.lowerLandingGear();
    }
}
