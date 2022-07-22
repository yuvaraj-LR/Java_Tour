package src.com.java.classesAndObjects.Exercise.Exe_2;

import java.util.Date;

public class Account {
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;

    public Account(int id, double balance, double annualInterestRate) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;

        dateCreated = new Date();
        dateCreated.getTime();
    }

    public boolean withdraw(double amount) {
        if (balance < amount) return false;

        balance -= amount;
        return true;

    }

    public void deposit(double amount) {
        balance += amount;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public String toString() {
        return  this.id + " " + this.balance + " " + this.annualInterestRate + " " + this.dateCreated;
    }

}
