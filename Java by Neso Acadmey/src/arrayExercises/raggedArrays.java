package src.arrayExercises;

public class raggedArrays {
    public static void main(String[] args) {
        int[][] ints = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        int[][] ints1 = {
                {1,2,3},
                {4,5},
                {6,7,8,9}
        };

        methodsArray(ints);
        System.out.println();
        raggedArray(ints1);
    }

    private static void methodsArray(int[][] ints) {
        for (int row = 0; row < ints.length; row++) {
            for (int col = 0; col < ints[row].length; col++) {
                System.out.print(ints[row][col] + " ");
            }
            System.out.println();
        }
    }

    private static void raggedArray(int[][] ints1) {
        for (int row = 0; row < ints1.length; row++) {
            for (int col = 0; col < ints1[row].length; col++) {
                System.out.print(ints1[row][col] + " ");
            }
            System.out.println();
        }
    }
}
