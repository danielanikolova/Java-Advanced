import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class P07_LettersChangeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Character> alphabet = new LinkedList<>();
        for (char i = 'a'; i <= 'z'; i++) {
            alphabet.add(i);
        }
        double sum = 0;
        double totalSum = 0;

        String[] input = scanner.nextLine().split("\\s+");

            String sequence;
            for (int i = 0; i < input.length; i++) {
                sequence = input[i];

                char firstChar = sequence.charAt(0);
                String numAsString = sequence.substring(1, sequence.length()-1);
                int num = Integer.parseInt(numAsString);
                char secondChar = sequence.charAt(sequence.length()-1);
                sum = num;

                if (alphabet.contains(firstChar)){
                    sum *= (alphabet.indexOf(firstChar)+1);
                }else {
                    firstChar = Character.toLowerCase(firstChar);
                    sum/=alphabet.indexOf(firstChar)+1;
                }
                if (alphabet.contains(secondChar)){
                    sum+=(alphabet.indexOf(secondChar))+1;
                }else {
                    secondChar = Character.toLowerCase(secondChar);
                    sum-=alphabet.indexOf(secondChar)+1;;
                }
                totalSum+=sum;
                sum=0;
            }
        System.out.printf("%.2f", totalSum);

    }
}
