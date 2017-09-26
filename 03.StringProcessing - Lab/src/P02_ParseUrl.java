import java.util.Scanner;

public class P02_ParseUrl {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String input = scanner.nextLine();

        String protocol = null;
        String server = null;
        String resources = null;

        String[] tokens = input.split("://");
        if (tokens.length !=2){
            System.out.println("Invalid URL");
            return;
        }else {
            protocol = tokens[0];
           int firstIndexOdDash = tokens[1].indexOf('/');
           server = tokens[1].substring(0, firstIndexOdDash);
           resources = tokens[1].substring(firstIndexOdDash+1, tokens[1].length());
            System.out.printf("Protocol = %s\n", protocol);
            System.out.printf("Server = %s\n", server);
            System.out.printf("Resources = %s\n", resources);

        }



    }


}
