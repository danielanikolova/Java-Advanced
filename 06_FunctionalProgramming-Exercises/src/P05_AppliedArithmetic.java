import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;

public class P05_AppliedArithmetic {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Integer[] arr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .boxed()
                .toArray( Integer[]::new);

        String command = scanner.nextLine();
        Consumer<Integer[]> printThem = x -> {
            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < x.length; i++) {
                sb.append(x[i]).append(" ");
            }
            System.out.println(sb.toString().trim());
        };

        while (true){
            if (command.equals("end")){
                break;
            }
            if (command.equals("print")){
                printThem.accept(arr);
            }else {
                Function<Integer, Integer> newValue = executeCommands(command);
                for (int i = 0; i < arr.length; i++) {
                    arr[i] = newValue.apply(arr[i]);
                }
            }

            command = scanner.nextLine();
        }
    }

    private static Function<Integer,Integer> executeCommands(String command) {

        switch (command){
            case "add":
              return   x->x+1;
            case "multiply":
                return x->x*2;
            case "subtract":
               return x->x-1;
                default:
                    return null;
        }

    }
}
