package com.sudipcold.designpatterns.structural.composite;

import com.sudipcold.designpatterns.structural.adapter.IAircraft;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class F16 implements IAircraft, IAlliancePart{
    @Override
    public void fly() {
      log.info("F16 BOOM ~~~");
    }

    @Override
    public void land() {

    }

    @Override
    public int getPersonnel() {
        return 2;
    }
}
