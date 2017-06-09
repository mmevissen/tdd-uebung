package de.hsbochum.fbg.kswe.tdd;

import org.joda.time.DateTime;

/**
 * Created by mmevissen, Sven1113, mSobek33
 */
public class Observation {

    private double value;
    private DateTime dateTime;

    public Observation(double value, DateTime dateTime) {
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
