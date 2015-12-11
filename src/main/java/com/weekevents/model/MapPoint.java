package com.weekevents.model;

import javax.persistence.*;

@Entity
@Table(name = "mapPoint")
public class MapPoint {

    @Id
    @GeneratedValue(generator = "increment")
    @Column(name = "id")
    private int id;

    @Column(name = "longitude")
    private double lng; // долгота
    
    @Column(name = "latitude")
    private double lat; // широта

    public MapPoint(double lng, double lat) {
        this.lng = lng;
        this.lat = lat;
    }

    public MapPoint() {
        this.lat = 0.0;
        this.lng = 0.0;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getLng() {
        return lng;
    }

    public void setLng(double lng) {
        this.lng = lng;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

}
