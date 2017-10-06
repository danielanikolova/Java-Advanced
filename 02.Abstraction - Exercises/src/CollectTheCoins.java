import java.util.Scanner;

public class CollectTheCoins {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        char[][] matrix = new char[4][];

        for (int row = 0; row < matrix.length; row++) {
            char[] input = scanner.nextLine().toCharArray();
            matrix[row] = new char[input.length];
            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col] = input[col];
            }
        }

        char[] commands = scanner.nextLine().toCharArray();

        int coins = 0;
        int wallHits = 0;

        int currentLocationR = 0;
        int currentLocationC = 0;


        for (char command:commands){
            switch (command){
                case '>':
                    currentLocationC++;
                    if (currentLocationC >= matrix[currentLocationR].length){
                        currentLocationC--;
                        wallHits++;
                    }else if (matrix[currentLocationR][currentLocationC]=='$'){
                        coins++;
                    }
                    break;
                case '<':
                    currentLocationC--;
                    if (currentLocationC<0){
                        currentLocationC++;
                        wallHits++;
                    }else if (matrix[currentLocationR][currentLocationC]=='$'){
                        coins++;
                    }
                    break;
                case '^':
                    currentLocationR--;
                    if (currentLocationR<0){
                        currentLocationR++;
                        wallHits++;
                    }else if (matrix[currentLocationR][currentLocationC] == '$'){
                        coins++;
                    }
                    break;
                case 'V':
                    currentLocationR++;
                    if (currentLocationR>matrix.length-1
                            || currentLocationC >= matrix[currentLocationR].length){
                        currentLocationR--;
                        wallHits++;
                    }else if (matrix[currentLocationR][currentLocationC] == '$'){
                        coins++;
                    }
                    break;
            }
        }

        System.out.printf("Coins = %d%n", coins);
        System.out.printf("Walls = %d", wallHits);
    }

}
