package src.com.java.classesAndObjects.Exercise.Exe_3;

import src.com.java.classesAndObjects.Exercise.Exe_2.Account;

public class Main {
    public static void main(String[] args) {
        Client[] clients = new Client[2];
        clients[0] = new Client(10, "Yuvaraj", "272727");
        clients[0].addAccount(new Account(1, 10000, 4.5));
        clients[0].addAccount(new Account(2, 32000, 1.5));

        clients[1] = new Client(11, "Jana", "818181");
        clients[1].addAccount(new Account(3, 2000, 2.5));
        clients[1].addAccount(new Account(4, 12400, 5.5));
        clients[1].addAccount(new Account(5, 100, 3.5));

        System.out.println(clients[0].toString());
        System.out.println(clients[1].toString());



    }
}
