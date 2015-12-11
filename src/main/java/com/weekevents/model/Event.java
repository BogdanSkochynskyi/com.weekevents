package com.weekevents.model;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "event")
public class Event {

    public enum EventType{
        DEFAULT_TYPE
    }


    private int id;

    @Column(name = "name")
    private String name;

    private EventType type;

    @Column(name = "shortDescription")
    private String shortDescription;

    @Column(name = "description")
    private String fullDescription;

    @Column(name = "datetime")
    private LocalDateTime dateTimeOfEvent;
    //TODO: add photo. Which type select for it?

    @OneToOne
    @JoinColumn(name = "mapPoint_id")
    private MapPoint mapPoint;

    @Column(name = "address")
    private String address;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    //TODO: price? some other features???


    public Event() {
    }

    public Event(String name, EventType type, String shortDescription, String fullDescription,
                 LocalDateTime dateTimeOfEvent, MapPoint mapPoint, String address, User user) {
        this.name = name;
        this.type = type;
        this.shortDescription = shortDescription;
        this.fullDescription = fullDescription;
        this.dateTimeOfEvent = dateTimeOfEvent;
        this.mapPoint = mapPoint;
        this.address = address;
        this.user = user;
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

    public String getName() {
        return name;
    }

    @Column(name = "type")
    @Enumerated(EnumType.STRING)
    public EventType getType() {
        return type;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public String getFullDescription() {
        return fullDescription;
    }

    public LocalDateTime getDateTimeOfEvent() {
        return dateTimeOfEvent;
    }

    public MapPoint getMapPoint() {
        return mapPoint;
    }

    public String getAddress() {
        return address;
    }

    public User getUser() {
        return user;
    }

    public void setType(EventType type) {
        this.type = type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public void setFullDescription(String fullDescription) {
        this.fullDescription = fullDescription;
    }

    public void setDateTimeOfEvent(LocalDateTime dateTimeOfEvent) {
        this.dateTimeOfEvent = dateTimeOfEvent;
    }

    public void setMapPoint(MapPoint mapPoint) {
        this.mapPoint = mapPoint;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setUser(User creator) {
        this.user = creator;
    }
}
