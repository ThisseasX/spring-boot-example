package com.thisseasx.springbootexample.controllers;

import com.thisseasx.springbootexample.dto.UserAmountDto;
import com.thisseasx.springbootexample.entities.User;
import com.thisseasx.springbootexample.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/users")
@RestController
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/amounts")
    public List<UserAmountDto> getUserAmounts() {
        return userService.getUserAmounts();
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable int id) {
        return userService.getUserById(id);
    }

    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @PostMapping
    public User insertUser(@RequestBody User u) {
        return userService.insertUser(u);
    }

    @DeleteMapping
    public User deleteUser(@RequestParam int id) {
        return userService.deleteUser(id);
    }

    @PutMapping
    public User updateUser(@RequestBody User u) {
        return userService.updateUser(u);
    }
}
