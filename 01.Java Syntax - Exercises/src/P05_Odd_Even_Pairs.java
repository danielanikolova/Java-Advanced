import java.util.Arrays;
import java.util.Scanner;

public class P05_Odd_Even_Pairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] nums = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        for (int i = 0; i < nums.length; i++) {
            if (nums.length%2!=0){
                System.out.println("invalid length");
                break;
            }
          if (nums[i]%2 == 0 && (nums[i+1])%2 == 0){
              System.out.printf("%d, %d -> both are even%n", nums[i], nums[i+1]);
          }
          else if(nums[i]%2 != 0 && (nums[i+1])%2 != 0){
              System.out.printf("%d, %d -> both are odd%n", nums[i], nums[i+1]);
          }
          else {
              System.out.printf("%d, %d -> different%n", nums[i], nums[i+1]);
          }

          i = i+1;

          if (i >=nums.length-1 ){
              break;
          }

        }
    }
}
