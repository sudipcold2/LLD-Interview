package com.sudipcold.designpatterns.behavorial.visitor;

public interface IAircraft {
    public void accept(IAircraftVisitor visitor);
}
