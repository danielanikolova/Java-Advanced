import java.util.*;

public class P01_SortEvenNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] input = Arrays.stream(scanner.nextLine().split(", "))
                .mapToInt(Integer::parseInt).toArray();

        List<Integer>numbersList = new ArrayList<>();

        for (Integer number:input) {
            numbersList.add(number);
        }

        numbersList.removeIf(x->x%2!=0);

        for (int i = 0; i < numbersList.size(); i++) {
            if (i==numbersList.size()-1){
                System.out.println(numbersList.get(i));
            }else {
                System.out.printf("%d, ", numbersList.get(i));
            }
        }

        numbersList.sort((a,b)->a.compareTo(b));

        for (int i = 0; i < numbersList.size(); i++) {
            if (i==numbersList.size()-1){
                System.out.println(numbersList.get(i));
            }else {
                System.out.printf("%d, ", numbersList.get(i));
            }
        }


    }
}
