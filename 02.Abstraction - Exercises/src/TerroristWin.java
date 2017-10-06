import java.util.Scanner;

public class TerroristWin {

    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);

        String text = scanner.nextLine();
        char[] result = text.toCharArray();

        int tempIndex = 0;

        while (text.indexOf('|', tempIndex) != -1) {

            int startIndex = text.indexOf('|', tempIndex);
            int endIndex = text.indexOf('|', startIndex + 1);

            char[] bombArray = text.substring(startIndex + 1, endIndex).toCharArray();

            int sum = 0;

            for (char c : bombArray) {
                sum += c;
            }

            int bombPower = sum % 10;

            int leftChars = Math.max(0, startIndex - bombPower);
            int rightChars = Math.min(text.length() - 1, endIndex + bombPower);

            for (int i = leftChars; i <= rightChars; i++) {
                result[i] = '.';
            }

            tempIndex = endIndex + 1;
        }

        System.out.println(result);

    }

}
