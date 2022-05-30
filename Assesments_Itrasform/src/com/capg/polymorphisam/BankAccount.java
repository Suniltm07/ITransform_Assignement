package com.capg.polymorphisam;

public class BankAccount {
	private String name;
    private double balance;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public double getBalance() {
    	return this.balance;
    }
    public void setBalance(double balance) {
    	this.balance=balance;
    }

    public void deposite(double amount) {
     this.balance += amount;
    }
   
    public boolean withdraw(double amount) {
        if (balance > amount) {
            balance -= amount;
            return true;
        } else {
            return false;
        }
    }

}
