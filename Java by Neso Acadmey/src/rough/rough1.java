package src.com.java.rough;

import java.util.Locale;

public class rough1 {
    public static void main(String[] args) {
        String word = "hello";

        for (int i = 0; i < word.length(); i++) {

            char a = word.charAt(i);
            if (a == word.charAt(0)) {
                String tocap = String.valueOf(word.charAt(0));
                String afterCap = tocap.toUpperCase();
                System.out.println(afterCap);
            }
        }

    }
}
