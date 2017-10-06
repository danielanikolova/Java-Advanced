import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P03_TextFilter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] words = scanner.nextLine().split(", ");
        String text = scanner.nextLine();

        for (int i = 0; i < words.length; i++) {
            String word = words[i];

            Pattern pattern = Pattern.compile(word);

            Matcher matcher = pattern.matcher(text);
            while (matcher.find()){
                String replacement = "*" ;

                for (int j = 0; j < word.length()-1; j++) {
                    replacement += "*";
                }
               text =  text.replace(word, replacement);
            }
        }

        System.out.println(text);




    }
}
