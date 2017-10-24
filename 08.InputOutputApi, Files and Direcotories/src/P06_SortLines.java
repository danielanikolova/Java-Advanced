import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;


public class P06_SortLines {
    public static void main(String[] args) {


        Path input = Paths.get("C:\\Users\\danie\\Desktop\\08. Java-Advanced-Files-and-Streams-Lab-Resources\\input1.txt");
        Path output = Paths.get("C:\\Users\\danie\\Desktop\\08. Java-Advanced-Files-and-Streams-Lab-Resources\\newOutput6.txt");

        try {
            List<String> lines = Files.readAllLines(input);
            Collections.sort(lines);

            Files.write(output, lines);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
