
package com.mk7.atm;


public class BankAccount {
        private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public boolean withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            return true; // Successful withdrawal
        } else {
            System.out.println("Insufficient funds.");
            return false; // Failed withdrawal
        }
    }
}
