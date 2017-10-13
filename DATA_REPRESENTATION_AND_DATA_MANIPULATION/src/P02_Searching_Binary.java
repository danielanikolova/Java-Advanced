import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class P02_Searching_Binary {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int[] nums = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        int num = Integer.parseInt(br.readLine());

        int start = 0;
        int end = nums.length-1;


        int index = searchBinary(nums,num,start, end);

        System.out.println(index);

    }

    private static int searchBinary(int[] nums, int num, int start, int end) {

        int searchedIndex = -1;
        while (end >= start) {
            int mid = (start + end) / 2;
            if (nums[mid] > num)
                end = mid - 1;
            else if (nums[mid] < num)
                start = mid + 1;
            else {
                searchedIndex = mid;
                break;
            }
        }

        return searchedIndex;
    }
}


