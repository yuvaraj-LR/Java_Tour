package src.com.java.methods;

import java.util.Scanner;

public class exeMethods1 {
    public static void main(String[] args) {
        System.out.println("Your name is "+ getUserName());
        System.out.println("Your age is "+ getUserAge());
    }

    public static String getUserName(){
        System.out.print("Please Enter Your Name: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        return name;
    }

    public static int getUserAge(){
        System.out.print("Please Enter Your Age: ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        return age;
    }
}
