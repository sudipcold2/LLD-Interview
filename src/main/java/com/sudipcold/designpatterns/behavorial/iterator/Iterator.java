package com.sudipcold.designpatterns.behavorial.iterator;

import com.sudipcold.designpatterns.creational.builder.IAircraft;

public interface Iterator {
    IAircraft next();
    boolean hasNext();
}
