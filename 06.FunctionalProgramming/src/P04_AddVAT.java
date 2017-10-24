import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;

public class P04_AddVAT {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double[] numbers = Arrays.stream(scanner.nextLine().split(", "))
                .mapToDouble(Double::parseDouble).toArray();

        Function<Double,Double > addVat = x->x*1.2;
        System.out.println("Prices with VAT:");

        for (Double num:numbers) {
            System.out.println(String.format("%.2f", addVat.apply(num)).replace(".", ","));
        }
    }
}
