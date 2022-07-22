package src.com.java.patternPrograms;

public class patternPrograms {
    public static void main(String[] args) {
        pattern9(5);
    }

    static void pattern1(int n){
        for (int row = 1; row <= n ; row++ ){
            //for every row, we run the column.
            for (int cols = 1; cols <= row; cols++) {
                System.out.print("* ");
            }
            //after print each columns, we move to next line.
            System.out.println();
        }
    }

    static void pattern2(int n){
        for (int row = 1; row <= n ; row++ ){
            for (int cols = 1; cols <= n; cols++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern3(int n){
        for (int row = 0; row < n; row++){
            for (int col = 0; col < n-row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern4(int n){
        for (int row = 1; row <= n ; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    static void pattern5(int n){
        for (int row = 1; row <= (2*n-1); row++) {
            int totalNoOfCol = (row >= n) ? (2*n-row) : row;
            for (int col = 1; col <= totalNoOfCol; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern6(int n){
        //n = 5
        for (int row = 1; row <= n ; row++) {

            int noOfSpace = n - row;
            for (int spc = 1; spc <= noOfSpace; spc++) {
                System.out.print("   ");

            }
            for (int col = 1; col <= row; col++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    static void pattern7(int n){
        //for rows
        for (int row = 0; row < ((2 * n)); row++) {

            int totalColsInRow = (row > n) ? ((2 * n) - row) : row;
            //for spaces
            int noOfSpace = n - totalColsInRow;

            for (int spc = 0; spc < noOfSpace; spc++) {
                System.out.print(" ");
            }
            //for cols
            for (int col = 0; col < totalColsInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern8(int n){
        for (int row = 1; row <= n; row++) {
            int noOfSpaces = n-row;
            for (int spc = 1; spc <= noOfSpaces; spc++) {
                System.out.print("   ");
            }

            int noOfCols = 5;
            for (int cols = 1; cols <= noOfCols; cols++) {
                System.out.print(" * ");
            }

            System.out.println();
        }
    }

    static void pattern9(int n){
        for (int rows = 1; rows <= n ; rows++) {
            for (int spc = 1; spc <= n - rows; spc++) {
                System.out.print("  ");
            }

            for (int leftCol = rows; leftCol >= 1 ; leftCol--) {
                System.out.print(leftCol + " ");
            }

            for (int rightCol = 2; rightCol <= rows ; rightCol++) {
                System.out.print(rightCol + " ");
            }
            System.out.println();
        }
    }

    static void pattern10(int n){
        for (int rows = 1; rows <= ((2 * n) - 1); rows++) {

            int noOfCols = (rows > n) ? ((2 * n) - rows) : rows;

            for (int spc = 1; spc <= (n - noOfCols); spc++) {
                System.out.print("  ");
            }

            for (int leftCols = noOfCols; leftCols >= 1 ; leftCols--) {
                System.out.print(leftCols + " ");
            }

            for (int rightCols = 2; rightCols <= noOfCols; rightCols++) {
                System.out.print(rightCols + " ");
            }

            System.out.println();
        }
    }




}
