package src.com.java.controlStatment;

import java.util.Scanner;

public class calcIfElse{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Expression to perform: ");
        double num1 = sc.nextDouble();
        char sym = sc.next().charAt(0);
        double num2 = sc.nextDouble();

        if (sym == '+'){
            System.out.println("Addition: " + (int)(num1 + num2));
        }
        else if (sym == '-'){
            System.out.println("Subtraction: " + (int)(num1 - num2));
        }
        else if (sym == '*'){
            System.out.println("Multiplication: " + (int)(num1 * num2));
        }
        else if (sym == '/'){
            System.out.println("Division: " + (num1 / num2));
        }
        else {
            System.out.println("Invalid Operator.");
        }
    }
}
