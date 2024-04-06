package com.sudipcold.designpatterns.behavorial.iterator;

import com.sudipcold.designpatterns.creational.builder.Boeing747;
import com.sudipcold.designpatterns.creational.builder.IAircraft;

import java.util.LinkedList;
import java.util.List;

public class AirForceIterator implements Iterator{

    List<IAircraft> jets;
    IAircraft[] helis;
    LinkedList<Boeing747> cargo;
    int jetsPosition = 0;
    int helisPosition = 0;
    int cargoPosition = 0;

    public AirForceIterator(AirForce airForce) {
        jets = airForce.getJets();
        helis = airForce.getHelis();
        cargo = airForce.getCargo();
    }

    @Override
    public IAircraft next() {
        if (helisPosition < helis.length) {
            return helis[helisPosition++];
        }

        // return jets second
        if (jetsPosition < jets.size()) {
            return jets.get(jetsPosition++);
        }

        // return cargos last
        if (cargoPosition < cargo.size()) {
            return cargo.get(cargoPosition++);
        }

        throw new RuntimeException("No more elements");
    }

    @Override
    public boolean hasNext() {
        return helis.length > helisPosition ||
                jets.size() > jetsPosition ||
                cargo.size() > cargoPosition;
    }
}
