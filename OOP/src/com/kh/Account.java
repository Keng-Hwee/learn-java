package com.kh;

public class Account {
    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    // constructor -- empty fields
    public Account() {
        this("0000", 0.0, "default name", "default email", "default phone number");
        System.out.println("Empty constructor called");
    }

    // main constructor -- all fields specified
    public Account(String accountNumber, double balance, String customerName, String email, String phoneNumber) {
        System.out.println("Account constructor with parameters called");
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    // constructor -- some fields specified
    public Account(String customerName, String email, String phoneNumber) {
        this("0000", 0.0, customerName, email, phoneNumber);
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void deposit(double depositAmount) {
        this.balance += depositAmount;
        System.out.println("Deposit of " + depositAmount + " processed. Current balance = " + this.balance);
    }

    public void withdraw(double withdrawAmount) {
        if(this.balance - withdrawAmount < 0){
            System.out.println("Only " + this.balance + " available. Withdrawal not processed");
        } else {
            this.balance -= withdrawAmount;
            System.out.println("Withdrawal of " + withdrawAmount + " processed. Remaining balance = " + this.balance);
        }
    }


}
