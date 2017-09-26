import java.util.Scanner;

public class P03_ParseTags {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String inputString = scanner.nextLine();
        String upcaseStart = "<upcase>";
        String upcaseStop = "</upcase>";

        while (inputString.contains(upcaseStart)){

            int firstIndexUp = inputString.indexOf(upcaseStart);
            int lastIndexUp = inputString.indexOf(upcaseStop)+9;

            String replaceString = inputString.substring(firstIndexUp+8, lastIndexUp-9);
            String toRemove = inputString.substring(firstIndexUp, lastIndexUp);
            String replaceStringUp = replaceString.toUpperCase();

           inputString= inputString.replaceAll(toRemove, replaceStringUp);


        }

        System.out.println(inputString);

    }
}
