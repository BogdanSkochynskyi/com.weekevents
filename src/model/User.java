package model;

import java.util.List;

public class User {

    private int id;
    private String login;
    private String email;
    private String password;
    private UserRole role;
    private List<Event> eventsToGo;
    private List<Event> createdEvents;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserRole getRole() {
        return role;
    }

    public void setRole(UserRole role) {
        this.role = role;
    }

    public List<Event> getEventsToGo() {
        return eventsToGo;
    }

    public void setEventsToGo(List<Event> eventsToGo) {
        this.eventsToGo = eventsToGo;
    }

    public List<Event> getCreatedEvents() {
        return createdEvents;
    }

    public void setCreatedEvents(List<Event> createdEvents) {
        this.createdEvents = createdEvents;
    }

    public enum UserRole {
        ADMINISTRATOR, MODERATOR, REGISTERED, GUEST
    }
}
