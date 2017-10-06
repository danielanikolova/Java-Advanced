import java.util.Scanner;

public class PalindromesMatrix {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int r = scanner.nextInt();
        int c = scanner.nextInt();

        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();

        String[][] matrix = fillMatrix(r, c, alphabet);

        printMatrix(matrix);
    }

    private static void printMatrix(String[][] matrix) {

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                System.out.printf("%s ",matrix[row][col]);
            }
            System.out.println();
        }
    }

    private static String[][] fillMatrix(int r, int c, char[] alphabet) {

        String[][] matrix = new String[r][c];

        for (int row = 0; row < r; row++) {
            for (int col = 0; col < c; col++) {
                String charsToFill = String.format("%s%s%s", alphabet[row], alphabet[col+row], alphabet[row] );

                matrix[row][col] = charsToFill;
            }
        }

        return matrix;
    }


}
