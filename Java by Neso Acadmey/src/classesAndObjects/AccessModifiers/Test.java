package src.com.java.classesAndObjects.AccessModifiers;

public class Test {
    private int x = 10;

    public int getX(){
        return x++;
    }

    public void setX(int x){
        this.x = x;
    }
}
