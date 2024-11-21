package eu.mobilo24.java101;

public class Main {

    public static void main(String[] args) {
        double[][] A = {
                {1, 2, 3, 4},
                {2, 3, 4, 5},
                {3, 4, 5, 6}
        };

        double[][] B = {
                {9, 8, 7},
                {8, 7, 6},
                {7, 6, 5},
                {6, 5, 4}
        };

        System.out.println("--- MATRIX A ---");
        for (double[] row : A) {
            for (double n : row) {
                System.out.print(n + " ");
            }
            System.out.println();
        }

        System.out.println("--- MATRIX B ---");
        for (int i = 0; i < B.length; i++) {
            for (int j = 0; j < B[0].length; j++) {
                System.out.print(B[i][j] + " ");
            }
            System.out.println();
        }

        int rowsA = A.length;
        int colsA = A[0].length;
        int rowsB = B.length;
        int colsB = B[0].length;
        double[][] result = new double[rowsA][colsB];

        if (rowsB != colsA) {
            System.out.println("Matrix multiplication is not possible");
        } else {
            for (int i = 0; i < rowsA; i++) {
                for (int j = 0; j < colsB; j++) {
                    for (int k = 0; k < colsA; k++) {
                        result[i][j] += A[i][k] * B[k][j];
                    }
                }
            }

            System.out.println("--- MATRIX A*B ---");
            for (int i = 0; i < result.length; i++) {
                for (int j = 0; j < result[0].length; j++) {
                    String formattedNumber = String.format("%6.2f", result[i][j]);
                    System.out.print(formattedNumber + " ");
                }
                System.out.println();
            }

        }
    }
}

