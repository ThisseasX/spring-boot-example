package com.thisseasx.springbootexample.dao.impl;

import com.thisseasx.springbootexample.dao.UserDao;
import com.thisseasx.springbootexample.dto.UserAmountDto;
import com.thisseasx.springbootexample.entities.User;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Repository
public class UserDaoImpl extends GenericDaoImpl<User, Integer> implements UserDao {

    @Override
    public List<UserAmountDto> getUserAmounts() {
        return em
                .createQuery("SELECT NEW com.thisseasx.springbootexample.dto.UserAmountDto(u.username, u.account.amount) FROM User u", UserAmountDto.class)
                .getResultList();
    }
}

