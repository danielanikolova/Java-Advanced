import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class P01_Sorting {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int [] nums = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        boolean isSorted = false;

        for (int i = 0; i <nums.length-1 ; i++) {
            if (nums[i] < nums[i+1]) {
                isSorted = true;
                break;
            }
        }

        int[] result;
        if (isSorted = false){
            result = doSelectionSort(nums);
        }else {
           result = doBubbleSort(nums);
        }



        for (Integer num:result) {
            System.out.print(num + " ");
        }


    }

    private static int[] doBubbleSort(int[] nums) {

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

        return nums;
    }

    private static int[] doSelectionSort(int[] nums) {
        for (int index = 0; index < nums.length; index++){
            int min = index;
            for (int curr = index + 1; curr < nums.length; curr++){
                if (nums[curr] < nums[min]){
                    min = curr;
                }
            }
            swap(nums, index, min);

        }

        return nums;
    }

    private static void swap(int[] nums, int index, int min) {

        int minElm = nums[min];
        nums[min] = nums[index];
        nums[index] = minElm;

    }
}
