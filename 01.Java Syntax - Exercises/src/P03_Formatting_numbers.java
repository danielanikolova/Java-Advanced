import java.util.Scanner;

public class P03_Formatting_numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        double num2 = scanner.nextDouble();
        double num3 = scanner.nextDouble();

        String intInHexa = Integer.toHexString(num1).toUpperCase();
        String intInBinary =String.format("%10s", Integer.toBinaryString(num1)).replace(' ', '0');



        System.out.printf("|%-10s|%10s|%10.2f|%-10.3f|",intInHexa, intInBinary, num2, num3);


    }
}
