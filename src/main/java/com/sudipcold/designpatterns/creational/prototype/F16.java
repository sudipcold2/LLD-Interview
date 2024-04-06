package com.sudipcold.designpatterns.creational.prototype;

public class F16 implements IAircraftPrototype{
    F16Engine f16Engine = new F16Engine();

    @Override
    public void fly() {

    }

    @Override
    public IAircraftPrototype clone() {
        return new F16();
    }

    @Override
    public void setEngine(F16Engine f16Engine) {
        this.f16Engine = f16Engine;
    }
}
