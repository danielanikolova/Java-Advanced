import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class P05_WriteEveryThirdLine {
    public static void main(String[] args) {

        String input = "C:\\Users\\danie\\Desktop\\08. Java-Advanced-Files-and-Streams-Lab-Resources\\input1.txt";
        String output = "C:\\Users\\danie\\Desktop\\08. Java-Advanced-Files-and-Streams-Lab-Resources\\newOutput.txt";


        try {
            try (BufferedReader reader = new BufferedReader(new FileReader(input));
                 PrintWriter writer = new PrintWriter(output)) {

                String line = reader.readLine();
                int counter = 1;

                while (line != null) {
                    if (counter % 3 == 0) {
                        writer.println(line);
                    }

                    line = reader.readLine();
                    counter++;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
