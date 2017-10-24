import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P12_LittleJohn {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String regex = "([>]{1,3})[-]{5}([>]{1,2})";

        Pattern pattern = Pattern.compile("(?<small>>-{5}>)|(?<medium>>>-{5}>)|(>>>-{5}>>)");

        int small = 0;
        int medium = 0;
        int large = 0;

        for (int i = 0; i < 4; i++) {
            String hay = br.readLine();
            Matcher matcher = pattern.matcher(hay);

            while (matcher.find()) {

                if (matcher.group("small") != null) {
                    small++;
                } else if (matcher.group("medium") != null) {
                    medium++;
                } else {
                    large++;
                }

            }
        }

        String arrows = "" + small + medium + large;

        String binary = Integer.toBinaryString(Integer.valueOf(arrows));
        String reversedBinary = binary + new StringBuilder(binary).reverse();
        int result = Integer.parseInt(reversedBinary, 2);

        System.out.println(result);
    }

}
