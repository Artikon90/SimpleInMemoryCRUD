package com.artikon90.db;

import com.artikon90.entity.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class SimpleDatabase {
    public static List<User> users = new ArrayList<User>() {{
        add(new User("Test123"));
        add(new User("Test111"));
        add(new User("Test222"));
        add(new User("Test333"));
        add(new User("Test444"));
    }};
}
