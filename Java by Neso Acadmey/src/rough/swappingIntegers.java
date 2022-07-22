package src.com.java.rough;

import java.util.Scanner;

public class swappingIntegers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number 1: ");
        int num1 = sc.nextInt();
        System.out.print("Enter Number 1: ");
        int num2 = sc.nextInt();

        System.out.println("Before Swapping.");
        System.out.println("Number 1: " + num1);
        System.out.println("Number 2: " + num2);

        int temp;

        temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("After Swappping.");
        System.out.println("Number 1: " + num1);
        System.out.println("Number 2: " + num2);

    }

}
