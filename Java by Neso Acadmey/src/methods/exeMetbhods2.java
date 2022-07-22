package src.com.java.methods;

import java.util.Scanner;

public class exeMetbhods2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers to find prime numbers.");
        System.out.print("Where to start? ");
        int start = sc.nextInt();
        System.out.print("Where to end? ");
        int end = sc.nextInt();

        System.out.println("Here the Prime Numbers are:");
        printPrimes(start, end);

    }

    public static boolean condition(int n) {
        for (int i = 2; i <= n/2; i++) {
            if (n%i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void printPrimes(int startValue, int endValue){
        for (int i = startValue; i <= endValue; i++) {
            if (condition(i)) {
                System.out.print(i + " ");
            }
        }
    }
}
