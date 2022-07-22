package src.javaBasics;

public class stringConcat {
    public static void main(String[] args) {
        String first = "Yuva";
        String second = "Raj";
        String age = "19";
        String name = first + second;

        System.out.println("My name is "+name+ ". My fav number is "+17); //NOTE: int to string
        System.out.println("My name is ".concat(name)+"My age is ".concat(age));
    }
}
