package com.alishevspring.dao;

import com.alishevspring.model.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserDAO {

    private static int USERS_COUNT;
    private List<User> users;

    {
        users = new ArrayList<>();
        users.add(new User(++USERS_COUNT, "Tom"));
        users.add(new User(++USERS_COUNT, "Sam"));
        users.add(new User(++USERS_COUNT, "Timmy"));
        users.add(new User(++USERS_COUNT, "Jhon"));
    }

    public List<User> index() {
        return users;
    }

    public User show(int id) {
        return users.stream().filter(user -> user.getId() == id).findFirst().orElse(null);
    }

}
