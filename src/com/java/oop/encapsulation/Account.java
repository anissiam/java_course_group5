package com.java.oop.encapsulation;

public class Account {
    private String name ;
    private String email;
    private double amount;
    private int accountNo;

    public Account() {
    }

    public Account(String name, String email, double amount, int accountNo) {
        this.setName(name);
        this.setEmail(email);
        this.setAmount(amount);
        this.setAccountNo(accountNo);
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAmount() {
        return amount;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

}
