import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class P02_Searching {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int [] nums = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();






    }
}
