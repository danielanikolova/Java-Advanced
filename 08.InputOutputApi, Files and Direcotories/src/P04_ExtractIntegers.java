import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class P04_ExtractIntegers {

    public static void main(String[] args) {
        String inputPath = "C:\\Users\\danie\\Desktop\\08. Java-Advanced-Files-and-Streams-Lab-Resources\\input1.txt";
        String outputPath = "C:\\Users\\danie\\Desktop\\08. Java-Advanced-Files-and-Streams-Lab-Resources\\newOutput.txt";

        try (Scanner scanner = new Scanner(new FileInputStream(inputPath));
             PrintWriter writer = new PrintWriter(outputPath)) {
            while (scanner.hasNext()) {
                if (scanner.hasNextInt()) {
                    writer.println(scanner.nextInt());
                }

                scanner.next();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
