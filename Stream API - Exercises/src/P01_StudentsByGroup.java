import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.*;

public class P01_StudentsByGroup {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        Map<String, Integer> students = new LinkedHashMap<>();

        String input = br.readLine();

        while (!"END".equals(input)){
            String [] studentInfo = input.split("\\s+");
            String name= studentInfo[0] + " " + studentInfo[1];
            int group = Integer.parseInt(studentInfo[2]);



            students.put(name, group);

            input = br.readLine();

        }

        students.entrySet().stream()
                .sorted(Comparator.comparing(x -> x.getKey().substring(0, x.getKey().indexOf(" "))))
                .filter(x->x.getValue()==2)
                .forEach(p-> System.out.println(p.getKey()));

    }


}
