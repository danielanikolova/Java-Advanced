import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class P03_FirstName {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        List<String> names = Arrays.stream(br.readLine().split("\\s+"))
                .collect(Collectors.toList());

        List<Character> chars = Arrays.stream(br.readLine().split("\\s+"))
                .map(s->Character.toLowerCase(s.charAt(0))).collect(Collectors.toList());


       Optional<String>firstName = names.stream()
                .filter(n-> chars.contains(n.toLowerCase().charAt(0)))
               .sorted()
               .findFirst();

       if (firstName.isPresent()){
           System.out.println(firstName.get());
       }else System.out.println("No match");

    }
}
