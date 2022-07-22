package src.com.java.loopExercises;

import java.util.Scanner;

public class reverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word to reverse: ");
        String word = sc.next();

        for (int i = word.length()-1; i>=0; i--){
            System.out.print(word.charAt(i));
        }
    }
}
