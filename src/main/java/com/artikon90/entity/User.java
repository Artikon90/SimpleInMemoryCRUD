package com.artikon90.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {
    private static int idCounter = 0;
    private int id;
    private String username;

    public User(String username) {
        this.id = ++idCounter;
        this.username = username;
    }
}
