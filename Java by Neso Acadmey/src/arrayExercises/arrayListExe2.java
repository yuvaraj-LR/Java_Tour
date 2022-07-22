package src.arrayExercises;

import java.util.ArrayList;
import java.util.Scanner;

public class arrayListExe2 {
    public static void main(String[] args) {
        usrMenu();
    }

    private static void usrMenu() {
        ArrayList<Integer> array = new ArrayList<>();

        while (true){
            System.out.println("     <--MENU-->     ");
            System.out.println("  1. Add Element.");
            System.out.println("  2. Remove Element.");
            System.out.println("  3. Display Element.");
            System.out.println("  4. Exit");
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter Your choice (1-4): ");
            int choice = sc.nextInt();

            if (choice == 1)
                addArray(array);
            else if (choice == 2)
                removeArray(array);
            else if (choice == 3)
                dispArray(array);
            else if (choice == 4){
                System.out.println("Good Bye!!! See you soon.");
                break;
            }
            else if (choice <= 5) {
                System.out.println("Invalid Option!!! Please Choose (1-4).");
                System.out.println();
            }
            System.out.println();
        }
    }

    private static void addArray(ArrayList<Integer> array) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a element to add for your ArrayList: ");
        array.add(sc.nextInt());
        System.out.println("Added.");
    }

    private static void removeArray(ArrayList<Integer> array) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a element to remove from your ArrayList: ");
        int num = (sc.nextInt());
        if (array.contains(num)){
            array.remove(new Integer(num));
            System.out.println("Removed.");
        }
        else
            System.out.println("Sorry! " + num + " does not exits in your ArrayList.");
    }

    private static void dispArray(ArrayList<Integer> array) {
        System.out.println("Here your ArrayList.");
        System.out.println(array);
    }
}
