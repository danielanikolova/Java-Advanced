import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class probi {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String regex = "((?<name>[A-Z][a-z]*)[^+a-zA-Z]*?(?<number>[\\+]?[\\d]+[\\d\\-()]+))";
        Pattern pattern = Pattern.compile(regex);

        String line = reader.readLine();
        Matcher matcher = pattern.matcher(line);

        Map<String, String> result = new LinkedHashMap();


        while (matcher.find()) {

            String name = matcher.group("name");
            String phone = matcher.group("number");

            result.put(name, phone);

        }


        for (Map.Entry <String, String> info:result.entrySet()) {
            System.out.printf("<b>%s:</b> %s</li>\n", info.getKey(), info.getValue());
        }


    }
}
