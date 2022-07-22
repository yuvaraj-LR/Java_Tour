package src.com.java.patternPrograms;

import java.util.Scanner;

public class quiz2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to find factorial: ");
        int num = sc.nextInt();

        factorial(num);
    }

    public static void factorial(int n){
        int ans = 1;
        for (int i = n; i > 0 ; i--) {

            ans *= i;

            if (i != 1){
                System.out.print(i + " * ");
            }
            else{
                System.out.print(i + " = " + ans);
            }

        }
        System.out.println();

        System.out.println("The factorial of the number " + n + " is " + ans + ".");
    }
}
