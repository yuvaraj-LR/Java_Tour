package src.com.java.classesAndObjects.Encapsulation;

public class Circle {
    private double radius;
    private static int numberOfCircle;

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius =  (radius >= 0) ? radius : 0;
    }

    public static int getNumberOfCircle() {
        return numberOfCircle;
    }
}
