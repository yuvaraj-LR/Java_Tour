package learn_java.src.loopExercises;

import java.util.Scanner;
public class primeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter a positive number: ");
        int num = sc.nextInt();
        int sum = 0;

        for (int i=2; i<=num/2; i++) {
            if (num % i == 0) {
                sum += 1;
            }
        }

        System.out.println((sum == 0) ? num + " is a prime number." : num + " is not a prime number.");
//        if (sum == 0){
//            System.out.println(num + " is prime number.");
//        }
//        else {
//            System.out.println(num + " is not a prime number.");
//        }
    }
}
