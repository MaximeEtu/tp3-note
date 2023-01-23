package com.ensimTP3.ensim.model;

public class Feature {

    private String type;
    private Geometry geometry;

    public Feature() {
    }

    public Feature(String type, Geometry geometry) {
        this.type = type;
        this.geometry = geometry;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Geometry getGeometry() {
        return geometry;
    }

    public void setGeometry(Geometry geometry) {
        this.geometry = geometry;
    }
}
