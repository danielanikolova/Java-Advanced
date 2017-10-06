import java.util.Scanner;

public class P04_UnicodeCharacters {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input=scanner.nextLine();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {

            sb.append("\\u").append(Integer.toHexString(input.charAt(i)|0x10000).substring(1));

        }

        System.out.println(sb);

    }
}
