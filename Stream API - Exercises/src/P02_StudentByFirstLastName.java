import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class P02_StudentByFirstLastName {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Map<String, String> students = new LinkedHashMap<>();

        String input = br.readLine();

        while (!"END".equals(input)){
            String [] studentInfo = input.split("\\s+");

            String firstName= studentInfo[0];
            String lastName = studentInfo[1];
            String fullName = firstName + " "+ lastName;


                    students.put(fullName, lastName);

            input = br.readLine();

        }


        students.entrySet().stream()
                .filter((x)-> (x.getKey().substring(0, x.getKey().indexOf(" ")).compareTo(x.getValue()))<1)
                .forEach(x-> System.out.println(x.getKey()));

    }
}
