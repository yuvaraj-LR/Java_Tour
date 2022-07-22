import java.util.Scanner;

public class airthmeticOpertors_eg1 {
    public static void main(String[] args) {
        try (Scanner sc_1 = new Scanner(System.in)) {
            System.out.println("Airthmetic Operator.");
            // +, -, *, /, %

            System.out.println("Enter the first number: ");
            int num1 = sc_1.nextInt();
            System.out.println("Enter the second number: ");
            int num2 = sc_1.nextInt();

            int num3;
            num3 = num1 + num2;
            System.out.println("Addition: " + num3);
            num3 = num1 - num2;
            System.out.println("Subtraction: " + num3);
            num3 = num1 * num2;
            System.out.println("MUltiplication: " + num3);
            num3 = num1 / num2;
            System.out.println("Division: " + num3);
            num3 = num1 % num2;
            System.out.println("Modulus: " + num3);
        }

        // num3 = num1 + num2 + num1++ + num2++ + ++num1 + ++num2;
        // System.out.println("Answer: " + num3);

    }
}
