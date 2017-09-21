import java.util.ArrayList;
import java.util.Scanner;

public class P12_Vehicle_Parc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] vehicles = scanner.nextLine().split("\\s+");
        ArrayList<String> vehiclePark = new ArrayList<>();

        for (String vehicle:vehicles) {
            vehiclePark.add(vehicle);
        }

        String command = scanner.nextLine();
        int countSoldVehicles = 0;

        while (!command.equals("End of customers!")){
            String[] commandInfo = command.split(" ");
            String carInfo = (commandInfo[0].charAt(0) + commandInfo[2]).toLowerCase();

            if (vehiclePark.contains(carInfo)){
                int price = carInfo.charAt(0)*Integer.parseInt(commandInfo[2]);
                System.out.printf("Yes, sold for %d$%n", price);
                vehiclePark.remove(carInfo);
                countSoldVehicles++;
            }else {
                System.out.println("No");
            }

            command = scanner.nextLine();
        }

        String leftCars = String.join(", ", vehiclePark);
        System.out.printf("Vehicles left: %s%n",leftCars);
        System.out.printf("Vehicles sold: %d", countSoldVehicles);


    }
}
