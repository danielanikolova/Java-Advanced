import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class P10_GroupByGroup {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line = br.readLine();

        Map<String, Integer> resultList = new LinkedHashMap<>();

        while (!"END".equals(line)){

            String[]tokens = line.split("\\s+");
            String fullName = tokens[0] + " " + tokens[1];

            int group = Integer.parseInt(tokens[2]);


            resultList.put(fullName, group);

            line = br.readLine();
        }

        resultList.entrySet().stream()
                .collect(Collectors.groupingBy(x->x.getValue()
                        ,Collectors.toCollection(LinkedList::new)))
                .entrySet().stream().forEach(b->{
            System.out.print(b.getKey() + " - ");

            for (int i = 0; i < b.getValue().size(); i++) {
                if (i == b.getValue().size()-1){
                    System.out.print(b.getValue().get(i).getKey());
                }else System.out.print(b.getValue().get(i).getKey() + ", ");
            }
            System.out.println();

        });


    }
}
