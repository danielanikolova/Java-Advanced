
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class P05_Palindromes {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String [] input = scanner.nextLine().split("[\\s+,.?!]+");
        Set<String>palindromes = new TreeSet<>();

        int n;

        for (int i = 0; i < input.length; i++) {

            n = input[i].length()/2;
            String word = input[i];
            boolean isPalindrome = true;

            for (int j = 0; j < n; j++) {
                if (word.charAt(j) != word.charAt(word.length()-1-j ) ){
                   isPalindrome = false;
                   break;
                }
            }
            if (isPalindrome){
                palindromes.add(word);
            }

        }

        System.out.print("[");
        System.out.printf(String.join(", ",palindromes));
        System.out.print("]");



    }
}
