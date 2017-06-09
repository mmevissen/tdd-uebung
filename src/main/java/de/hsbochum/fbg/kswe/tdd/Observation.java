package de.hsbochum.fbg.kswe.tdd;

import org.joda.time.DateTime;

/**
 * Created by mmevissen, Sven1113, mSobek33
 */
public class Observation {

    private double value;
    private DateTime dateTime;

    public Unit getUnit() {
        return unit;
    }

    private Unit unit;

    public Observation(double value, DateTime dateTime) {
        initialize(value, dateTime);
        this.unit = Unit.m;
    }

    public Observation(double value, DateTime dateTime, Unit unit) {
        initialize(value, dateTime);
        this.unit = unit;
    }

    private void initialize(double value, DateTime dateTime) {
        this.value = value;
        this.dateTime = dateTime;
    }

    public double getValue() {
        return value;
    }

    public DateTime getDateTime() {
        return dateTime;
    }
}
