import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P05_VowelCount {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Pattern pattern = Pattern.compile("[AEIOUYaeouiy]");
        Matcher matcher = pattern.matcher(scanner.nextLine());

        int count = 0;
        while (matcher.find()){
            count++;
        }

        System.out.printf("Vowels: %d",count);

    }
}
