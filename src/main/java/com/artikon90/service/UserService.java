package com.artikon90.service;

import com.artikon90.db.SimpleDatabase;
import com.artikon90.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    public User getUserById(int id) {
        return SimpleDatabase.users.stream()
                .filter(e -> e.getId() == id)
                .findFirst()
                .orElse(null);
    }

    public List<User> getAllUsers() {
        return SimpleDatabase.users;
    }

    public void addNewUser(User user) {
        SimpleDatabase.users.add(user);
    }

    public void deleteUserById(int id) {
        SimpleDatabase.users.removeIf(e -> e.getId() == id);
    }

    public void editUserById(int id, String newUsername) {
        SimpleDatabase.users.stream()
                .filter(e -> e.getId() == id)
                .findFirst()
                .get()
                .setUsername(newUsername);
    }

}
