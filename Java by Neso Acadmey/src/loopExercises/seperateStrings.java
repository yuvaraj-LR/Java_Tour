package src.com.java.loopExercises;

import java.util.Scanner;

public class seperateStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your word: ");
        String word = sc.next();

        for (int i = 0; i<=(word.length()-1); i++){
            System.out.print(word.charAt(i) + " ");
        }
    }
}
