package src.com.java.classesAndObjects.Exercise.Exe_4;

import java.util.Date;

public class Transaction {
    private char type;
    private double amount;
    private double balance;
    private Date date;
    private String description;

    public Transaction(char type, double amount, double balance, String description) {
        this.type = type;
        this.amount = amount;
        this.balance = balance;
        this.description = description;

        this.date = new Date();

    }

    public int getType() {
        return type;
    }
}
