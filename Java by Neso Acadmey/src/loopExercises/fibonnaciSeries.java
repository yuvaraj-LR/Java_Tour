package src.com.java.loopExercises;

import java.util.Scanner;

public class fibonnaciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int first_num = 0;
        int second_num = 1;
        int sum = 1;
        int res = 0;

        System.out.print(first_num + " ");

        for (int i = 1; i<num; i++){
            System.out.print(sum + " ");
            sum = first_num + second_num;
            first_num = second_num;
            second_num = sum;
            res += sum;
        }

        System.out.println(" ");
        System.out.println("Result: "+ res);
    }
}
