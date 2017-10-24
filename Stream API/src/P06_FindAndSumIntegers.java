import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.OptionalInt;

public class P06_FindAndSumIntegers {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        OptionalInt sumOfInts = Arrays.stream(br.readLine().split("\\s+"))
                .filter(x->isNumber(x))
                .mapToInt(Integer::parseInt)
                .reduce((x, y)-> x+y);


        if (sumOfInts.isPresent()){
            System.out.println(sumOfInts.getAsInt());
        }else System.out.println("No match");

    }

    private static boolean isNumber(String num){
        if(num.isEmpty()){
            return false;
        }

        for (int i = 0; i < num.length(); i++) {
            if (num.charAt(0) == '+' || num.charAt(0) == '-') {
                continue;

            }

            if (!Character.isDigit(num.charAt(i))){
                return false;
            }

        }
        return true;
    }
}
