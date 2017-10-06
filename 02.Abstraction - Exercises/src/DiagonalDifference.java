import java.util.Arrays;
import java.util.Scanner;

public class DiagonalDifference {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int [][] matrix = new int[n][n];

        for (int row = 0; row < n; row++) {
            int [] nums = Arrays
                    .stream(scanner.nextLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            for (int col = 0; col < n; col++) {
                matrix[row][col] = nums[col];
            }

        }

        int difference = calculateDiff(matrix);


        System.out.println(difference);
    }

    private static int calculateDiff(int[][] matrix) {

        int result = 0;

        int leftSum = 0;
        int rightSum = 0;

        for (int row = 0; row < matrix.length; row++) {
           leftSum += matrix[row][row];
            rightSum +=  matrix[row][matrix.length - (row+1)];
        }
        result = Math.abs(leftSum - rightSum);

        return result;
    }
}
