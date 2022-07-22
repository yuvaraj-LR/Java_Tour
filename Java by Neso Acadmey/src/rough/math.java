package src.com.java.rough;

import java.util.*;

public class math {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.print("Enter an integer number: ");
        num = sc.nextInt();

        System.out.println("Square of " + num + " is: " + Math.pow(num, 2));
        System.out.println("Cube of " + num + " is: " + Math.pow(num, 3));
        System.out.println("Maximum " + num + " is: " + Math.max(num,30));
        System.out.println("Minimum " + num + " is: " + Math.min(num,10));
        System.out.println("Absolute " + num + " is: " + Math.abs(num));
    }
}


