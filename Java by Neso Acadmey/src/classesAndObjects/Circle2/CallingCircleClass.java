package src.com.java.classesAndObjects.Circle2;

import java.awt.*;

public class CallingCircleClass {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        System.out.println("Default Radius: " + c1.radius);
        System.out.println("Default Center: " + c1.center);
        Circle c2 = new Circle(new Point(20, 10), (double)10);
        System.out.println("New Radius: " + c2.radius);
        System.out.println("New Center: " + c2.center);
    }
}
