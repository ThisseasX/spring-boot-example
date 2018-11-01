package com.thisseasx.springbootexample.services;

import com.thisseasx.springbootexample.dto.UserAmountDto;
import com.thisseasx.springbootexample.entities.User;

import java.util.List;

public interface UserService {

    User getUserById(int id);

    List<User> getAllUsers();

    User insertUser(User u);

    User deleteUser(int id);

    User updateUser(User u);

    List<UserAmountDto> getUserAmounts();
}
