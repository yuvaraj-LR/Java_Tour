package src.arrayExercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class arrayListExe1 {
    public static void main(String[] args) {
        System.out.println("Please Enter 10 Integers to find unique sorted elements.");
        getNums();
    }

    private static void getNums() {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> usrNum = new ArrayList<>();
        System.out.print("How many elements you have to sort? ");
        int times = sc.nextInt();

        for (int nums = 0; nums < times; nums++) {
            System.out.print("Enter num " + (nums + 1) + " : ");
            int n = sc.nextInt();

            if (!usrNum.contains(n)) {
                usrNum.add(n);
            }
        }
        sortNums(usrNum);
    }

    private static void sortNums(ArrayList<Integer> usrNum) {
        Collections.sort(usrNum);
        System.out.println();
        System.out.println("Here your unique sorted elements.");
        System.out.println(usrNum);
    }
}
