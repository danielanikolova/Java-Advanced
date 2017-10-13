import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Scanner;

public class P04_TruckTour {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int N = Integer.parseInt(scanner.nextLine());

        ArrayList<int[]> stations = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            String[] input = scanner.nextLine().split(" ");
            int amountPetrol = Integer.parseInt(input[0]);
            int distance = Integer.parseInt(input[1]);

            int[]station = new int[]{amountPetrol, distance};
            stations.add(station);
            
        }

        Deque<int[]> stationsQueue = new ArrayDeque<>();

        for (int[] stationPump : stations) {
            stationsQueue.add(stationPump);
        }

        int bestIndex = 0;

        for (int i = 0; i < N; i++) {

            int totalPetrol = 0;
            for (int[] stationPump : stationsQueue) {
                int currentPetrol = stationPump[0];
                int currentDistance = stationPump[1];
                int petrolDifference = currentPetrol - currentDistance;
                totalPetrol+=petrolDifference;
                if (totalPetrol<0){
                    break;

                }
            }

            if (totalPetrol>=0){
                bestIndex = i;
                break;
            }

            stationsQueue.add(stationsQueue.remove());
        }
        System.out.println(bestIndex);
    }
}
