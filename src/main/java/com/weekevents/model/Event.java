package com.weekevents.model;

import javax.persistence.*;
import java.time.LocalDateTime;

public class Event {

    public enum EventType{
        DEFAULT_TYPE
    }

    public Event() {
        this.name = "Default name";
        this.type = EventType.DEFAULT_TYPE;
        this.shortDescription = "Short description";
        this.fullDescription = "Full description";
        this.dateTimeOfEvent = LocalDateTime.now();
        this.mapPoint = new MapPoint();
        this.address = "Default address";
        this.creator = new User();
    }

    public Event(String name, EventType type, String shortDescription, String fullDescription,
                 LocalDateTime dateTimeOfEvent, MapPoint mapPoint, String address, User creator) {
        this.name = name;
        this.type = type;
        this.shortDescription = shortDescription;
        this.fullDescription = fullDescription;
        this.dateTimeOfEvent = dateTimeOfEvent;
        this.mapPoint = mapPoint;
        this.address = address;
        this.creator = creator;
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

    @Id
    @GeneratedValue(generator = "increment")
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "type")
    @Enumerated(EnumType.ORDINAL)
    public EventType getType() {
        return type;
    }

    public void setType(EventType type) {
        this.type = type;
    }

    @Column(name = "shortDescription")
    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    @Column(name = "description")
    public String getFullDescription() {
        return fullDescription;
    }

    public void setFullDescription(String fullDescription) {
        this.fullDescription = fullDescription;
    }

    @Column(name = "datetime")
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

    @Column(name = "address")
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
