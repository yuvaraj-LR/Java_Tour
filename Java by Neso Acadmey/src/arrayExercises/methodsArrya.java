package src.arrayExercises;

public class methodsArrya {
    public static void main(String[] args) {
        int[] num = {2, 6};

        changeArray(num);
        printArray(num);
    }

    public static void changeArray(int[] num){
        num[0] = 6;
        num[1] = 2;
    }

    public static void printArray(int[] num){
        System.out.println(num[0]);
        System.out.println(num[1]);
    }

}
