package com.sudipcold.designpatterns.structural.facade;

public class AutopilotFacade {
    private final BoeingAltitudeMonitor boeingAltitudeMonitor;
    private final BoeingEngineController boeingEngineController;
    private final BoeingFuelMonitor boeingFuelMonitor;
    private final BoeingNavigationSystem boeingNavigationSystem;

    public AutopilotFacade(BoeingAltitudeMonitor boeingAltitudeMonitor, BoeingEngineController boeingEngineController,
                           BoeingFuelMonitor boeingFuelMonitor, BoeingNavigationSystem boeingNavigationSystem) {
        this.boeingAltitudeMonitor = boeingAltitudeMonitor;
        this.boeingEngineController = boeingEngineController;
        this.boeingFuelMonitor = boeingFuelMonitor;
        this.boeingNavigationSystem = boeingNavigationSystem;
    }

    public void autoPilotOn(){
        boeingAltitudeMonitor.autoMonitor();
        boeingEngineController.setEngineSpeed(700);
        boeingNavigationSystem.setDirectionBasedOnSpeedAndFuel(boeingEngineController.getEngineSpeed(),
                boeingFuelMonitor.getRemainingFuelInGallons());
    }

    public void autoPilotOff(){
        boeingNavigationSystem.turnOff();
        boeingFuelMonitor.turnOff();
        boeingAltitudeMonitor.turnOff();
        boeingEngineController.turnOff();
    }
}
