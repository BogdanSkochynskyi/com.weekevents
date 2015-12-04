package dao;

import model.Event;
import model.MapPoint;
import model.User;

import java.time.LocalDateTime;
import java.util.List;

public interface EventDAO {

    Event createEvent(Event event);

    Event findEventById(int id);

    List<Event> findAllEvents();

    List<Event> findEventsByDate(LocalDateTime dateTime);

    List<Event> findEventsByMapPoint(MapPoint mapPoint);

    List<Event> findEventsByCreator(User user);

    Event updateEvent(Event event);

    boolean deleteEvent(Event event);
}
