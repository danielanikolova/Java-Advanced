import java.util.Scanner;

public class P11_Game_Of_Names {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        String winner = null;
        int winnerPoints = Integer.MIN_VALUE;

        for (int i = 0; i < n ; i++) {
            String name = scanner.nextLine();
            int scoreFromName =0;
            for (int j = 0; j < name.length(); j++) {
                if (name.charAt(j)%2 ==0 ){
                    scoreFromName+= name.charAt(j);
                }
                else {
                    scoreFromName-= name.charAt(j);
                }
            }
            int totalScore = Integer.parseInt(scanner.nextLine()) + scoreFromName;
            if (totalScore>winnerPoints){
                winner = name;
                winnerPoints = totalScore;
            }
        }
        System.out.printf("The winner is %s - %d points", winner, winnerPoints);



    }
}
