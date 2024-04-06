package com.sudipcold.designpatterns.behavorial.visitor;

public class Boeing747 implements IAircraft {

    @Override
    public void accept(IAircraftVisitor visitor) {
        visitor.visitBoeing747(this);
    }
}
