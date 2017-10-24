import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class P05_FilterStudentsByEmailDomain {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        List<String> inputList = new ArrayList<>();

        String input = br.readLine();

        while (!"END".equals(input)){
            inputList.add(input);

            input = br.readLine();

        }

        inputList.stream()
                .filter(x->x.substring(x.indexOf("@"), x.length()).equals("@gmail.com"))
                .forEach(p-> {
                    String[]tokens = p.split("\\s+");
                    String name = tokens[0] + " " + tokens[1];
                    System.out.println(name);
                        }

                );

    }
}
