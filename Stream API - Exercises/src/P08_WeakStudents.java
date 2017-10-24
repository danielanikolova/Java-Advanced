import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class P08_WeakStudents {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line = br.readLine();

        Map<String, List<Integer>> resultList = new LinkedHashMap<>();

        while (!"END".equals(line)){

            String[]tokens = line.split("\\s+");
            String name = tokens[0] + " " + tokens[1];

            List<Integer>grades = new ArrayList<>();

            for (int i = 2; i < tokens.length; i++) {
                grades.add(Integer.parseInt(tokens[i]));
            }

            resultList.put(name, grades);

            line = br.readLine();
        }

        resultList.entrySet().stream()
                .filter(x->{
                    int counter = 0;

                    for (int i = 0; i <x.getValue().size() ; i++) {
                        if (x.getValue().get(i)<=3){
                            counter++;
                        }

                    }
                    return counter >= 2;
                })
                .forEach(b-> System.out.println(b.getKey()));

    }
}
