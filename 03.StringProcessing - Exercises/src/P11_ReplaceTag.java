import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P11_ReplaceTag {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        StringBuilder code = new StringBuilder();

        while (true) {
            String line = scanner.nextLine();
            if ("END".equals(line)) {
                break;
            }

            code.append(line).append("\r\n");
        }

        Pattern regex = Pattern.compile("<a(.+?)>(.*?)<\\/a>", Pattern.DOTALL);
        Matcher matcher = regex.matcher(code);

        String replacement = "[URL$1]$2[/URL]";

        String result = matcher.replaceAll(replacement);

        System.out.println(result.toString());
    }
}
