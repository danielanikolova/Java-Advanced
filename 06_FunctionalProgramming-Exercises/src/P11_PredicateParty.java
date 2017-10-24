import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.stream.Collectors;

public class P11_PredicateParty {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        List<String> guests = Arrays.stream( br.readLine().split(" "))
                .collect(Collectors.toList());


        String commandInput = br.readLine();

        while (!"Party!".equals(commandInput)){

            String[] tokens = commandInput.split(" ");

            String command = tokens[0];
            String secondCommand = tokens[1];

            List<String> resultList = new ArrayList<>();

            BiPredicate<String, String> validate = getPredicate(secondCommand,tokens[2] );

            switch (command){
                case "Double":

                    for (int i = 0; i < guests.size(); i++) {
                        if (validate.test(guests.get(i), tokens[2])){
                            resultList.add(guests.get(i));
                        }
                        resultList.add(guests.get(i));
                    }

                    guests = resultList;

                    break;
                case "Remove":

                    for (int i = 0; i < guests.size(); i++) {
                        if (validate.test(guests.get(i), tokens[2])){
                            guests.remove(i);
                            i--;
                        }
                    }
                    break;
            }

            commandInput = br.readLine();
        }
        if (guests.size()==0){
            System.out.println("Nobody is going to the party!");
        }else {

            for (int i = 0; i < guests.size(); i++) {
                if (i == guests.size() - 1) {
                    System.out.println(guests.get(i) + " are going to the party!");
                } else {
                    System.out.printf("%s, ", guests.get(i));
                }
            }
        }


    }

    private static BiPredicate<String, String> getPredicate(String secondCommand, String token) {
        switch (secondCommand){
            case "StartsWith":
                return (x, y)-> x.startsWith(y);
            case "EndsWith":
                return (x, y)-> x.endsWith(y);
            case "Length":
                int len = Integer.parseInt(token);
                return (x, y)-> x.length()==len;
            default:
                return null;
        }
    }


}
