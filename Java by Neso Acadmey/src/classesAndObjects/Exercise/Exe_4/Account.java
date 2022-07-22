package src.com.java.classesAndObjects.Exercise.Exe_4;

import src.com.java.classesAndObjects.Exercise.Exe_3.Client;
import java.util.ArrayList;
import java.util.Date;

public class Account {
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;
    private Client client;
    private ArrayList<Transaction> transactions;


    public Account(int id, double balance, double annualInterestRate, Client client) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
        this.client = client;


        this.transactions = new ArrayList<>();
        dateCreated = new Date();
    }

    public boolean withdraw(double amount) {
        if (balance < amount) return false;

        balance -= amount;
        this.transactions.add(new Transaction('W', amount, this.balance, "Withdrawn " + amount));
        return true;

    }

    public void deposit(double amount) {
        balance += amount;
        this.transactions.add(new Transaction('D', amount, this.balance, "Deposited " + amount));

    }

    public int countTransactions(char type){

        int count = 0;
        for (Transaction transaction : transactions){
            if (transaction.getType() == type) {
                count++;
            }
        }
        return count;
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

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public String toString() {
        return  this.id + " " + this.balance + " " + this.annualInterestRate + " " + this.dateCreated;
    }
}

