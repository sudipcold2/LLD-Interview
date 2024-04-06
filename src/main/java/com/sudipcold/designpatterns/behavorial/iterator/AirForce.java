package com.sudipcold.designpatterns.behavorial.iterator;

import com.sudipcold.designpatterns.creational.builder.Boeing747;
import com.sudipcold.designpatterns.creational.builder.F16;
import com.sudipcold.designpatterns.creational.builder.IAircraft;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class AirForce {

    List<IAircraft> jets = new ArrayList<>();
    IAircraft[] helis = new IAircraft[1];
    LinkedList<Boeing747> cargo = new LinkedList<>();

    public List<IAircraft> getJets() {
        return jets;
    }

    public IAircraft[] getHelis() {
        return helis;
    }

    public LinkedList<Boeing747> getCargo() {
        return cargo;
    }

    public AirForce() {
        jets.add(new F16());
        helis[0] = new CobraGunship();
        cargo.add(new Boeing747());
    }

    // This method returns a concrete iterator that
    // traverses over the entire airforce planes.
    public Iterator createIterator() {
        return new AirForceIterator(this);

    }
}
