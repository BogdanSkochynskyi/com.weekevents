package com.weekevents.model;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "event")
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
        this.user = new User();
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

    private int id;

    private String name;

    private EventType type;

    private String shortDescription;

    private String fullDescription;

    private LocalDateTime dateTimeOfEvent;
    //TODO: add photo. Which type select for it?
    private MapPoint mapPoint;

    private String address;
    private User user;

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

    @Column(name = "type")
    @Enumerated(EnumType.ORDINAL)
    public EventType getType() {
        return type;
    }

    @Column(name = "shortDescription")
    public String getShortDescription() {
        return shortDescription;
    }

    @Column(name = "description")
    public String getFullDescription() {
        return fullDescription;
    }

    @Column(name = "datetime")
    public LocalDateTime getDateTimeOfEvent() {
        return dateTimeOfEvent;
    }

    @OneToOne
    @JoinColumn(name = "mapPoint_id")
    public MapPoint getMapPoint() {
        return mapPoint;
    }

    @Column(name = "address")
    public String getAddress() {
        return address;
    }

    @ManyToOne
    @JoinColumn(name = "user_id")
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
