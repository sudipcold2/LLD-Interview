package com.sudipcold.designpatterns.structural.adapter;

public class Adapter implements IAircraft{
    HotAirBalloon hotAirBalloon;

    public Adapter(HotAirBalloon hotAirBalloon) {
        this.hotAirBalloon = hotAirBalloon;
    }

    @Override
    public void fly() {
        String s = hotAirBalloon.inflateWithGas();
        hotAirBalloon.fly(s);
    }

    @Override
    public void land() {

    }
}
