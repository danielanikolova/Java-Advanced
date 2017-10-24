import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class P08_BoundedNumbers {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> bounds = Arrays.stream(br.readLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .boxed()
                .sorted()
                .collect(Collectors.toList());

        List<Integer> nums = Arrays.stream(br.readLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .boxed()
                .collect(Collectors.toList());

        nums.stream().filter(n->bounds.get(0)<=n && n<= bounds.get(bounds.size()-1))

                .forEach(n-> System.out.print(n + " "));
    }
}
