import java.util.Scanner;

public class P04_SeriesOfLetters {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int count = 0;
        int firstIndex = 0;
        int lastIndex = 0;

        for (int i = 0; i < input.length(); i++) {
            if (i == input.length()-1){
                break;
            }

            if (input.charAt(i) == input.charAt(i+1)){
                firstIndex = i;
                int remainder = i;
                while (input.charAt(remainder) == input.charAt(remainder+1)){
                    count++;
                    remainder++;
                    if (remainder == input.length()-1){
                        break;
                    }

                }
                lastIndex = firstIndex+count;
                String toReplace = input.substring(firstIndex,lastIndex +1);
                String replacement = String.valueOf(input.charAt(i));

                input = input.replace(toReplace, replacement);
                count = 0;


            }
        }
        System.out.println(input);

    }
}
