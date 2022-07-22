package src.com.java.controlStatment;

import java.util.Scanner;

public class nestedIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num>10){
            System.out.println(num + " is greater than 10.");
        }
        else if (num<10){
            System.out.println(num + " is lesser than 10.");
        }
        else{
            System.out.println(num + " is equal to 10.");
        }
    }
}
