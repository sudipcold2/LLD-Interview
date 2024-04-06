package com.sudipcold.designpatterns.structural.decorator;

public class LuxuryFittingsDecorator extends BoeingDecorator {
    IAircraft boeing;

    public LuxuryFittingsDecorator(IAircraft boeing) {
        this.boeing = boeing;
    }

    @Override
    public void fly() {
        boeing.fly();
    }

    @Override
    public void land() {
        boeing.land();
    }

    @Override
    public float getWeight() {
        return boeing.getWeight() + 3.5f;
    }
}
