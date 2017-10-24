import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;


public class P05_MinEvenNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        List<String>tokens = Arrays.stream(br.readLine().split("\\s+"))
                .collect(Collectors.toList());

        DoubleStream numbers = tokens.stream()
                .filter(x->!x.isEmpty())
                .mapToDouble(Double::parseDouble)
                .filter(x->x%2==0);

        OptionalDouble minEvenNumber = numbers.min();
        if (minEvenNumber.isPresent()){
            System.out.printf("%.2f",minEvenNumber.getAsDouble());
        }else System.out.println("No match");
    }
}
