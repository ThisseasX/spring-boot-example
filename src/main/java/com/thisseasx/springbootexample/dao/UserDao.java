package com.thisseasx.springbootexample.dao;

import com.thisseasx.springbootexample.dto.UserAmountDto;
import com.thisseasx.springbootexample.entities.User;

import java.util.List;

public interface UserDao extends GenericDao<User, Integer> {

    List<UserAmountDto> getUserAmounts();
}
