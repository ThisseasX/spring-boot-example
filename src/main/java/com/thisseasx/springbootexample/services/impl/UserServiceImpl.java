package com.thisseasx.springbootexample.services.impl;

import com.thisseasx.springbootexample.dao.UserDao;
import com.thisseasx.springbootexample.dto.UserAmountDto;
import com.thisseasx.springbootexample.entities.User;
import com.thisseasx.springbootexample.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserDao userDao;

    @Autowired
    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
        this.userDao.setType(User.class);
    }

    @Override
    public User getUserById(int id) {
        return userDao.getById(id);
    }

    @Override
    public List<User> getAllUsers() {
        return userDao.getAll();
    }

    @Override
    public User insertUser(User u) {
        return userDao.insert(u);
    }

    @Override
    public User deleteUser(int id) {
        return userDao.delete(id);
    }

    @Override
    public User updateUser(User u) {
        return userDao.update(u);
    }

    @Override
    public List<UserAmountDto> getUserAmounts() {
        return userDao.getUserAmounts();
    }
}
