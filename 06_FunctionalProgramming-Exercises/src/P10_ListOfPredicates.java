import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;


public class P10_ListOfPredicates {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N =Integer.parseInt( br.readLine());

        Integer[] arr = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt).boxed()
                .toArray(Integer[]::new);

        BiPredicate<Integer, Integer> isDivisible = (x, y)-> x%y==0;
        BiPredicate<Integer, Integer[]> isDivisibleArr = (x, y)-> {

           boolean divisible = true;
            for (int i = 0; i <y.length; i++) {
                if (!isDivisible.test(x, y[i])){
                    divisible=false;
                }
            }
            return divisible;
        };

        List<Integer>resultList = new ArrayList<>();

        for (int i = 1; i <= N; i++) {
            if (isDivisibleArr.test(i, arr)){
                resultList.add(i);
            }
        }
        for (Integer number:resultList) {
            System.out.print(number+" ");
        }
    }
}
