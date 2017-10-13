import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class P10_CountSymbols {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        TreeMap<Character, Integer> resultList = new TreeMap<>();

        for (int i = 0; i < input.length(); i++) {
            Character currentChar = input.charAt(i);

            if (!resultList.containsKey(currentChar)){
                resultList.put(currentChar, 1);
            }else {
                resultList.put(currentChar, resultList.get(currentChar)+1);
            }
        }

        for (Character ch:resultList.keySet()) {
            int value = resultList.get(ch);

            System.out.printf("%s: %d time/s\n", ch, value);
        }
    }
}
