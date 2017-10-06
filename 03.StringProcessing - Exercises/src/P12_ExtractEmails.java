import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P12_ExtractEmails {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();

        StringBuilder sb = new StringBuilder();

        while (!input.equals("end")){
            sb.append(input);
            input = br.readLine();
        }

        Pattern pattern = Pattern.compile("\\b(?<!\\S)[a-z][a-z0-9\\.\\-\\_]*[a-z0-9]*@[a-z][a-z\\-]*\\.[a-z][a-z\\.]*[a-z]?\\b");

        Matcher matcher = pattern.matcher(sb);
        Set<String> mails = new LinkedHashSet<>();

        while (matcher.find()){
            mails.add(matcher.group());

        }

        for (String mail:mails) {
            System.out.println(mail);
        }

    }
}
