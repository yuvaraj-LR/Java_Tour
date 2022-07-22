package src.com.java.classesAndObjects.Exercise.Exe_4;

import src.com.java.classesAndObjects.Exercise.Exe_3.Client;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Account> accounts = new ArrayList<>();

        Client client = new Client(121, "Yuvi", "191817");

        accounts.add(new Account(1,1000,1.3, client));
        accounts.add(new Account(2,5400,2.3, client));

        accounts.get(0).withdraw(200);
        accounts.get(0).withdraw(200);
        accounts.get(0).deposit(1200);
        accounts.get(0).withdraw(600);

        for (Account account :
                accounts) {
            System.out.println("Account " + account.getId() + ":");
            System.out.println("W:" + account.countTransactions('W'));
            System.out.println("D:" + account.countTransactions('D'));

        }


    }
}
