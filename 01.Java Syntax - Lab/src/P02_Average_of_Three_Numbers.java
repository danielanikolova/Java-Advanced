import java.util.Scanner;

public class P02_Average_of_Three_Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Double num1 = scanner.nextDouble();
        Double num2 = scanner.nextDouble();
        Double num3 = scanner.nextDouble();

        Double average = (num1 + num2 + num3)/3;

        System.out.printf("%.2f", average);

    }
    }

