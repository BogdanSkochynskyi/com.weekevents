package com.weekevents.model;

import java.time.LocalDateTime;

public class Event {

    public enum EventType{

    }

    private int id;
    private String name;
    private EventType type;
    private String shortDescription;
    private String fullDescription;
    private LocalDateTime dateTimeOfEvent;
    //TODO: add photo. Which type select for it?
    private MapPoint mapPoint;
    private String address;
    private User creator;

    //TODO: price? some other features???

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EventType getType() {
        return type;
    }

    public void setType(EventType type) {
        this.type = type;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getFullDescription() {
        return fullDescription;
    }

    public void setFullDescription(String fullDescription) {
        this.fullDescription = fullDescription;
    }

    public LocalDateTime getDateTimeOfEvent() {
        return dateTimeOfEvent;
    }

    public void setDateTimeOfEvent(LocalDateTime dateTimeOfEvent) {
        this.dateTimeOfEvent = dateTimeOfEvent;
    }

    public MapPoint getMapPoint() {
        return mapPoint;
    }

    public void setMapPoint(MapPoint mapPoint) {
        this.mapPoint = mapPoint;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public User getCreator() {
        return creator;
    }

    public void setCreator(User creator) {
        this.creator = creator;
    }
}
