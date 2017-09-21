import java.util.Scanner;

public class P06_Greeting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstName = scanner.nextLine();
        String secondName = scanner.nextLine();

        if(firstName.isEmpty()){
            firstName = "*****";
        }
        System.out.println("Hello, " + firstName + " " +  secondName + "!");
    }
}
