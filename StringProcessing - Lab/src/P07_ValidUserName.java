import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P07_ValidUserName {
    public static void main(String[] args) {


    Scanner scanner = new Scanner(System.in);

    String input = scanner.nextLine();

        Pattern pattern = Pattern.compile("^[a-zA-Z0-9_-]{3,16}$");

    while (!input.equals("END")){
        if (input.length()<3 || input.length()>16){
            System.out.println("invalid");
        }else {

            Matcher matcher = pattern.matcher(input);
            if (matcher.find()){
                System.out.println("valid");
            }else  System.out.println("invalid");

        }
        input = scanner.nextLine();

    }

}
}
