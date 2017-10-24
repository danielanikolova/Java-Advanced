import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;

public class P03_CustomMinFunction {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numbersInput = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        Integer[] numbers = new Integer[numbersInput.length];

        for (int i = 0; i < numbersInput.length; i++) {
            numbers[i] = numbersInput[i];
        }

        Function<Integer[], Integer> minValue =
                x-> {
            int minNumber = Integer.MAX_VALUE;

                    for (Integer num:x) {
                        if (minNumber>num){
                            minNumber=num;
                        }
                    }
                    return minNumber;
                };

        int minNum = minValue.apply(numbers);

        System.out.println(minNum);

    }
}
