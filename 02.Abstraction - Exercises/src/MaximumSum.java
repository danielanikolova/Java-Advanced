import java.util.Arrays;
        import java.util.Scanner;

public class MaximumSum {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] nums = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int rows = nums[0];
        int cols = nums[1];

        int [][] matrix = new int[rows][cols];

        for (int row = 0; row < rows ; row++) {

            int[] chars = Arrays
                    .stream(scanner.nextLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            for (int col = 0; col < cols; col++) {
                matrix[row][col] = chars[col];
            }

        }

        int maxSum = 0;
        int sum = 0;
        int bestR = 0;
        int bestC = 0;

        for (int row = 0; row < matrix.length-2; row++) {
            for (int col = 0; col < matrix[0].length-2; col++) {

                for (int r = row; r < row+3; r++) {
                    for (int c = col; c < col+3; c++) {
                        sum += matrix[r][c];
                    }
                }
                if (sum>maxSum){
                    maxSum=sum;
                    bestR = row;
                    bestC = col;
                }
                sum=0;
            }

        }
        System.out.printf("Sum = %d%n", maxSum);
        for (int row = bestR; row < bestR+3; row++) {
            for (int col = bestC; col < bestC + 3; col++) {
                System.out.printf("%d ", matrix[row][col]);
            }
            System.out.println();
        }

    }
}
