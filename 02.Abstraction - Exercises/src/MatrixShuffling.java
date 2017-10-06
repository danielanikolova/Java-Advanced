import java.util.Arrays;
import java.util.Scanner;

public class MatrixShuffling {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] dimensions = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();

        int rows = dimensions[0];
        int cols = dimensions[1];
        String [][] matrix = new String[rows][cols];

        for (int row = 0; row < dimensions[0]; row++) {
            String[] values = scanner.nextLine().split("\\s+");
            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col] = values[col];
            }
        }

        String[] command = scanner.nextLine().split("\\s");

        while (!command[0].equals("END")){
            if (!command[0].equals("swap")&& command.length != 5){
                System.out.println("Invalid input!");
            }
            else {
              int  row1 = Integer.parseInt(command[1]);
               int col1 = Integer.parseInt(command[2]);
               int row2 = Integer.parseInt(command[3]);
               int col2 = Integer.parseInt(command[4]);

               if (row1>=rows || row2>=rows || col1>=cols || col2>=cols ){
                   System.out.println("Invalid input!");
               }else {
                   String tempValue = matrix[row1][col1];
                   matrix[row1][col1] =matrix[row2][col2];
                   matrix[row2][col2] = tempValue;

                   printMatrix(matrix);
               }

            }
            command = scanner.nextLine().split("\\s");
        }

    }

    private static void printMatrix(String[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                System.out.printf("%s ", matrix[row][col]);
            }
            System.out.println();
        }
    }

}
