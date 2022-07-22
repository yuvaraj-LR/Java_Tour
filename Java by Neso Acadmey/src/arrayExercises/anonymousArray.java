package src.arrayExercises;

public class anonymousArray {
    public static void main(String[] args) {
        sum(new int[] {1,2,3,4,5,6,7});
    }

    public static void sum(int[] a){
        int tot = 0;

        for (int i = 0; i < a.length; i++) {
            tot += a[i];
        }

        System.out.println("The sum is " + tot);
    }
}
