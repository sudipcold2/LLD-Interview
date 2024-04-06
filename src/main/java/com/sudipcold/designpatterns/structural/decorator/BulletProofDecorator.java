package com.sudipcold.designpatterns.structural.decorator;

public class BulletProofDecorator extends BoeingDecorator {
    IAircraft boeing;

    public BulletProofDecorator(IAircraft boeing) {
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
        return boeing.getWeight() + 10f;
    }
}
