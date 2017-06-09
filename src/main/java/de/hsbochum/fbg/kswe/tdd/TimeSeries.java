package de.hsbochum.fbg.kswe.tdd;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mmevissen, Sven1113, mSobek33
 */
public class TimeSeries {

    private String name;
    private List<Observation> observationList;

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
}
