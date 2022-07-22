package src.com.java.loopExercises;

import java.util.Scanner;

public class palindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word to reverse: ");
        String word = sc.next();

        boolean isPalindrome = true;

        for (int i = 0, j = word.length()-1; i < j; i++, j--){
            if (word.charAt(i) == word.charAt(j)){
                continue;
            }

            isPalindrome = false;
            break;
        }

        System.out.println(isPalindrome ? word + " is a palindrome." : word + " is not a palindrome.");

    }
}
