import java.util.Arrays;
import java.util.Scanner;

public class P03_SumMatrixElements {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);

       int[] nums = Arrays.stream(scanner.nextLine().split(", "))
               .mapToInt(Integer::parseInt).toArray();


        int [][] matrix = new int[nums[0]][nums[1]];

        for (int row = 0; row < matrix.length; row++) {
            String[] inputTokens = scanner.nextLine().split(", ");
            for (int col = 0; col < nums[1] ; col++) {
                matrix[row][col] = Integer.parseInt(inputTokens[col]);
            }
            
        }

        int sum = 0;

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                sum+= matrix[row][col];
            }
        }
        System.out.println(nums[0]);
        System.out.println(nums[1]);
        System.out.println(sum);
    }
}
