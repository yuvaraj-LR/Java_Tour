package src.com.java.controlStatment;

import java.util.Scanner;

public class inputDoWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        System.out.print("Please enter your favourite number between 0 to 9: ");
//        byte num = sc.nextByte();
        byte num;

        do {
            System.out.println("Please enter a number between 0 to 9.");
            num = sc.nextByte();
        }while(num<=0 || num>=9);

        System.out.println("Your favourite number is "+num);
    }
}
