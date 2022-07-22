package src.arrayExercises;

import java.util.Arrays;

public class arrayExe4 {
    public static void main(String[] args) {
        int[] arr1 = {12, 32, 56, 43, 86, 11, 65, 87, 24};
        int[] temp = new int[arr1.length];

        int j = 0;
        int k = arr1.length-1;

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] % 2 != 0){
                temp[j++] = arr1[i];
            }
            else{
                temp[k--] = arr1[i];
            }
        }

        copyArray(temp, arr1);
        System.out.println(Arrays.toString(arr1));
    }

    private static void copyArray(int[] temp, int[] arr1) {
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = temp[i];
        }
    }
}
