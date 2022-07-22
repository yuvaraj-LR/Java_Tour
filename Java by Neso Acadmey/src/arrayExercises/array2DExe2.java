package src.arrayExercises;

public class array2DExe2 {
    public static void main(String[] args) {
        int[][] int1 = {
                {11,2,3,4},
                {5,6,71,8},
                {9,1,2,31}
        };
        maxOfRow(int1);
    }

    private static void maxOfRow(int[][] int1) {
        for (int row = 0; row < 3; row++) {
            int max = int1[row][0];
            for (int col = 1; col < 4; col++) {
                max = ((int1[row][col] > max) ? int1[row][col] : max);
            }
            System.out.println("The maximum number in row " + (row + 1) + " : " + max);
        }
    }
}
