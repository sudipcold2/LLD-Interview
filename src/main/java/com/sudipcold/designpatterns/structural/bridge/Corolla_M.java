package com.sudipcold.designpatterns.structural.bridge;

public class Corolla_M extends AbstractCorolla {

    public Corolla_M(AbstractCorollaImpl corollaImpl) {
        super(corollaImpl);
    }

    @Override
    void listSafetyEquipment() {
        corollaImpl.listSafetyEquipment();
    }

    @Override
    boolean isCarRightHanded() {
        return corollaImpl.isCarRightHanded();
    }
}
