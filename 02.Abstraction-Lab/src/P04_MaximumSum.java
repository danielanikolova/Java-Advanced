import java.util.Arrays;
import java.util.Scanner;

public class P04_MaximumSum {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] dimentions = Arrays
                .stream(scanner.nextLine().split(", "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int rows = dimentions[0];
        int cols = dimentions[1];

        int[][] matrix = new int[rows][cols];

        for (int row = 0; row < matrix.length; row++) {
            String[] nums =scanner.nextLine().split(", ");
            for (int col = 0; col < matrix[0].length; col++) {
                matrix[row][col] =Integer.parseInt( nums[col]);
            }
        }
        
        int bestSum = 0;
        int sum = 0;
        int [][] bestMatrix = new int[2][2];

        for (int row = 0; row < matrix.length-1; row++) {
            for (int col = 0; col <matrix[0].length-1 ; col++) {
                sum = matrix[row][col]+matrix[row][col+1]+matrix[row+1][col] + matrix[row +1][col+1];
                if (sum>bestSum){
                    bestSum = sum;
                    bestMatrix[0][0] = matrix[row][col];
                    bestMatrix[0][1] = matrix[row][col+1];
                    bestMatrix[1][0] = matrix[row+1][col];
                    bestMatrix[1][1] = matrix[row+1][col+1];

                }
            }
        }

        for (int ro = 0; ro < bestMatrix.length; ro++) {
            for (int col = 0; col < bestMatrix[0].length; col++) {
                System.out.printf("%d ",bestMatrix[ro][col]);
            }
            System.out.println();
        }

        System.out.println(bestSum);
    }
}
