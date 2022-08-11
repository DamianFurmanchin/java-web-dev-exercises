package exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Chapter3ExercisesPart3 {
    public static void main(String[] args) {
        HashMap<String, Integer> classInfo = new HashMap<>();
        Scanner input = new Scanner(System.in);
        String newStudent;

        System.out.println("Enter your students (or ENTER to finish):");

        do {
            System.out.print("Student: ");
            newStudent = input.nextLine();

            if (!newStudent.equals("")) {
                System.out.print("ID number: ");
                Integer newID = input.nextInt();
                classInfo.put(newStudent, newID);
                input.nextLine();
            }

        } while(!newStudent.equals(""));

        input.close();

        System.out.println("\nClass roster:");

        for (Map.Entry<String, Integer> student : classInfo.entrySet()) {
            System.out.println(student.getValue() + "'s ID: " + student.getKey());
        }
        System.out.println("Number of students in roster: " + classInfo.size());
    }
}
