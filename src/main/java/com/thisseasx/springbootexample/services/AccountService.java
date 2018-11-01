package com.thisseasx.springbootexample.services;

import com.thisseasx.springbootexample.entities.Account;

import java.util.List;

public interface AccountService {

    Account getAccountById(int id);

    List<Account> getAllAccounts();

    Account insertAccount(Account a);

    Account deleteAccount(int id);

    Account updateAccount(Account a);
}
