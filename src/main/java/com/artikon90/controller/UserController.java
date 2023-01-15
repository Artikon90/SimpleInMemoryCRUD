package com.artikon90.controller;

import com.artikon90.InfoDTO;
import com.artikon90.entity.User;
import com.artikon90.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService service;

    @Autowired
    public UserController(UserService service) {
        this.service = service;
    }

    @GetMapping("/getAll")
    public List<User> getAllUsers() {
        return service.getAllUsers();
    }

    @GetMapping("/{id}")
    public User getById(@PathVariable("id") int id) {
        return service.getUserById(id);
    }

    @PostMapping("/add")
    @ResponseBody
    public void addNewUser(@RequestBody InfoDTO info) {
        service.addNewUser(new User(info.getValue()));
    }

    @DeleteMapping("/delete/{id}")
    public void deleteUser(@PathVariable("id") int id) {
        service.deleteUserById(id);
    }

    @PatchMapping("/edit/{id}")
    public void editUser(@PathVariable("id") int id, @RequestBody InfoDTO info) {
        service.editUserById(id, info.getValue());
    }
}
