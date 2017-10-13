import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class P02_MaximumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfCommands = Integer.parseInt(scanner.nextLine());

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        Deque<Integer>maxNumber = new ArrayDeque<>();

        int maxElement = Integer.MIN_VALUE;

        for (int i = 0; i < numberOfCommands; i++) {

            String [] tokens = scanner.nextLine().split(" ");

           if (tokens[0].equals( "1")){

               int number = Integer.parseInt(tokens[1]);
               stack.push(number);
               if (number>=maxElement){
                   maxElement = number;
                   maxNumber.push(number);
               }

           }else if (tokens[0].equals("2")){

               int poppedElement = stack.pop();
               if (poppedElement==maxElement){
                   maxNumber.pop();
                   if (!maxNumber.isEmpty()) {
                       maxElement = maxNumber.peek();
                   }else {
                       maxElement = Integer.MIN_VALUE;
                   }
               }

           } else if (tokens[0].equals("3")){

               System.out.println(maxNumber.peek());

           }

        }
    }
}
