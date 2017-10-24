import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class P04_EvensOrOdds {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] firstLine = scanner.nextLine().split(" ");

        int lowerBound = Integer.parseInt(firstLine[0]);
        int upperBound = Integer.parseInt(firstLine[1]);
        String condition = scanner.nextLine();

        List<Integer> resultList = new ArrayList<>();

        Predicate<Integer> taster = checkIfEvenOrOdd(condition);

        for (int i = lowerBound; i <= upperBound; i++) {
            int num = i;
            if (taster.test(num)){
                resultList.add(num);
            }

        }

        for (Integer num:resultList) {
            System.out.print(num + " ");
        }

    }

    private static Predicate<Integer> checkIfEvenOrOdd(String condition) {

        switch (condition){
            case "odd":
                return number->number%2 !=0;
            case "even":
                return number->number%2 == 0;
            default:
                return null;
        }
    }


}
