import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class P07_FindTheMissingNumber {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] numbers = Arrays.stream(br.readLine().split(", "))
                .mapToInt(Integer::parseInt).toArray();

        Arrays.sort(numbers);

       int missingNumber = getMissingNumber(numbers);

        System.out.println(missingNumber);

    }

    private static int getMissingNumber(int[] numbers) {
        int missingNumber= 0;
        for (int i = 0; i < numbers.length-1; i++) {
            int first = numbers[i]+1;
            int second = numbers[i+1];
            if (first!=second){
                missingNumber = second-1;
            }
        }
        if (missingNumber==0&&numbers[0]==1){
            return numbers[numbers.length-1]+1;
        }
        else  if (missingNumber==0 && numbers[0]!=1){
            return missingNumber =1;
        }
        return missingNumber;
    }
}
