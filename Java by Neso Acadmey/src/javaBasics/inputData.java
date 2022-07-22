import java.util.*;

public class inputData {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter your name?");
        String name = sc.nextLine();

        System.out.println("Please Enter Your age?");
        int age = sc.nextInt();

        System.out.println("Please Enter Your email id?");
        sc.nextLine();
        String email$id = sc.nextLine();

        System.out.println("Good Morning " + name);
        System.out.println("Your age is " + age);
        System.out.println("Your email id is " + email$id);

    }

}
