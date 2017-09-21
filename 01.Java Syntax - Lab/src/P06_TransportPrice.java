import java.util.Scanner;

public class P06_TransportPrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String travelTime = scanner.nextLine();
        Double priceKm = 0.0;
        Double totalPrice = 0.0;

        if(n<20){
           if (travelTime.equals("day")){
               priceKm = 0.79;

               totalPrice = getTotalPrice(priceKm, n ) + 0.70;
           }
           else if(travelTime.equals("night")){
               priceKm = 0.90;
               totalPrice = getTotalPrice(priceKm, n ) + 0.70;
           }
        }
        else if (n<100){

            priceKm = 0.09;
            totalPrice = getTotalPrice(priceKm, n );
        }
        else {
            priceKm = 0.06;
            totalPrice = getTotalPrice(priceKm, n );
        }

        System.out.printf("%.2f",totalPrice);
    }

    private static double getTotalPrice( Double priceKm, int distance){
        Double totalPrice = priceKm*distance;
        return totalPrice;
    }
}
