import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class P02_UpperStrings {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        List<String> strings = Arrays.stream( br.readLine().split("\\s+"))
                .collect(Collectors.toList());

        strings.stream().forEach(s-> System.out.print(s.toUpperCase()+" "));




    }
}
