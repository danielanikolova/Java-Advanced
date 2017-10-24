import java.util.Scanner;
import java.util.function.Consumer;

public class P02_KnightsOfHonor {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] names = scanner.nextLine().split(" ");

        Consumer<String> print = x-> System.out.println("Sir "+ x);

        for (String name:names) {
            print.accept(name);
        }

    }
}
