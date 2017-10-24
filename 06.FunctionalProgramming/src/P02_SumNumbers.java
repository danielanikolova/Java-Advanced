import java.util.Scanner;
import java.util.function.Function;

public class P02_SumNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] nums = scanner.nextLine().split(", ");

        System.out.printf("Count = %d\n",nums.length);

        Function<String, Integer> parser = x->Integer.parseInt(x);

        int sum = 0;
        for (String num:nums) {
            sum+= parser.apply(num);
        }
        System.out.printf("Sum = %d", sum);


    }
}
