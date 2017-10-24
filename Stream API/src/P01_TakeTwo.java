import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class P01_TakeTwo {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        List<Integer>numbers = Arrays.stream(br.readLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .boxed()
                .collect(Collectors.toList());


        numbers.stream().filter(x->x>=10 && x<=20).distinct().limit(2)
                .forEach(s-> System.out.print(s + " "));

    }
}
