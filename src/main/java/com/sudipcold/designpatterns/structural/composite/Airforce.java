package com.sudipcold.designpatterns.structural.composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Airforce implements IAlliancePart {
    List<IAlliancePart> planes = new ArrayList<>();

    public void add(IAlliancePart iAlliancePart){
        planes.add(iAlliancePart);
    }


    @Override
    public int getPersonnel() {
        Iterator<IAlliancePart> iAlliancePartIterator = planes.listIterator();
        int totalPersonnelInAirForce = 0;
        while (iAlliancePartIterator.hasNext()){
            totalPersonnelInAirForce += iAlliancePartIterator.next().getPersonnel();
        }

        return totalPersonnelInAirForce;
    }
}
