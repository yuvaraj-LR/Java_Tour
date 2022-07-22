package src.com.java.loopExercises;

import java.util.Scanner;

public class maxAndMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int max_num = num;
        int min_num = num;

        if (num > 0){
            while(true){
                num = sc.nextInt();

                if(num<0){
                    break;
                }

                max_num = (num > max_num) ? num : max_num;
                min_num = (num < min_num) ? num : min_num;
            }
            System.out.println("Maximum: " + max_num);
            System.out.println("Minimum: " + min_num);
        }
        else
        {
            System.out.println("Please enter a positive number.");
        }

    }
}
