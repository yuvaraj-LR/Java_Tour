package src.com.java.classesAndObjects.Circle2;

import java.awt.*;

public class Circle {
    Point center;
    Double radius;

    Circle(){
        center = new Point(10, 20);
        radius = 5.0;
    }

    Circle(Point initialCenter, Double initialRadius) {
        center = initialCenter;
        radius = initialRadius;
    }


}
