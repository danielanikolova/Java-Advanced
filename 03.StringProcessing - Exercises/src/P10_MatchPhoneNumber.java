import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P10_MatchPhoneNumber {
    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();

        while (!input.equals("end")){

            if (input.matches("^\\+359([- ])2\\1\\d{3}\\1\\d{4}$")){
                System.out.println(input);
            }
            input = br.readLine();

        }

    }
}
