package de.hsbochum.fbg.kswe.tdd;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by mmevissen, Sven1113, mSobek33
 */
public class TimeSeries {

    private String name;
    private List<Observation> observationList;

    private HashMap<Unit, Double> units = new HashMap<Unit, Double>()
    {{
        put(Unit.m,1.0);
        put(Unit.dm,0.1);
        put(Unit.cm,0.01);
        put(Unit.mm,0.001);
    }};

    public TimeSeries(String name) {
        this.name = name;
        this.observationList = new ArrayList<>();
    }

    public void addObservation(Observation observation) {
        this.observationList.add(observation);
    }

    public double calculateMean() {
        double sum = 0;
        for (Observation obs:  observationList) {
            sum += obs.getValue();
        }

        return sum/observationList.size();
    }

    public double calculateMean(Unit unit) {
        double sum = 0;
        for (Observation obs:  observationList) {
            sum += obs.getValue() * units.get(obs.getUnit());
        }

        return sum/observationList.size()/units.get(unit);
    }

}
