import java.util.Scanner;

public class P01_CountSubstringOccurrences {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        String sequence = scanner.nextLine().toLowerCase();
        int chars = sequence.length();
        String subString = null;
        int count = 0;


        for (int i = 0; i < text.length(); i++) {
            if (i == text.length()-chars+1){
                break;
            }
            subString = text.substring(i, i+chars).toLowerCase();

            if (subString.equals(sequence)){
                count++;
            }


        }
        System.out.println(count);



    }
}
