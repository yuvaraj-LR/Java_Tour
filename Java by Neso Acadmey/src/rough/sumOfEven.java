package src.com.java.rough;

import java.util.ArrayList;
import java.util.Scanner;

public class sumOfEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of integers: ");
        int usrNum = sc.nextInt();

        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 1; i <= usrNum; i++) {
            System.out.print("Enter Number " + i + " : ");
            int n = sc.nextInt();

            if (n%2 == 0)
                ans.add(n);
        }
        System.out.println("Even Integers: " + ans);

        int total = 0;
        for (int i = 0; i < ans.size(); i++) {
            total += ans.get(i);
        }
        System.out.println("Total :" + total);
    }
}
