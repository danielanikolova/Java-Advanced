import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class P03_RecursiveArraySum {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int[] nums = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();
        int index = 0;

        int sum = sumElements(nums, index);
        System.out.println(sum);

    }

    private static int sumElements(int[] nums, int index) {

        if (index == nums.length-1){
            return nums[index];
        }

        return nums[index]+ sumElements(nums, index+1);
    }
}
