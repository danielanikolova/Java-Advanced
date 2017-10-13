import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class P09_PhoneNumbers {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String line = br.readLine();

        while (!line.equals("END")){
            sb.append(line);
            line = br.readLine();
        }
            Pattern pattern = Pattern.compile("([A-Z][A-Za-z]*)[^0-9A-Za-z+]*([+]?[0-9]+[0-9\\- \\.\\/\\)\\(]*[0-9]+)");

        LinkedHashMap<String, String> resultList = new LinkedHashMap<>();
        
        Matcher matcher = pattern.matcher(sb.toString());


            while (matcher.find()) {

                String name = matcher.group(1);
                String number = matcher.group(2);

                String[] tempNumber = number.split("[\\(\\)\\,\\s\\/\\.\\-]");

                String resultNumber = "";

                for (int i = 0; i < tempNumber.length; i++) {
                    resultNumber+=tempNumber[i];
                }
                
                resultList.put(name, resultNumber);

            }



        if (resultList.isEmpty()){
            System.out.println("<p>No matches!</p>");
        }else {
            System.out.print("<ol>");
            for (Map.Entry<String, String> entry:resultList.entrySet()) {
                System.out.printf("<li><b>%s:</b> %s</li>", entry.getKey(), entry.getValue());
            }
            System.out.print("</ol>");
        }

    }
}
