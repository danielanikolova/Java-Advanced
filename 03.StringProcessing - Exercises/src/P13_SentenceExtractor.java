import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P13_SentenceExtractor {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String word = br.readLine();

        String regex = "(^| )[^!.?]*\\b" + word + "\\b.*?[.!?]";
        Pattern pattern = Pattern.compile(regex);

        String text = br.readLine();
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println(matcher.group().trim());
        }


    }
}
