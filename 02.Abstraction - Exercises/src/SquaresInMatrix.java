import java.util.Arrays;
import java.util.Scanner;

public class SquaresInMatrix {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] nums = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int rows = nums[0];
        int cols = nums[1];

        String [][] matrix = new String[rows][cols];

        for (int row = 0; row < rows ; row++) {

            String[] chars = scanner.nextLine().split(" ");

            for (int col = 0; col < cols; col++) {
                matrix[row][col] = chars[col];
            }

        }
        int count = 0;
        for (int row = 0; row < matrix.length-1; row++) {
            for (int col = 0; col < matrix[0].length-1; col++) {
                if (matrix[row][col].equals(matrix[row][col+1])&&
                        matrix[row+1][col].equals(matrix[row+1][col+1])&&
                        matrix[row][col].equals(matrix[row+1][col])){
                    count++;
                }
            }

        }

        System.out.println(count);

    }
}
