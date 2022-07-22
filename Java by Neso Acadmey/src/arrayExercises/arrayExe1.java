package src.arrayExercises;

import java.util.Arrays;
import java.util.Scanner;

public class arrayExe1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many numbers do you want? ");
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

        for (int i = 0; i < n; i++) {
            System.out.print("Enter num " + i + " : ");
            number[i] = sc.nextInt();
        }

        System.out.println();
        System.out.println("Here your array list.");
        System.out.println(Arrays.toString(number));

//        for (int i = 0; i < number.length; i++) {
//            System.out.print(number[i] + " ");
//        }
    }
}
