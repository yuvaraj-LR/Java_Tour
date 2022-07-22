package src.arrayExercises;

import java.util.Arrays;

public class comparingArray {
    public static void main(String[] args) {
        compareArray();
    }

    public static void compareArray(){
        int[] set1 = { 10, 20, 30, 40, 50 };
        int[] set2 = { 10, 20, 30, 41, 50 };
        int[] set3 = { 60, 70, 80, 90, 10 };

        System.out.println(set1 == set2);   // Checks address of two arrays
        System.out.println(Arrays.equals(set1, set2));  // set1 == set2
        System.out.println(Arrays.equals(set1, set3));  // set1 != set3

        String[] set4 = { "abc", "def", "hij"};
        String[] set5 = { "abc", "def", "hij"};
        String[] set6 = { "lmn", "ghk", "rst"};

        System.out.println(Arrays.equals(set4, set5));  // set4 == set5
        System.out.println(Arrays.equals(set4, set6));  // set4 != set6


    }
}
