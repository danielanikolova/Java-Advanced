import java.util.*;

public class P13_HandsOfCards {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        LinkedHashMap<String, HashSet<String>>resultList = new LinkedHashMap<>();

        while (!input.equals("JOKER")){

            String [] tokens = input.split(": ");

            String name = tokens[0];
            HashSet<String>cards = new HashSet<>();
            cards.addAll(Arrays.asList( tokens[1].split(", ")));

            if (!resultList.containsKey(name)){
                resultList.put(name, cards);
            }else {
                resultList.get(name).addAll(cards);
            }

            input = scanner.nextLine();
        }

        LinkedHashMap<String, Integer> scores = new LinkedHashMap<>();

        for (String player:resultList.keySet()) {
            int score = 0;

            for (String card:resultList.get(player)) {

                char power = card.charAt(0);
                char type = card.charAt(card.length()-1);

                score += getCardPower(power)*getCardType(type);
            }

            scores.put(player, score);
        }


        for (String player:scores.keySet()) {

            System.out.printf("%s: %d\n", player, scores.get(player));

        }

    }

    private static int getCardType(char type) {
        int result = 0;

        switch (type){
            case 'S':
                result = 4;
                break;
            case 'H':
                result = 3;
                break;
            case 'D':
                result = 2;
                break;
            case 'C':
                result = 1;
                break;

        }
        return result;
    }

    private static int getCardPower(char power) {

       int result = 0;

       switch (power){
           case '2':
           case '3':
           case '4':
           case '5':
           case '6':
           case '7':
           case '8':
           case '9':
               result += Integer.parseInt(String.valueOf(power));
               break;
           case '1':
               result += 10;
               break;
           case 'J':
               result += 11;
               break;
           case 'Q':
               result += 12;
               break;
           case 'K':
               result += 13;
               break;
           case 'A':
               result += 14;
               break;
       }


       return result;
    }
}
