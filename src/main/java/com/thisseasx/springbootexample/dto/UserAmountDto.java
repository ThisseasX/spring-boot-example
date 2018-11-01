package com.thisseasx.springbootexample.dto;

public class UserAmountDto {

    private String username;
    private Double amount;

    public UserAmountDto() {
    }

    public UserAmountDto(String username, Double amount) {
        this.username = username;
        this.amount = amount;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }
}
