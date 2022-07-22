package src.javaBasics;

import java.util.Scanner;

public class scannerClassFavNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your favourite number: ");
        int choice = input.nextInt();
        System.out.println(choice + " is my favourite number too!");
    }
}
