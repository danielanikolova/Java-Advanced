import java.util.Arrays;
import java.util.Scanner;

public class P01_StudentsResults {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println(String.format("%1$-10s|%2$7s|%3$7s|%4$7s|%5$7s|", "Name", "JAdv", "JavaOOP", "AdvOOP", "Average"));

//        String input = scanner.nextLine();
        while (scanner.hasNextLine()){
            String input = scanner.nextLine();
            String[] tokens = input.trim()
                    .split(" - ");

            String name = tokens[0];
            double[] results = Arrays.stream(tokens[1].split(", "))
                    .mapToDouble(Double::parseDouble)
                    .toArray();

            double average = (results[0] + results[1] + results[2])/3;

            System.out.printf("%1$-10s|%2$7.2f|%3$7.2f|%4$7.2f|%5$7.4f|\n", name, results[0], results[1], results[2], average);


        }

    }
}
