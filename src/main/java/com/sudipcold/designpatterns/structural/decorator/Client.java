package com.sudipcold.designpatterns.structural.decorator;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Client {

    public static void main(String[] args) {
        IAircraft simpleBoeing = new Boeing747();
        IAircraft luxuryBoeing = new LuxuryFittingsDecorator(simpleBoeing);
        IAircraft bulletProofBoeing = new BulletProofDecorator(luxuryBoeing);
        log.info("Boeing with luxury and bullet proof glass {}", bulletProofBoeing.getWeight());
    }
}
