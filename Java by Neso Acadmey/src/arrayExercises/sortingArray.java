package src.arrayExercises;

import java.util.Arrays;

public class sortingArray {
    public static void main(String[] args) {
        sortParticular();
    }

    public static void sortNumbers() {
        int[] num = {9, 7, 4, -3, -1, 3, 0};
        Arrays.sort(num);

        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
    }

    public static void sortParticular() {
        int[] num = {9, 7, 4, -3, -1, 3, 0};

        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
    }

    public static void sortChars() {
        char[] chars = {'c', 'r', 'q', 'v', 'S', 'P'};
        Arrays.sort(chars);

        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[i] + " ");
        }
    }

    public static void sortUnicodes() {
        int[] chars = {'c', 'r', 'q', 'v', 'S', 'P'};
        Arrays.sort(chars);

        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[i] + " ");
        }
    }

    public static void sortString() {
        String[] words = {"def", "ghi", "abc"};
        Arrays.sort(words);

        for (int i = 0; i < words.length; i++) {
            System.out.print(words[i] + " ");
        }

    }
}
