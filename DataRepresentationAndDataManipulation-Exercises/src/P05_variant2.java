import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class P05_variant2 {
   private static int minDiff = Integer.MAX_VALUE;
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bf.readLine());
        int[] chocolates = Arrays.stream(bf.readLine().split(", "))
                .mapToInt(Integer::new).toArray();

        int m = Integer.parseInt(bf.readLine());
        Arrays.sort(chocolates);
        int[] setOfChocolates = new int[m];

        int index = 0;
        int border = -1;

        generateCombinations(chocolates, index, border, setOfChocolates);
        System.out.printf("Min Difference is %d.", minDiff);
    }

    private static void generateCombinations(int[] chocolates, int index, int border, int[] setOfChocolates) {

        if (index>setOfChocolates.length){
            return;
        }

        for (int j = border+1; j < setOfChocolates.length; j++) {
            setOfChocolates[j] = chocolates[j];


        }
//        generateCombinations(chocolates, index+1,border,setOfChocolates);

        int diff =setOfChocolates[setOfChocolates.length-1]- setOfChocolates[0];
        if (diff<minDiff){
            minDiff = diff;
            diff=0;

        }

        generateCombinations(chocolates, index+1,border,setOfChocolates);

    }
}
