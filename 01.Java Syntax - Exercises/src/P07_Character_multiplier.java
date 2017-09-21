import java.util.Scanner;

public class P07_Character_multiplier {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String string1 = scanner.next("\\w+");
        String string2 = scanner.next("\\w+");

        int sum = 0;

        int len1 = string1.length();
        int len2 = string2.length();

        if (len1>=len2){
           sum = getSum(string1, string2, len1, len2);
        }
        else sum = getSum(string2, string1, len2, len1);

        System.out.println(sum);

    }
    private static int getSum(String string1, String string2, int len1, int len2){
        int sum = 0;
            for (int i = 0; i < len1; i++) {
                if (i == string2.length()) {
                    for (int j = i; j < len1; j++) {
                        sum += string1.charAt(j);
                    }
                    break;
                } else {
                    sum += string1.charAt(i) * string2.charAt(i);
                }

            }
            return sum;

    }
}
