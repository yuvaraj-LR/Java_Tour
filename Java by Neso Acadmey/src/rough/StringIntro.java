package learn_java.src.rough;

import java.util.Locale;
import java.util.Scanner;

public class StringIntro {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        String word1;
        String word2;
        int words;

        Scanner sc = new Scanner(System.in);

        word1 = sc.next();
        word2 = sc.next();

        words = word1.length() + word2.length();
        System.out.println(words);

        if (word1.length() < word2.length()){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }

        for (int i = 0; i < word1.length(); i++) {
            char a = word1.charAt(i);
            if (a == word1.charAt(0)) {
                String tocap = String.valueOf(word1.charAt(0));
                String afterCap = tocap.toUpperCase();
                System.out.println(afterCap);
            }
        }

        String capiWord1 = word1.toUpperCase();
        String capiWord2 = word2.toUpperCase();

        System.out.println(capiWord1 + " " + capiWord2);

    }
}
