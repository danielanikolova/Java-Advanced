import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class P03_BasicQueueOperations {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        int [] elements = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int N = elements[0];
        int S = elements[1];
        int X = elements[2];

        int [] input = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        ArrayDeque<Integer> queue = new ArrayDeque<>();

        for (int i = 0; i <N; i++) {
            queue.add(input[i]);
        }

        for (int i = 0; i < S; i++) {
            queue.poll();
        }
        int smallestElement = Integer.MAX_VALUE;

        if (queue.contains(X)){
            System.out.println(true);
        }else if (queue.size()==0){
            System.out.println("0");
        }
        else {
            for (Integer num:queue) {
                if (num<smallestElement){
                    smallestElement = num;
                }
            }
            System.out.println(smallestElement);
        }
    }
}
