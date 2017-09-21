import java.util.Arrays;
import java.util.Scanner;

public class P08_Get_first_odd_or_even_elements {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int [] nums = Arrays.stream(scanner.nextLine()
                .split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        String[] command = scanner.nextLine().split("\\s+");

        int count = 0;
        if (command[2].equals("odd")){
            for (int i = 0; i < nums.length ; i++) {
                if (nums[i]%2 !=0){
                    System.out.printf("%d ", nums[i]);
                    count++;
                    if(count == Integer.parseInt(command[1])){
                        break;
                    }
                }
            }
        }else {
            for (int i = 0; i < nums.length ; i++) {
                if (nums[i]%2 ==0){
                    System.out.printf("%d ", nums[i]);
                    count++;
                    if(count == Integer.parseInt(command[1])){
                        break;
                    }
                }
            }
        }

    }
}
