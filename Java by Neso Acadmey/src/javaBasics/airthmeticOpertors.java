public class airthmeticOpertors {
    public static void main(String[] args) {

        System.out.println("Airthmetic Operators.");
        int a = 10, b = 2, c = 11, d = 10, ans;

        // OPERTAIONS + - * %
        ans = a + b;
        System.out.println("Addition: " + ans);
        ans = a - b;
        System.out.println("Subtraction: " + ans);
        ans = a * b;
        System.out.println("Multiplication: " + ans);
        ans = a / b;
        System.out.println("Division: " + ans);
        ans = c % b;
        System.out.println("Modulus: " + ans);

        // COMPOUND ASSIGNMENT += -= *= %=
        d += a;
        System.out.println("Compound Assignment: " + d);

        // INCREMENT AND DECREMENT OPERATORS
        /*
         * b++; /\Post Increment
         * ++b; \/Pre Increment
         * 
         * b--; /\Post Decrement
         * --b; \/Pre Decrement
         */

        System.out.println("Increment Operator: " + ++b);

    }

}
