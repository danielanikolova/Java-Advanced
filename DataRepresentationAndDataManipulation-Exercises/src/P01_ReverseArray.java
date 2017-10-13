import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class P01_ReverseArray {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int[] nums = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        int index = 0;

       int[]result = reverseArray(nums, index);

        for (Integer num:result) {
            System.out.print(num + " ");
        }

    }

    private static int[] reverseArray(int[] nums, int index) {

        if (index==nums.length/2){
            return nums;
        }

        int current = nums[index];
        nums[index] = nums[nums.length-1-index];
        nums[nums.length-1-index] = current;

        index++;
        reverseArray(nums, index);


        return nums;
    }
}
