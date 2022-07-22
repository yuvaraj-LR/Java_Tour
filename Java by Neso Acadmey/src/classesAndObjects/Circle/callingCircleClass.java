package src.com.java.classesAndObjects.Circle;

import java.awt.*;

public class callingCircleClass {
    public static void main(String[] args) {
        Circle c1 = new Circle();

        c1.center = new Point(10, 12);
        c1.setRadius(14.0);
        System.out.println("Radius of the Circle: " + c1.radius);
        System.out.println("Center points of the Circle: " + c1.center);
        System.out.println("Area of the Circle: " + c1.getArea());
        System.out.println("Perimeter of the Circle: " + c1.getPerimeter());
        System.out.println("New Center: " + c1.setCenter(new Point(20, 10)));
        System.out.println("Acutal Center: " + c1.center);

    }
}
