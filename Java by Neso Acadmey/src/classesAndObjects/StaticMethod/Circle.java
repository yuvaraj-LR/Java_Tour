package src.com.java.classesAndObjects.StaticMethod;

import java.awt.*;

public class Circle {
    Point center;
    Double radius;
    static int numberOfCircles;


    Circle(){
        numberOfCircles++;
    }

    Circle(Point initialCenter, Double initialRadius) {
        numberOfCircles++;
        this.center = initialCenter;
        this.radius = initialRadius;
    }

    static int getNumberOfCircles(){
        return numberOfCircles;
    }


}
