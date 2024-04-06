package com.sudipcold.designpatterns.structural.bridge;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
public class Corolla_L_Impl_America extends AbstractCorollaImpl {
    @Override
    void listSafetyEquipment() {
        log.info("Full on safety");
    }

    @Override
    boolean isCarRightHanded() {
        return false;
    }
}
