package src.com.java.classesAndObjects.AccessModifiers;

public class Main {
    public static void main(String[] args) {
        Test t1 = new Test();
        System.out.println("Default value: " + t1.getX());
        t1.setX(t1.getX());
        System.out.println("After calling value: " + t1.getX());
    }
}
