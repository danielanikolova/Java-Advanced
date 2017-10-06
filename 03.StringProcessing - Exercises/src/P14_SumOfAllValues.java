import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P14_SumOfAllValues {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String keyString = br.readLine();
        String textString = br.readLine();

        String startKey = findStartKey(keyString);
        String endKey = findEndKey(keyString);

        Pattern pattern = Pattern.compile(startKey + "(?<value>[0-9.]*)" + endKey);
        Matcher matcher = pattern.matcher(textString);

        double currentNumber = 0;
        double sum = 0;
        int counter = -1;


        while (matcher.find()) {
            try {
                currentNumber = Double.parseDouble(matcher.group("value"));
                sum += currentNumber;
                counter++;
            } catch (Exception ex) {
                counter++;
            }
        }
        if (startKey.equals("") || endKey.equals("")) {
            System.out.println("<p>A key is missing</p>");

        } else if (sum > 0) {
            if (sum % 1 == 0) {
                System.out.printf("<p>The total value is: <em>%d</em></p>\n", (int) sum);
                return;
            }
            System.out.printf("<p>The total value is: <em>%.2f</em></p>\n", sum);
        } else if (sum == 0) {
            System.out.println("<p>The total value is: <em>nothing</em></p>\n");
        }
    }

    private static String findEndKey(String keyString) {
        String endKey = "";

        Pattern keyPattern = Pattern.compile("[0-9]+([A-Za-z_]+)$");
        Matcher keyMatcher = keyPattern.matcher(keyString);

        if (keyMatcher.find()) {
            String[] tokens = keyString.split("[0-9]+");
            endKey = tokens[tokens.length - 1];
        }

        return endKey;
    }

    private static String findStartKey(String keyString) {
        String startKey = "";

        Pattern keyPattern = Pattern.compile("([A-Za-z_]+)[0-9]+");
        Matcher keyMatcher = keyPattern.matcher(keyString);

        if (keyMatcher.find()) {
            String[] tokens = keyString.split("[0-9]+");
            startKey = tokens[0];
        }

        return startKey;
    }
}
