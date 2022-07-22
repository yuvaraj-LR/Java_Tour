package src.com.java.controlStatment;

import java.util.Scanner;

public class OddorEvenSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = input.nextInt();
        int ans = num%2;

        switch (ans){
            case 0:
                System.out.println(num+ " is even.");
                break;
            case 1:
                System.out.println(num + " is odd.");
        }


    }

}
