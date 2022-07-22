package src.arrayExercises;

import java.util.Arrays;

public class printArrayValues {
    public static void main(String[] args) {
        System.out.println("Array Exercises.");
        method2();
    }

    public static void method1() {
        int[] numbers = new int[5];      // {0, 0, 0, 0, 0}

        numbers[0] = 5;
        numbers[1] = 10;
        numbers[2] = 20;
        numbers[3] = 30;
        numbers[4] = 40;

        System.out.println(Arrays.toString(numbers));
    }

    public static void method2() {
        int[] numbers = {10, 20, 30, 40, 50};

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}


