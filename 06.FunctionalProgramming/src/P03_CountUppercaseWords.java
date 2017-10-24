import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class P03_CountUppercaseWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");

        Predicate<String> isUpper = w->w.charAt(0) == w.toUpperCase().charAt(0);

        List<String> upperWords = new ArrayList<>();

        for (String item :input) {
            if (item.equals("")){
                continue;
            }
           if (isUpper.test(item)){
               upperWords.add(item);
           }
        }

        System.out.println(upperWords.size());
        for (String word:upperWords) {
            System.out.println(word);
        }
    }
}
