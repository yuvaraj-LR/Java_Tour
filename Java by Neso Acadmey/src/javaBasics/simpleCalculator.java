import java.util.Scanner;

public class simpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter the Second number: ");
        int num2 = sc.nextInt();

        System.out.println("Choose the operator: (+ - * / %)");
        int ans = sc.next().charAt(0);

        switch (ans) {
            case '+':
                ans = num1 + num2;
                System.out.println(num1 + " + " + num2 + " = " + ans);
                break;

            case '-':
                ans = num1 - num2;
                System.out.println(num1 + " - " + num2 + " = " + ans);
                break;

            case '*':
                ans = num1 * num2;
                System.out.println(num1 + " * " + num2 + " = " + ans);
                break;

            case '/':
                ans = num1 / num2;
                System.out.println(num1 + " / " + num2 + " = " + ans);
                break;

            case '%':
                ans = (char) (num1 % num2);
                System.out.println(num1 + " % " + num2 + " = " + ans);
                break;
        }

    }

}
