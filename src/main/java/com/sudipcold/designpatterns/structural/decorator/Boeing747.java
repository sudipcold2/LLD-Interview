package com.sudipcold.designpatterns.structural.decorator;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Boeing747 implements IAircraft {

    @Override
    public void fly() {
        log.info("Boeing 747 is Flying Baby ~~~~~");
    }

    @Override
    public void land() {
        log.info("Boeing 747 is landed");
    }

    @Override
    public float getWeight() {
        return baseWeight;
    }
}
