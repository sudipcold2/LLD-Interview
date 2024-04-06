package com.sudipcold.designpatterns.behavorial.command;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class F16LandingGear implements LandingGear {
    @Override
    public void up() {
      log.info("F16 landing Gear Down.");
    }
}
