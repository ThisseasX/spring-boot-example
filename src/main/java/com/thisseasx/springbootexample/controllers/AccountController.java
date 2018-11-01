package com.thisseasx.springbootexample.controllers;

import com.thisseasx.springbootexample.entities.Account;
import com.thisseasx.springbootexample.services.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/accounts")
@RestController
public class AccountController {

    private final AccountService AccountService;

    @Autowired
    public AccountController(AccountService AccountService) {
        this.AccountService = AccountService;
    }

    @GetMapping("/{id}")
    public Account getAccountById(@PathVariable int id) {
        return AccountService.getAccountById(id);
    }

    @GetMapping
    public List<Account> getAllAccounts() {
        return AccountService.getAllAccounts();
    }

    @PostMapping
    public Account insertAccount(@RequestBody Account u) {
        return AccountService.insertAccount(u);
    }

    @DeleteMapping
    public Account deleteAccount(@RequestParam int id) {
        return AccountService.deleteAccount(id);
    }

    @PutMapping
    public Account updateAccount(@RequestBody Account u) {
        return AccountService.updateAccount(u);
    }
}
