package learn_java.src.rough;

import java.util.Scanner;

public class SubString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        for (int i = n1; i <= n2; i ++) {
            System.out.print(word.charAt(i));
        }

    }
}
