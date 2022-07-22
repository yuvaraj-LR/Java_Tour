package src.com.java.classesAndObjects.Exercise.Exe_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many rectangles you want? ");
        int numberOfRectangle = sc.nextInt();
        Rectangle[] rectangles = new Rectangle[numberOfRectangle];

        for (int i = 0; i < rectangles.length; i++) {
            System.out.print("Do you want to modify the length and breath of the Rectangle-" + (i+1) + " (Y/N): ");
            char choice = sc.next().toLowerCase().charAt(0);

            if (choice == 'y') {
                System.out.print("Enter length and breath for the Rectangle-"+ (i+1) + ": ");
                rectangles[i] = new Rectangle(sc.nextDouble(), sc.nextDouble());
            }

            else if (choice == 'n') {
                System.out.println("Sure! We use default value for length and breath.");
                rectangles[i] = new Rectangle();
            }

            else {
                System.out.println("Sorry! Invalid Option. Try again!!!");
                rectangles[i] = new Rectangle();
            }
        }

        System.out.println("Here the rectangles are: ");
        for (int i = 0; i < rectangles.length; i++) {
            System.out.println("Rectangle " + (i+1) +
                    ": length: " + rectangles[i].getLength() +
                    " , breath: " + rectangles[i].getBreath());
        }

    }
}
