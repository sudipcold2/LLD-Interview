package com.sudipcold.designpatterns.structural.bridge;

import lombok.Data;

@Data
public abstract class AbstractCorollaImpl {
    abstract void listSafetyEquipment();
    abstract boolean isCarRightHanded();
}
