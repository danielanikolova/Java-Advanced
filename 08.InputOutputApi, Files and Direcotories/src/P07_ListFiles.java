import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class P07_ListFiles {
    public static void main(String[] args) {

        String path = "C:\\Users\\danie\\Desktop\\08. Java-Advanced-Files-and-Streams-Lab-Resources\\Files-and-Streams";
        Path outputPath = Paths.get("C:\\Users\\danie\\Desktop\\08. Java-Advanced-Files-and-Streams-Lab-Resources\\newOutput7.txt");

        File file = new File(path);

        List<String> lines = new ArrayList<>();

        if (file.isDirectory()) {
            File[] files = file.listFiles();

            for (File f : files) {
                if (!f.isDirectory()) {
                    lines.add(String.format("%s: %s", f.getName(), f.length()));
                    System.out.printf("%s: %s%n", f.getName(), f.length());
                }
            }
        }
        try {
            Files.write(outputPath, lines);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
