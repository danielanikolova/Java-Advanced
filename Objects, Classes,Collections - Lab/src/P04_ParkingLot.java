import java.util.HashSet;
import java.util.Scanner;

public class P04_ParkingLot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        HashSet<String> result = new HashSet<>();

        while (!input.equals("END")){

            String [] tokens = input.split(",\\s+");
            if (tokens[0].equals("IN")){
                result.add(tokens[1]);
            }else if(tokens[0].equals("OUT")){
                result.remove(tokens[1]);
            }

            input = scanner.nextLine();
        }

        if (result.isEmpty()){
            System.out.println("Parking Lot is Empty");
        }else {

            for (String number:result) {
                System.out.println(number);
            }
        }
    }
}
