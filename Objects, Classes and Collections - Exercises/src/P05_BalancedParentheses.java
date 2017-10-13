import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class P05_BalancedParentheses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("");

        if ((input.length%2!=0)){
            System.out.println("NO");
            return;
        }

        Deque<String> stack = new ArrayDeque<>();
        Deque<String> queue = new ArrayDeque<>();

        for (int i = 0; i < input.length; i++) {
//            String firstElement = input[i];
//            String lastElement = input[input.length-1-i];
            if (i <= (input.length -1)/2){
                stack.push(input[i]);
            }else if (i>(input.length -1)/2){
                queue.add(input[i]);
            }

        }

        boolean result = true;

        for (int i = 0; i <stack.size() ; i++) {
            String stackElement = stack.pop();
            String queueElement = queue.poll();


            if (stackElement.equals("{")){
                if (queueElement.equals("}")){
                   result = true;
                }else {
                    System.out.println("NO");
                    return;
                }
            }else if (stackElement.equals("(")){
                if (queueElement.equals(")")){
                    result = true;
                }else {
                    System.out.println("NO");
                    return;
                }
            }else if (stackElement.equals("[")){
                if (queueElement.equals("]")){
                    result = true;
                }else {
                    System.out.println("NO");
                    return;
                }
            }
            else if (stackElement.equals("}")){
                if (queueElement.equals("{")){
                    result = true;
                }else {
                    System.out.println("NO");
                    return;
                }
            }
            else if (stackElement.equals("]")){
                if (queueElement.equals("[")){
                    result = true;
                }else {
                    System.out.println("NO");
                    return;
                }
            }
            else if (stackElement.equals(")")){
                if (queueElement.equals("(")){
                    result = true;
                }else {
                    System.out.println("NO");
                    return;
                }
            }
        }
        if (result == true){
            System.out.println("YES");
        }


    }
}
