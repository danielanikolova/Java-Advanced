import java.util.*;

public class P05_SoftUniParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        TreeSet<String>reservationList = new TreeSet<>();

        LinkedHashSet <String>  vipGuests = new LinkedHashSet<>();

        LinkedHashSet<String> regularGuests = new LinkedHashSet<>();

        List<String> nums = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            nums.add( String.valueOf(i));
        }

        while (!input.equals("PARTY")){

            reservationList.add(input);
            input = scanner.nextLine();
        }
        input = scanner.nextLine();

        while (!input.equals("END")){
            String sign  = Character.toString(input.charAt(0));

            if (nums.contains(sign)){
                vipGuests.add(input);
                reservationList.remove(input);
            }else {
                regularGuests.add(input);
                reservationList.remove(input);
            }
            input = scanner.nextLine();
        }


        System.out.println(reservationList.size());

        if (!reservationList.isEmpty()){
            for (String name:reservationList) {
                System.out.println(name);
            }
        }


    }
}
