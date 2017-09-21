import java.util.Scanner;

public class P05_PascalsTriangle {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int height = scanner.nextInt();

        long[][] pascalTriangle = new long[ height][height];

        for (int currentHeight = 0; currentHeight < height; currentHeight++){
            pascalTriangle[currentHeight][0] = 1;
            pascalTriangle[currentHeight][currentHeight] = 1;
            if (currentHeight > 1){
                long[] previousRow = pascalTriangle[currentHeight - 1];

                for (int i = 1; i < currentHeight; i++){
                    long previousRowSum = previousRow[i] + previousRow[i - 1];
                    pascalTriangle[currentHeight][i] = previousRowSum;
                }
            }
        
        }

        for (long[] longs : pascalTriangle) {
            for (long l : longs) {
                if (l!=0) {
                    System.out.print(l + " ");
                }
            }
            System.out.println();
        }

    }
}
