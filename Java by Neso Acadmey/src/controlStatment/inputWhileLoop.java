package src.com.java.controlStatment;

import java.util.Scanner;

public class inputWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        boolean check = true;

        while(true){
            System.out.print("Enter your favourite number between 0 - 9: ");
            byte num = sc.nextByte();

            if (num >= 0 && num <=9){
                System.out.println("Your favourite number is "+ num);
                break;
            }
            else {
                System.out.println("Please enter a number between 0-9.");

            }
        }
    }
}
