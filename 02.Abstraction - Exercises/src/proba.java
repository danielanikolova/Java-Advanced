import java.util.Arrays;
import java.util.Scanner;

public class proba {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] input = Arrays.stream(scanner.nextLine()
                .split(" "))
                .mapToInt(Integer::parseInt).toArray();

        int rows = input[0];
        int cols = input[1];

        String[][] matrix = new String[rows][cols];

        for (int row = 0; row < matrix.length; row++) {
            String[] sequences = scanner.nextLine().split(" ");

            for (int col = 0; col < matrix[0].length; col++) {
                matrix[row][col] = sequences[col];
            }
        }

        int count = 1;
        int bestCount = 0;
        String bestString = null;

        String repeatedString = null;

        for (int row = 0; row <matrix.length-1 ; row++) {

            for (int col = 0; col < matrix[0].length-1; col++) {

                int r = row;
                int c = col;

                while ((r+1<matrix.length) && (c+1) < matrix[0].length){
                    if (matrix[r][c].equals( matrix[r+1][c+1])){

                        count++;
                        repeatedString = matrix[row][col];
                        if (count>bestCount){
                            bestString = repeatedString;
                            bestCount = count;
                        }
                    }
                    r++;
                    c++;
                }
                count =1;

            }

        }
        for (int i = 0; i < bestCount ; i++) {
            if (i==bestCount-1){
                System.out.printf("%s", bestString);
            }else {
                System.out.printf("%s, ", bestString);
            }

        }


    }
}
