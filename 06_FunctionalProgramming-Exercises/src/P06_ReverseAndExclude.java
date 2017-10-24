import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class P06_ReverseAndExclude {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> list = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .boxed()
                .collect(Collectors.toList());

        int n = Integer.parseInt(scanner.nextLine());

        Predicate<Integer> isDivisible = x->x%n==0;

        Collections.reverse(list);

        for (int i = 0; i < list.size(); i++) {
            Integer currentNum = list.get(i);
           if (isDivisible.test(currentNum)){
               list.remove(list.get(i));
               i--;
           }
        }

        for (Integer number:list) {
            System.out.print(number + " ");
        }


    }
}
