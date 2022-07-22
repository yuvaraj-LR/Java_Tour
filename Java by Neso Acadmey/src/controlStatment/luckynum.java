package src.com.java.controlStatment;

import java.util.Scanner;

public class luckynum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Here we find out is your four digit number is lucky or not.");
        System.out.print("Please enter your four digit lucky number: ");
        int num = sc.nextInt();

        if(!( num < 10000 && num > 999)){
            System.out.println("Please enter a valid four digit number.");
            System.out.println(num + " is not a four digit number.");
        }
        else {
            int num4 = num % 10;
            int num3 = (num / 10) % 10;
            int num2 = (num / 100) % 10;
            int num1 = (num / 1000) % 10;

            //System.out.println(num1);
            //System.out.println(num2);
            //System.out.println(num3);
            //System.out.println(num4);

            if (num1 + num2 == num3 + num4) {
                System.out.println(num + " is a lucky number.");
            }
            else {
                System.out.println(num + " is not a lucky number.");
            }
        }
    }
}
