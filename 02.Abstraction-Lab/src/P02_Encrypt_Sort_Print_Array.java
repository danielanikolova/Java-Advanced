import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class P02_Encrypt_Sort_Print_Array {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        String[] lines = new String[n];

        for (int i = 0; i < n; i++) {
            lines[i] = scanner.nextLine();
        }

        int[] sums = encryptArray(lines);
        Arrays.sort(sums);
        printArray(sums);

    }

    private static int[] encryptArray(String [] lines) {

        int [] sums = new int[lines.length];

        for (int i = 0; i < lines.length; i++) {
           String name = lines[i];
            int stringLength = name.length();
            int sumName = 0;
            List<Character> vocals = new ArrayList<>();
            vocals.add('a');
            vocals.add('A');
            vocals.add('e');
            vocals.add('E');
            vocals.add('i');
            vocals.add('I');
            vocals.add('o');
            vocals.add('O');
            vocals.add('u');
            vocals.add('U');
            for (int j = 0; j <name.length() ; j++) {
                if (vocals.contains( name.charAt(j))){
                    sumName +=   name.charAt(j)*stringLength;
                }
                else {
                    sumName +=   name.charAt(j)/stringLength;
                }
            }
            sums[i] = sumName;
        }
        return sums;
    }

    private static void printArray(int[] sums) {
        for (int i = 0; i < sums.length; i++) {
            System.out.println(sums[i]);

        }
    }
}
