import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P09_MatchFullName {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();

        while (!input.equals("end")){
            Pattern pattern = Pattern.compile("^[A-Z][a-z]+ [A-Z][a-z]+$");
            Matcher matcher = pattern.matcher(input);
            if (matcher.find()){
                System.out.println(input);
            }
            input = br.readLine();
        }

    }
}
