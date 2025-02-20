package Patternquestions;

public class Patterns {

    public static void main(String[] args) {
      print7(7);
    }

    //    *****
    //    *****
    //    *****
    //    *****
    //    *****
    static void print(int n) {
        // Outer loop is for the number of rows
        for (int row = 1; row <= n; row++) {
            // Inner loop is for the number of columns
            for (int col = 1; col <= n; col++) {
                System.out.print("* ");
            }
            // New line is added when a new row is created
            System.out.println();
        }
        System.out.println();
    }

    //    *
    //    **
    //    ***
    //    ****
    //    *****
    // This function prints these types of patterns
    static void print2(int n) {
        // Outer loop is for the number of rows
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            // When one row is printed, we need to add a new line
            System.out.println();
        }
        System.out.println();
    }

    // *****
    // ****
    // ***
    // **
    // *
    // First approach
    static void print3(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n + 1 - row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }

    // Second approach
    static void print3Second(int n) {
        for (int row = n; row >= 1; row--) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }

    //    1
    //    1 2
    //    1 2 3
    //    1 2 3 4
    //    1 2 3 4 5
    static void print4(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    //         *
    //         **
    //         ***
    //         ****
    //         *****
    //         ****
    //         ***
    //         **
    //         *
    static void print5(int n) {
        for (int row = 1; row <= (2 * n - 1); row++) {
            int totalCols = row > n ? (2 * n - row) : row;
            for (int col = 1; col <= totalCols; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }

    //    *
    //   **
    //  ***
    // ****
    //*****
    static void print7(int n) {
        for (int row = 1; row <= n; row++) {
            // I have to make a formula for this
            for (int col = 1; col <= n; col++) {
                if (col >= row) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

}
