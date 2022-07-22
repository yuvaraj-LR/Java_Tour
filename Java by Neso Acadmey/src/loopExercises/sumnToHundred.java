package src.com.java.loopExercises;

import java.util.Scanner;

public class sumnToHundred {
    public static void main(String[] args) {
        System.out.println("The sum of all numbers should not be crossed more than 100.");
        Scanner sc = new Scanner(System.in);
        short sum=0;

        while (true) {
            System.out.print("Enter the number: ");
            short num_1 = sc.nextByte();

            sum += num_1;

            if (sum >= 100) {
                System.out.println(sum + " you have crossed more than 100.");
                break;
            }

            System.out.println("Total: " + sum);
        }
    }
}
