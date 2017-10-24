import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.HashSet;


public class P02_WriteToFile {
    public static void main(String[] args) {

        String path = "C:\\Users\\danie\\Desktop\\08. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";

        String outputPath = "C:\\Users\\danie\\Desktop\\08. Java-Advanced-Files-and-Streams-Lab-Resources\\output.txt";

        try (FileInputStream fis = new FileInputStream(path);
             FileOutputStream fos = new FileOutputStream(outputPath)){

            HashSet<Character>chars = new HashSet<>();
            Collections.addAll(chars, ',', '.', '!', '?');

            int oneByte = fis.read();

            while (oneByte>=0){
                if (!chars.contains((char)oneByte)){
                    fos.write(oneByte);
                }
                oneByte = fis.read();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
