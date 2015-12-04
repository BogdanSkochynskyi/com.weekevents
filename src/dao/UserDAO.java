package dao;

import model.Event;
import model.User;

import java.util.List;

public interface UserDAO {

    User createUser(User user);

    User findUserById(int id);

    User findUserByEvent(Event event);

    User findUserByEmail(String email);

    List<User> findUsersByRole(User.UserRole role);

    List<User> findAllUsers();

    User updateUser(User user);

    boolean deleteUser(User user);
}
