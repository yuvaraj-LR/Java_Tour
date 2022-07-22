package src.com.java.patternPrograms;

import java.util.Scanner;

public class quiz1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to find the multiple of 3 and 5: ");
        int num = sc.nextInt();

        multiOfThree(num);
        multiOfFive(num);
    }

    public static void multiOfThree(int number){
        int ans = 0;
        System.out.println();
        System.out.println("Multiples of 3: ");
        for (int i = 1; i <= number; i++) {
            ans = i*3;
            if (i != number) {
                System.out.print(ans + ", ");
            }else{
                System.out.println(ans + ".");
            }
        }
    }

    public static void multiOfFive(int number){
        int ans = 0;
        System.out.println();
        System.out.println("Multiples of 5: ");
        for (int i = 1; i <= number; i++) {
            ans = i*5;
            if (i != number) {
                System.out.print(ans + ", ");
            }else{
                System.out.println(ans + ".");
            }
        }
    }
}
