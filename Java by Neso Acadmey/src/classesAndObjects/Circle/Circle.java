package src.com.java.classesAndObjects.Circle;

import java.awt.*;

public class Circle {
    Point center;
    Double radius;

    double getArea (){
        return Math.PI * radius * radius;
    }

    double getPerimeter () {
        return 2 * Math.PI * radius;
    }

    Point setCenter(Point newCenter) {
        return center = newCenter;
    }

    void setRadius(Double newRadius) {
        radius = newRadius;
    }

}
