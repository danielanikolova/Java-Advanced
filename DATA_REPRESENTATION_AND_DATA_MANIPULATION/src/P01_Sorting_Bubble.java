import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

public class P01_Sorting_Bubble {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int [] nums = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        boolean swapped = true;

        do {
            swapped = false;
            for (int index = 0; index < nums.length - 1; index++){
                if (nums[index] > nums[index + 1]){
                    swap(nums, index, index + 1);
                    swapped = true;
                }
            }
        } while (swapped);


        for (Integer num:nums) {
            System.out.print(num + " ");
        }
    }

    private static void swap(int[] nums, int index, int min) {

        int minElm = nums[min];
        nums[min] = nums[index];
        nums[index] = minElm;
    }





}
