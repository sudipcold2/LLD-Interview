package com.sudipcold.designpatterns.behavorial.observer;

import com.sudipcold.designpatterns.structural.adapter.IAircraft;

public class F16 implements IObserver, IAircraft {

    ISubject observable;

    public F16(ISubject observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Object newState) {

    }

    @Override
    public void fly() {

    }

    public void land() {
        // Don't forget to unsubscribe from control tower updates
        observable.removeObserver(this);
    }
}
