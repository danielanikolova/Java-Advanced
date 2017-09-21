import java.util.Scanner;

public class P01_ReadInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word1 = scanner.next("\\w+");
        String word2 = scanner.next("\\w+");
        int num1 = Integer.parseInt(scanner.next());
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        scanner.nextLine();
        String word3 = scanner.next("\\w+");

        int sum = num1+num2+num3;

        System.out.println(word1 + " " + word2 +" " + word3 + " " +sum);
    }
}
