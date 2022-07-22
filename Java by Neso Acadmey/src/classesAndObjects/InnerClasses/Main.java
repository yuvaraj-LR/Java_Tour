package src.com.java.classesAndObjects.InnerClasses;

public class Main {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner OutInn = outer.new Inner();

        OutInn.innerX = 8;
        OutInn.showX();
    }
}
