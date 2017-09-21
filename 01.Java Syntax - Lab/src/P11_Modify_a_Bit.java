import java.util.Scanner;

public class P11_Modify_a_Bit {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int p = scanner.nextInt();
        int v = scanner.nextInt();

        int mask = 1<<p;
        int result;

        if (v == 0){
            result = n | mask;
        }else {
            result = n | mask;
        }

        System.out.println(result);
    }
}
