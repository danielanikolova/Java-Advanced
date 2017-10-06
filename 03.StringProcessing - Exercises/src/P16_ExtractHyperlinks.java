import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P16_ExtractHyperlinks {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder text = new StringBuilder();
        Pattern pattern = Pattern.compile("<a\\s+([^>]+)?href\\s*=\\s*('([^']*)'|\"([^\"]*)\"|([^\\s>]+))[^>]*>");

        while (true){
            String line = br.readLine();
            if ("END".equals(line)){
                break;
            }
            text.append(line);
        }
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()){
            for (int i = 5; i >=0 ; i--) {
                String result = matcher.group(i);
                if (result!=null){
                    System.out.println(result);
                    break;
                }

            }
        }

    }
}
