package src.arrayExercises;

import java.util.Arrays;

public class twoDArray {
    public static void main(String[] args) {
        int[][] nums = {{10, 20, 30}, {60, 70, 80}};
        System.out.println("Representing memory locations.");
        System.out.println(Arrays.toString(nums));
        System.out.println();
        System.out.println("Representing values.");
        System.out.println(Arrays.deepToString(nums));
        System.out.println();
        System.out.println("By Rows.");
        printArrayByRow(nums);
        System.out.println();
        System.out.println("By Columns.");
        printArrayByCol(nums);
    }

    public static void printArrayByCol(int n[][]) {
        for (int rows = 0; rows < 3; rows++) {
            for (int cols = 0; cols < 2; cols++) {
                System.out.print(n[cols][rows] + " ");
            }
            System.out.println();
        }
    }

    public static void printArrayByRow(int n[][]){
        for (int rows = 0; rows < 2; rows++) {
            for (int cols = 0; cols < 3; cols++) {
                System.out.print(n[rows][cols] + " ");
            }
            System.out.println();
        }
    }
}
