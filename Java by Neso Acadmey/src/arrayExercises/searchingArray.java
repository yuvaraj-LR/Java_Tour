package src.arrayExercises;

import java.util.Arrays;

public class searchingArray{
    public static void main(String[] args) {
        int[] nums = {20, 40, 11, 28, 54, 22};
        searchingArray(nums);
    }

    public static void searchingArray(int[] n){

        Arrays.sort(n);
        for (int i = 0; i < n.length; i++) {
            System.out.print(n[i] + " ");
        }
        System.out.println();
        System.out.print("11 is placed at the index of ");
        System.out.println(Arrays.binarySearch(n, 50));
        System.out.print("-100 is placed at the index of ");
        System.out.println(Arrays.binarySearch(n, -100));
    }
}