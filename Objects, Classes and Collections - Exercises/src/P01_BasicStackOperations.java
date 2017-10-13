import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class P01_BasicStackOperations {
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

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i <N; i++) {
            stack.push(input[i]);
        }

        for (int i = 0; i < S; i++) {
            stack.pop();
        }

        int smallestElement = Integer.MAX_VALUE;

        if (stack.contains(X)){
            System.out.println(true);
        }else if (stack.size()==0){
            System.out.println("0");
        }
        else {
            for (int i = 0; i < stack.size(); i++) {
               if (stack.peek()<smallestElement){
                    smallestElement = stack.pop();

                }

            }
            System.out.println(smallestElement);
        }

    }
}
