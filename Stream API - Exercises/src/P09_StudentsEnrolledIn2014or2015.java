import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class P09_StudentsEnrolledIn2014or2015 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line = br.readLine();

        Map<String, List<Integer>> resultList = new LinkedHashMap<>();

        while (!"END".equals(line)){

            String[]tokens = line.split("\\s+");
            String facultyNumber = tokens[0];

            List<Integer>grades = new ArrayList<>();

            for (int i = 1; i < tokens.length; i++) {
                grades.add(Integer.parseInt(tokens[i]));
            }

            resultList.put(facultyNumber, grades);

            line = br.readLine();
        }

        resultList.entrySet().stream()
                .filter(x->x.getKey().endsWith("14")||x.getKey().endsWith("15"))
                .forEach(b-> {
                    for (int i = 0; i < b.getValue().size(); i++) {
                        System.out.print(b.getValue().get(i)+ " ");
                    }
                    System.out.println();
                });
    }
}
