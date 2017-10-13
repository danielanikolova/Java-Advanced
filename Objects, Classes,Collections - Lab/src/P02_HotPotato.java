import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.stream.Collectors;

public class P02_HotPotato {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] names = br.readLine().split("\\s+");
        int number = Integer.parseInt(br.readLine());

        ArrayDeque<String> queue = new ArrayDeque<>();

        Collections.addAll(queue, names);


        while (queue.size()>1){
            for (int i = 1; i < number; i++) {
                String firstChild = queue.poll();
                queue.offer(firstChild);
            }


            System.out.println("Removed " + queue.poll());
        }
        System.out.printf("Last is %s", queue.poll());
    }

}
