package src.com.java.classesAndObjects.StaticMethod;

import java.awt.*;

public class CallingCircleClass {
    public static void main(String[] args) {
        System.out.println("Number of Circles: " + Circle.getNumberOfCircles());
        Circle c1 = new Circle();
        System.out.println(Circle.numberOfCircles);
        Circle c2 = new Circle(new Point(4, 5), (double)9);
        Circle.numberOfCircles = 10;
        System.out.println(Circle.numberOfCircles);
    }
}
