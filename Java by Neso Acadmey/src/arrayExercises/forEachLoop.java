package src.arrayExercises;

public class forEachLoop {
    public static void main(String[] args) {
        int[] ints = { 5, 0, 2, 3, 8};
        int i = 0;
        for (int item : ints) {
            System.out.println(item + " " + i);
            i++;
        }
    }
}
