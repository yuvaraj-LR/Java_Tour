package src.com.java.loopExercises;

public class multiplicationOfTwo {
    public static void main(String[] args) {

        System.out.println("Increasing order: ");
        for (byte num = 1; num<101; num++){
            if (num%2 == 0) {
                System.out.print(num + " ");
            }
            else{
                continue;
            }
        }
        System.out.println(" ");
        System.out.println("Decreasing order:");
        for (byte num = 101; num>1; num--){
            if (num%2 == 0) {
                System.out.print(num + " ");
            }
            else{
                continue;
            }
        }
    }
}
