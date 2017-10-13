import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class P03_ImplementBinarySearchUsingRecursion {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int[] nums = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        int num = Integer.parseInt(br.readLine());

        int start = 0;
        int end = nums.length-1;
        int result = binarySearch(nums, num,start, end);

        System.out.println(result);

    }

    private static int binarySearch(int[] nums, int num, int start, int end) {
        if (start<=end){

            int mid =(start + end) / 2;
            if (num<nums[mid]){
                return binarySearch(nums, num,start, mid-1);
            }else if (num>nums[mid]){
                return binarySearch(nums, num,mid+1, end );
            }else return mid;
        }

        return -1;
    }
}
