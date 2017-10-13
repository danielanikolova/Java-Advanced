import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class P05_Chocolates {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bf.readLine());
        int[] chocolates = Arrays.stream(bf.readLine().split(", "))
                .mapToInt(Integer::new).toArray();

        int m = Integer.parseInt(bf.readLine());
        Arrays.sort(chocolates);

        int minDiff = Integer.MAX_VALUE;

        for (int i = 0; i < chocolates.length + 1 - m; i++) {
            int[] subArrayFromChocolates = Arrays.copyOfRange(chocolates, i, i + m);
            int currentDiff = Math.abs(subArrayFromChocolates[0] - subArrayFromChocolates[subArrayFromChocolates.length - 1]);

            if (currentDiff < minDiff) {
                minDiff = currentDiff;
            }
        }

        System.out.printf("Min Difference is %d.%n", minDiff);


    }
}
