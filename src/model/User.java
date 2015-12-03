package model;

import java.util.List;

public class User {

    private int id;
    private String login;
    private String password;
    private String role;
    private List<Event> eventsToGo;

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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public List<Event> getEventsToGo() {
        return eventsToGo;
    }

    public void setEventsToGo(List<Event> eventsToGo) {
        this.eventsToGo = eventsToGo;
    }
}
