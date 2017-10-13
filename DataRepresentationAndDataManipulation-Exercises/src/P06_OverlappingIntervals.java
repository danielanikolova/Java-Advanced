import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class P06_OverlappingIntervals {
    private static boolean result = false;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        List<String> intervals = new ArrayList<>();
        for (int i = 0; i <n ; i++) {
            intervals.add(br.readLine());

        }


        int position = 0;
        int index = 0;
        compare(position,index, intervals);

        System.out.println(result);

    }

    private static void compare(int position ,int index, List<String> intervals) {
        if (position == intervals.size()-1){
            return;
        }

        compareElements(position,index,intervals);

        position++;
        index=0;
        compare(position, index, intervals);


    }

    private static void compareElements(int position, int index, List<String> intervals) {
        if (index==intervals.size()){
            return;
        }
        if (position==index){
            index++;
            compareElements(position, index, intervals);
        }else {

            int[] firstPair = Arrays.stream(intervals.get(position).split(","))
                    .mapToInt(Integer::parseInt).toArray();
            int[] secondPair = Arrays.stream(intervals.get(index).split(","))
                    .mapToInt(Integer::parseInt).toArray();

            int a = firstPair[0];
            int b = firstPair[1];
            int c = secondPair[0];
            int d = secondPair[1];

            if (a <= c && c <= b || a >= c && c >= b || a <= d && d <= b || a >= d && d >= b
                    || c <= a && a <= d || c >= a && a >= d || c <= b && b <= d || c >= b && b >= d) {

                result = true;
            }
            index++;
            compareElements(position, index, intervals);
        }
    }
}
