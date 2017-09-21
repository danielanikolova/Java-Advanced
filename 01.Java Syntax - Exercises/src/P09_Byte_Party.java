import java.util.Scanner;

public class P09_Byte_Party {

    public static void main(String[] args) {

        Scanner scanner =  new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int[] nums = new int [a];

        for (int i = 0; i < a; i++) {
            int b = Integer.parseInt(scanner.nextLine());
            nums[i] =b;
        }

        while (true){
            String[] command = scanner.nextLine().split("\\s+");

            if (command[0].equals("party")){
                for (int num:nums){
                    System.out.println(num);
                }
                break;
            }

            int action = Integer.parseInt(command[0]);
            int position = Integer.parseInt(command[1]);

            switch (action){
                case -1:
                    for (int i = 0; i < nums.length ; i++) {
                        nums[i] = (nums[i]^(1<<position));
                    }
                    break;
                case 0:
                    int mask = ~(1<<position);
                    for (int i = 0; i < nums.length ; i++) {
                        nums[i] = nums[i] & mask;
                    }
                    break;
                case 1:
                    int mask1 = 1<<position;
                    for (int i = 0; i <nums.length ; i++) {
                        nums[i] = nums[i] | mask1;
                    }
                    break;
                    default:
                        break;
            }

        }
    }
}
