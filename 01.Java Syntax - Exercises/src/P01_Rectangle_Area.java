import java.util.Scanner;

public class P01_Rectangle_Area {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1 = scanner.nextDouble();
        double num2  =scanner.nextDouble();

        double area = num1*num2;

        System.out.printf("%.2f", area);
    }
}
