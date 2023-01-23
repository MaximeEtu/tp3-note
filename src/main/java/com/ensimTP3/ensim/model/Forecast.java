package com.ensimTP3.ensim.model;

public class Forecast {

    private double tmin;
    private double tmax;
    private String datetime;

    public Forecast() {}
    public Forecast(double tmin, double tmax, String datetime) {
        this.tmin = tmin;
        this.tmax = tmax;
        this.datetime = datetime;
    }

    public double getTmin() {
        return tmin;
    }

    public void setTmin(double tmin) {
        this.tmin = tmin;
    }

    public double getTmax() {
        return tmax;
    }

    public void setTmax(double tmax) {
        this.tmax = tmax;
    }

    public String getDatetime() {
        return datetime;
    }

    public void setDatetime(String datetime) {
        this.datetime = datetime;
    }
}
