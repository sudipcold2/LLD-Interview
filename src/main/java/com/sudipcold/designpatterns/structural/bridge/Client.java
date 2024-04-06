package com.sudipcold.designpatterns.structural.bridge;

import lombok.extern.slf4j.Slf4j;

/**
 *
 */

@Slf4j
public class Client {
    public static void main(String[] args) {
        AbstractCorolla corolla = new Corolla_M(new Corolla_L_Impl_America());
        corolla.listSafetyEquipment();
        log.info("Test");
    }
}
