package src.arrayExercises;

import java.util.Arrays;
import java.util.Scanner;

public class arrayExe2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many numbers do you want (MAX-20)? ");
        int userNum = sc.nextInt();

        while (userNum > 20 || userNum < 1) {
            System.out.println("Invalid Number! Try again: ");
            userNum = sc.nextInt();
        }
        createNumbers(userNum);
    }

    public static void createNumbers(int n){
        Scanner sc = new Scanner(System.in);
        int[] number = new int[n];
        int sum = 0;
        long product = 1;
        double average;

        for (int i = 0; i < n; i++) {
            System.out.print("Enter num " + (i+1) + " : ");
            number[i] = sc.nextInt();
            sum += number[i];
            product *= number[i];
        }

        average = (double) sum/n;

        System.out.println();
        System.out.println("Here your array list.");
        System.out.println(Arrays.toString(number));

        System.out.println();
        System.out.println("Sum of your array: " + sum);
        System.out.println("Product of your array: " + product);
        System.out.println("Average of your array: " + average);
    }
}
