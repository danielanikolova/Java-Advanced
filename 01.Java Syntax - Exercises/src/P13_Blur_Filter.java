import java.util.Scanner;

public class P13_Blur_Filter {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int blurAmount = Integer.parseInt(scanner.nextLine());
        int rows = scanner.nextInt();
        int columns = scanner.nextInt();
        long[][] matrix = new long[rows][columns];
        scanner.nextLine();

        for (int row = 0; row < matrix.length ; row++) {
            String [] nums = scanner.nextLine().split(" ");
            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col] = Long.parseLong(nums[col]);
            }
        }

        String[] coordinates = scanner.nextLine().split(" ");
        int targetRow = Integer.parseInt(coordinates[0]);
        int targetCol = Integer.parseInt(coordinates[1]);

        int left = Math.max(targetCol - 1, 0);
        int right = Math.min(targetCol + 1, columns - 1);
        int top = Math.max(targetRow - 1, 0);
        int bottom = Math.min(targetRow + 1, rows - 1);

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < columns; col++) {
                if ((left <= col && col <= right) && (top <= row && row <= bottom)) {
                    System.out.printf("%d ", matrix[row][col] + blurAmount);
                } else {
                    System.out.printf("%d ", matrix[row][col]);
                }
            }
            System.out.println();
        }


    }
}
