import java.util.HashMap;
import java.util.Scanner;

public class P12_MinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        HashMap<String, Integer> resultList = new HashMap<>();

        while (!input.equals("stop")){

            String element = input;
            int quantity = Integer.parseInt(scanner.nextLine());

            if (!resultList.containsKey(element)){
                resultList.put(element, quantity);
            }else {
                resultList.put(element, resultList.get(element)+quantity);
            }

            input = scanner.nextLine();
        }

        for (String element:resultList.keySet()) {
            System.out.printf("%s -> %d\n", element, resultList.get(element));
        }
    }
}
