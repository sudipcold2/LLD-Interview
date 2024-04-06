package com.sudipcold.designpatterns.structural.composite;

import com.sudipcold.designpatterns.structural.adapter.IAircraft;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class C130Hercules implements IAlliancePart, IAircraft {

    @Override
    public void fly() {
        log.info("Hercules Flying !!!");
    }

    @Override
    public void land() {

    }

    @Override
    public int getPersonnel() {
        return 5;
    }
}
