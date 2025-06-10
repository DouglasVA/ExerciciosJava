package com.douglasva.bankaccount.entities;

public class BankAccount {

    private int accountNumber;
    private String accountHolder;
    private double accountBalance;

    public BankAccount(int accountNumber, String accountHolder) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.accountBalance = 0.0;
    }

    public BankAccount(int accountNumber, String accountHolder, double initialDeposit) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        deposit(initialDeposit);
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            accountBalance += amount;
        }
    }

    public void withdraw(double amount) {
        double fee = 5.0;
        accountBalance -= (amount + fee);
    }

    @Override
    public String toString() {
        return "Account " + accountNumber
                + ", Holder: " + accountHolder
                + ", Balance: $ " + String.format("%.2f", accountBalance);
    }
}
