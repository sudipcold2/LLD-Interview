package com.sudipcold.designpatterns.structural.bridge;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
public abstract class AbstractCorolla {
    protected AbstractCorollaImpl corollaImpl;

    public AbstractCorolla(AbstractCorollaImpl corollaImpl) {
        this.corollaImpl = corollaImpl;
    }

    abstract void listSafetyEquipment();

    abstract boolean isCarRightHanded();
}
