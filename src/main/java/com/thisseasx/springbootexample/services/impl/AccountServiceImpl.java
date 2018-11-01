package com.thisseasx.springbootexample.services.impl;

import com.thisseasx.springbootexample.dao.GenericDao;
import com.thisseasx.springbootexample.entities.Account;
import com.thisseasx.springbootexample.services.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {

    private final GenericDao<Account, Integer> accountDao;

    @Autowired
    public AccountServiceImpl(GenericDao<Account, Integer> accountDao) {
        this.accountDao = accountDao;
        this.accountDao.setType(Account.class);
    }

    @Override
    public Account getAccountById(int id) {
        return accountDao.getById(id);
    }

    @Override
    public List<Account> getAllAccounts() {
        return accountDao.getAll();
    }

    @Override
    public Account insertAccount(Account u) {
        return accountDao.insert(u);
    }

    @Override
    public Account deleteAccount(int id) {
        return accountDao.delete(id);
    }

    @Override
    public Account updateAccount(Account u) {
        return accountDao.update(u);
    }
}
