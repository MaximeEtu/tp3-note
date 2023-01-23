package com.ensimTP3.ensim.model;

public class Meteo {

    private Forecast[] forecast;

    public Meteo() {}
    public Meteo(Forecast[] forecast) {
        this.forecast = forecast;
    }

    public Forecast[] getForecast() {
        return forecast;
    }

    public void setForecast(Forecast[] forecast) {
        this.forecast = forecast;
    }
}
