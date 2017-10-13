import java.util.Scanner;

public class P04_Factorial {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        int result =  calculateFactorial(num);

        System.out.println(result);

    }

    private static int calculateFactorial(int num) {

        if (num == 0){
            return 1;
        }

        return  num*(calculateFactorial(num-1));
    }


}
