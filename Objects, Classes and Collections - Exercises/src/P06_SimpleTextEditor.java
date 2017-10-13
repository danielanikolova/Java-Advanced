import java.util.*;

public class P06_SimpleTextEditor {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Deque<Character> text = new ArrayDeque<>();

        int N =Integer.parseInt( scanner.nextLine());
        Deque<String[]> executedCommands = new ArrayDeque<>();
        Deque<Character>erasedChars = new ArrayDeque<>();

        for (int i = 1; i <= N; i++) {
            String[] input = scanner.nextLine().split("\\s+");
            int command = Integer.parseInt(input[0]);

            switch (command){
                case 1:
                    char[] charsToAppend = input[1].toCharArray();
                    for (int j = 0; j < charsToAppend.length; j++) {
                        text.push(charsToAppend[j]);
                    }
                    executedCommands.push(input);

                    break;
                case 2:
                    int eraseCount = Integer.parseInt(input[1]);

                    for (int j = 0; j < eraseCount; j++) {
                        erasedChars.push(text.poll());
                    }

                    executedCommands.push(input);
                    break;
                case 3:

                    int charToPrint = Integer.parseInt(input[1]);
                    String[] currentText = text.toString().split("\\[|, |\\]", -1);

                    System.out.println(currentText[currentText.length - 1 - charToPrint]);


                    break;
                case 4:
                    String[]previousCommand = executedCommands.poll();
                    String commandType = previousCommand[0];
                    switch (commandType){
                        case "1":
                            for (int j = 0; j < previousCommand[1].length(); j++) {
                                text.poll();
                            }
                            break;
                        case "2":
                            int count = Integer.parseInt(previousCommand[1]);

                            for (int j = 0; j < count; j++) {
                                text.push(erasedChars.poll());
                            }
                    }

                    break;
            }

        }

    }
}
