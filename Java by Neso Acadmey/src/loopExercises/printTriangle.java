package src.com.java.loopExercises;

import java.util.Scanner;

public class printTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of time that the loop to be produced: ");
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++){
            for (int j = 1; j <= i; j++){
                System.out.print(i);
            }
            System.out.println(" ");
        }
    }
}
