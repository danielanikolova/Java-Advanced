import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class P08_FindTheSmallestElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> list = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).boxed()
                .collect(Collectors.toList());


        Function<List<Integer>, Integer> smallestIndex = x->{
            int smallestNum = Integer.MAX_VALUE;
            int index = 0;
            for (int i = 0; i < x.size(); i++) {
                if (x.get(i)<=smallestNum){
                    smallestNum = x.get(i);
                    index = i;
                }
            }
            return index;
        };

        System.out.println(smallestIndex.apply(list));
    }
}
