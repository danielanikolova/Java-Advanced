import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P04_CombinationsCount {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int k = Integer.parseInt(br.readLine());

        int result = countCombinations(n, k);
        System.out.println(result);

    }

    private static int countCombinations(int n, int k) {
        int result = 0;
        if ((n == k) || (k == 0))
            return 1;
        else{
            result++;
            return countCombinations(n - 1, k) + countCombinations(n - 1, k - 1);
        }

    }
}
