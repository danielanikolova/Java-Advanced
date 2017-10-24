import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class P03_CopyBytes {
    public static void main(String[] args) {

        String input = "C:\\Users\\danie\\Desktop\\08. Java-Advanced-Files-and-Streams-Lab-Resources\\input1.txt";
        String output = "C:\\Users\\danie\\Desktop\\08. Java-Advanced-Files-and-Streams-Lab-Resources\\newOutput.txt";

        try (
                FileInputStream fis = new FileInputStream(input);
                FileOutputStream fos = new FileOutputStream(output);

        ){
            int oneByte = fis.read();

            while (oneByte>=0){
                if (oneByte == 10 || oneByte == 32){
                    fos.write(oneByte);
                }else {
                    String digit = String.valueOf(oneByte);
                    for (int i = 0; i < digit.length(); i++) {
                        fos.write(digit.charAt(i));
                    }
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
