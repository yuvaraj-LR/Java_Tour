package src.arrayExercises;

public class array2DExe1 {
    public static void main(String[] args) {
        int[][] int1 = {
                {1,2,3,4},
                {5,6,7,8},
                {9,1,2,3}
        };
        System.out.println("Addition by Rows");
        sumOfRow(int1);
        System.out.println();
        System.out.println("Addition by Column.");
        sumOFCols(int1);
    }

    private static void sumOFCols(int[][] int1) {

        for (int row = 0; row < 4; row++){
            int sum = 0;
            for (int col = 0; col < 3; col++){
                sum += int1[col][row];
            }
            System.out.println("The sum of col " + (row+1) + " : " + sum);
        }
    }

    private static void sumOfRow(int[][] int1) {

        for (int row = 0; row < 3; row++) {
            int sum = 0;
            for (int col = 0; col < 4; col++) {
                sum += int1[row][col];
            }
            System.out.println("The sum of row " + (row+1) + " : " + sum);
        }
    }
}
