package model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "user")
public class User {

    private int id;
    private String login;
    private String email;
    private String password;
    private UserRole role;
    private List<Event> eventsToGo;
    private List<Event> createdEvents;

    public User() {
        this.login ="";
        this.email = "";
        this.password = "";
        this.role = UserRole.GUEST;
    }

    public User(String login, String email, String password, UserRole role) {
        this.login = login;
        this.email = email;
        this.password = password;
        this.role = role;
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

    @Column(name = "login")
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    @Column(name = "email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Column(name = "password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Column(name = "role")
    @Enumerated(EnumType.ORDINAL)
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
