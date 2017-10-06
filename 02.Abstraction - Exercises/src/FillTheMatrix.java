import java.util.Scanner;

public class FillTheMatrix {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(", ");

        int n = Integer.parseInt(input[0]);
        String pattern = input[1];

        int[][] matrix;
        if (pattern.equals("A")) {
            matrix = fillMatrixVariantA(n);
        } else {
            matrix = fillMatrixVariantB(n);
        }

        printMatrix(matrix);
    }

    private static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length ; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.printf("%d ",matrix[i][j]);
            }
            System.out.println();
        }
    }

    private static int[][] fillMatrixVariantB(int n) {
        int values = 1;
        int[][] matrix = new int[n][n];

        for (int col = 0; col < n; col++) {
            if (col % 2 == 0) {
                for (int row = 0; row < n; row++) {
                    matrix[row][col] = values;
                    values++;
                }

            } else {
                for (int row = n - 1; row >= 0; row--) {
                    matrix[row][col] = values;
                    values++;
                }

            }
        }

        return matrix;

    }


    private static int[][] fillMatrixVariantA(int n) {

        int [][] matrix = new int[n][n];
        int value = 1;
        for (int col = 0; col < matrix.length ; col++) {

            for (int row = 0; row < matrix[col].length; row++) {
                matrix[row][col] = value;
                value ++;

            }
        }
        return matrix;
    }
}