import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.TreeMap;

public class P06_AcademyGraduation {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int studentsCount = Integer.parseInt(scanner.nextLine());

        TreeMap<String, Double> students = new TreeMap<>();

        for (int i = 0; i < studentsCount; i++) {
            String name = scanner.nextLine();
            String[] grades = scanner.nextLine().split(" ");

            double gradesSum = 0;

            for (String grade : grades) {
                gradesSum += Double.parseDouble(grade);
            }

            double averageGrade = gradesSum / grades.length;
            students.put(name, averageGrade);
        }

        for (String student : students.keySet()) {
            System.out.println(student + " is graduated with " + students.get(student));
        }


    }
}
