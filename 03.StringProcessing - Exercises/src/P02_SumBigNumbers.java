import java.util.Scanner;

public class P02_SumBigNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        String firstNum = scanner.nextLine();
        String secondNum = scanner.nextLine();
        int numToAdd =0;
        int sum;

        int n;
        if (firstNum.length()>=secondNum.length()){
            n = firstNum.length();


        }else{
            n = secondNum.length();
          }

        int first;
        int second;

        for (int i = 0; i < n; i++) {

           if (i >= firstNum.length()){
               first =0;
               second = Integer.parseInt(String.valueOf(secondNum.charAt(secondNum.length()-1-i)));
           }else if (i >= secondNum.length()){
               first = Integer.parseInt(String.valueOf(firstNum.charAt(firstNum.length()-1-i)));
               second = 0;
           }else {
               second = Integer.parseInt(String.valueOf(secondNum.charAt(secondNum.length()-1-i)));
               first = Integer.parseInt(String.valueOf(firstNum.charAt(firstNum.length()-1-i)));
           }

           if ((first+second +numToAdd) >=10){
               sum = (first+second+numToAdd)%10;
               numToAdd = ((first+second+numToAdd)/10)%10;
           }else {
               sum = first+second+numToAdd;
               numToAdd=0;
           }

           sb.append(String.valueOf(sum));

        }
        if (numToAdd!=0){
            sb.append(String.valueOf(numToAdd));

        }

        StringBuilder result = sb.reverse();

        while (sb.charAt(0)=='0'){
            sb.deleteCharAt(0);
        }

        System.out.println(result);

    }
}
