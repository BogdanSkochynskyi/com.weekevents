package com.weekevents.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class MapPoint {

    private int id;
    private double lng; // долгота
    private double lat; // широта

    public MapPoint(double lng, double lat) {
        this.lng = lng;
        this.lat = lat;
    }

    public MapPoint() {
        this.lat = 0.0;
        this.lng = 0.0;
    }

    @Id
    @GeneratedValue(generator = "increment")
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "longitude")
    public double getLng() {
        return lng;
    }

    public void setLng(double lng) {
        this.lng = lng;
    }

    @Column(name = "latitude")
    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

}
