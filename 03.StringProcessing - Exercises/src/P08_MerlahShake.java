import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class P08_MerlahShake {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder text = new StringBuilder(br.readLine());
        StringBuilder sequence = new StringBuilder(br.readLine());

        while (true){

            if (sequence.length()==0){
                System.out.println("No shake.");
                System.out.println(text);
                return;
            }

            int index1 = text.indexOf(sequence.toString());
            int index2 = text.lastIndexOf(sequence.toString());

            if (index1 == -1|| index2==-1||index1==index2){
                System.out.println("No shake.");
                System.out.println(text);
                return;
            }
            text.delete(index2, index2 + sequence.length());
            text.delete(index1, index1 + sequence.length());


            System.out.println("Shaked it.");
            sequence.deleteCharAt(sequence.length() / 2);


        }

    }

}
