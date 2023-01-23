package com.ensimTP3.ensim.model;

public class Forecast {

    private double weather;
    private double tmin;
    private double tmax;

    public Forecast() {}
    public Forecast(double weather, double tmin, double tmax) {
        this.weather = weather;
        this.tmin = tmin;
        this.tmax = tmax;
    }

    public double getWeather() {
        return weather;
    }

    public void setWeather(double weather) {
        this.weather = weather;
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
}
