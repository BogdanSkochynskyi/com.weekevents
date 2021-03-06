package com.weekevents.dao;

import com.weekevents.model.Event;
import com.weekevents.model.MapPoint;
import com.weekevents.model.User;

import java.time.LocalDateTime;
import java.util.List;

public interface EventDAO {

    Event createEvent(Event event);

    Event findEventById(int id);

    Event findEventByName(String name);

    List<Event> findAllEvents();

    List<Event> findEventsByDate(LocalDateTime dateTime);

    List<Event> findEventsByMapPoint(MapPoint mapPoint);

    List<Event> findEventsByCreator(User user);

    List<Event> findEventsByEventType(Event.EventType eventType);

    Event updateEvent(Event event);

    boolean deleteEvent(Event event);
}
