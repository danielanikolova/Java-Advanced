import java.util.Scanner;
import java.util.function.Predicate;

public class P07_PredicateForNames {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        int N = Integer.parseInt(scanner.nextLine());

        String[] names = scanner.nextLine().split(" ");

        Predicate<Integer> correctLength = x->x<=N;

        for (String name:names) {
            if (correctLength.test(name.length())){
                System.out.println(name);
            }
        }


    }
}
