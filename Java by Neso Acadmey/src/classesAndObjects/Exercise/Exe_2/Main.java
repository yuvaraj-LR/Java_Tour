package src.com.java.classesAndObjects.Exercise.Exe_2;

public class Main {
    public static void main(String[] args) {
        Account testaccount = new Account(1121, 20000, 4.5);
        if(testaccount.withdraw(1500))
            System.out.println("Withdraw Successful.");
        else System.out.println("Insufficient Amount.");
        testaccount.deposit(2000);
        System.out.println("Id: " + testaccount.getId() +
                " Balance: " + testaccount.getBalance() +
                " Annual Interest: " + testaccount.getAnnualInterestRate() +
                " Withdraw Date: " + testaccount.getDateCreated());
    }
}
