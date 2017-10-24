import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class P09_CustomComparator {
    public static void main(String[] args) throws IOException {

        BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = Arrays.stream(scanner.readLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();
        Arrays.sort(arr);

        List<Integer> even = new ArrayList<>();
        List<Integer>odd = new ArrayList<>();

        Predicate<Integer>isEven = x->x%2==0;

        for (int i = 0; i < arr.length; i++) {
            if (isEven.test(arr[i])){
                even.add(arr[i]);
            }else odd.add(arr[i]);
        }

        even.addAll(odd);

        for (Integer num:even) {
            System.out.print(num+ " ");
        }


    }
}
