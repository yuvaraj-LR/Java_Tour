package src.com.java.classesAndObjects.Encapsulation;

public class Main {
    public static void main(String[] args) {
        Circle c1 = new Circle();

        System.out.println(c1.getRadius());
        c1.setRadius(19.8);
        System.out.println(c1.getRadius());
        System.out.println(Circle.getNumberOfCircle());
    }
}
