import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;

public class P04_SortStudents {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Map<String, String> students = new LinkedHashMap<>();

        String input = br.readLine();

        while (!"END".equals(input)){
            String [] studentInfo = input.split("\\s+");
            String firstName= studentInfo[0];
            String lastName = studentInfo[1];

            students.put(firstName, lastName);

            input = br.readLine();

        }

        students.entrySet().stream()
                .sorted(Comparator.comparing(Map.Entry<String,String>::getValue).reversed()
                        .thenComparing(Map.Entry::getKey).reversed())
                .forEach(x->System.out.println(x.getKey()+" "+ x.getValue()));


    }
}
