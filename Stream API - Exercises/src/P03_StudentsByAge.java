import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;

public class P03_StudentsByAge {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Map<String, Integer> students = new LinkedHashMap<>();

        String input = br.readLine();

        while (!"END".equals(input)){
            String [] studentInfo = input.split("\\s+");
            String name= studentInfo[0] + " " + studentInfo[1];
            int age = Integer.parseInt(studentInfo[2]);
            students.put(name, age);

            input = br.readLine();

        }

        students.entrySet().stream()
                .filter(x->x.getValue()>=18&& x.getValue()<=24)
                .forEach( b-> System.out.println( b.getKey() + " "+ b.getValue()));

    }
}
