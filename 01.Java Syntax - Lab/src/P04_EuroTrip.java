import java.math.BigDecimal;
import java.util.Scanner;


public class P04_EuroTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Double quantity = Double.parseDouble(scanner.nextLine());
        BigDecimal priceInLeva = new BigDecimal(quantity*1.2);
        BigDecimal exchangeRate = new BigDecimal("4210500000000");
        BigDecimal priceInMarks = priceInLeva.multiply(exchangeRate);

        System.out.printf("%.2f marks", priceInMarks);

    }
}
