package src.com.java.classesAndObjects.Exercise.Exe_1;

public class Rectangle {
    private double length;
    private double breath;

    Rectangle() {
        length = 1.0;
        breath = 1.0;
    }

    Rectangle(double length, double breath) {
        this.length = length;
        this.breath = breath;
    }

    public double getArea() {
        return length * breath;
    }

    public double getPerimeter() {
        return 2 * (length + breath);
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getBreath() {
        return breath;
    }

    public void setBreath(double breath) {
        this.breath = breath;
    }
    

}
