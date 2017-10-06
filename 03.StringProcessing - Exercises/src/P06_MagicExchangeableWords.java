import java.util.HashMap;
import java.util.Scanner;

public class P06_MagicExchangeableWords {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String [] words = scanner.nextLine().split("\\s+");
        String first = words[0];
        String second = words[1];

        System.out.println(areEqual(first, second));



    }

    private static boolean areEqual(String first, String second) {

        boolean areEqual = true;
        HashMap<Character, Character> chars = new HashMap<>();
        int n;
        
        if (first.length()<=second.length()){
            n = first.length();
        }else n = second.length();

        for (int i = 0; i < n; i++) {
            char char1 = first.charAt(i);
            char char2 = second.charAt(i);

            if (!chars.containsKey(char1)){
                if (!chars.containsValue(char2)){
                    chars.put(char1, char2);
                }else {
                    areEqual = false;
                    return areEqual;
                }

            }else {
                if (!chars.containsValue(char2)){
                    areEqual = false;
                    return areEqual;
                }
            }
        }
        if (first.length() == second.length()){
            return areEqual;
        }
        else if (first.length()>second.length()) {
            String lastElms = first.substring(second.length());

            for (int i = 0; i < lastElms.length(); i++) {
                if (!chars.containsKey(lastElms.charAt(i))){
                    areEqual = false;
                    return areEqual;
                }

            }
        }else {
            String lastElms = second.substring(first.length());
            for (int i = 0; i < lastElms.length(); i++) {
                if (!chars.containsValue(lastElms.charAt(i))){
                    areEqual = false;
                    return areEqual;
                }

            }
        }

        return areEqual;
    }
}
