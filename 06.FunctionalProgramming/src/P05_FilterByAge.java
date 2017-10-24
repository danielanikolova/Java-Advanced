import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class P05_FilterByAge {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        int N = Integer.parseInt(scanner.nextLine());
        LinkedHashMap<String, Integer> resultList = new LinkedHashMap<>();


        for (int i = 0; i < N; i++) {
            String[] input = scanner.nextLine().split(", ");
            String name = input[0];
            Integer age = Integer.parseInt(input[1]);

            resultList.put(name, age);

        }

        String condition = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        String format = scanner.nextLine();

        Predicate<Integer> createTester = createTaster(condition, age);

        Consumer<Map.Entry<String, Integer>> printer = createPrinter(format);

        prinFilterdStudents(resultList, createTester, printer);
    }

    private static void prinFilterdStudents(LinkedHashMap<String, Integer> resultList, Predicate<Integer> createTester,
                                            Consumer<Map.Entry<String, Integer>> printer) {

        for (Map.Entry<String, Integer>person:resultList.entrySet()) {

           if (createTester.test(person.getValue() )){
               printer.accept(person);
           }

        }

    }

    private static Consumer<Map.Entry<String,Integer>> createPrinter(String format) {
        switch (format){
            case "name":
                return person-> System.out.printf("%s\n", person.getKey());
            case "age":
                return person-> System.out.printf("%d\n", person.getValue());
            case "name age":
                return person -> System.out.printf("%s - %d\n", person.getKey(), person.getValue());
            default:
                return null;
        }
    }

    private static Predicate<Integer> createTaster(String condition, int age) {

        switch (condition){
            case "younger":
                return x->x<=age;
            case "older":
                return x->x>=age;
            default:
                    return null;
        }

    }
}
