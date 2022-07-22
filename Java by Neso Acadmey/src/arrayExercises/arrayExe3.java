package src.arrayExercises;

import java.util.Arrays;
import java.util.Scanner;

public class arrayExe3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] element = {1, 1, 3, 4, 5, 2, 1, 4, 6, 6};
        System.out.println(Arrays.toString(element));

        System.out.print("Enter a number to find occurance: ");
        int num = sc.nextInt();

        condition(element, num);
    }

    private static void condition(int[] ele, int n) {
        int times = 0;
        for (int i = 0; i < ele.length; i++) {
            if (ele[i] == n) {
                times += 1;
            }
        }

        System.out.println(n + " occurs " + times + " times.");
    }

}
