
import java.util.Scanner;

/**
 * Main class for the Student Grade Management System. This program allows users
 * to input information for three students, calculates their average grades,
 * determines pass/fail status, and displays the results in a formatted report.
 */
public class Main {

    /**
     * The main method that runs the Student Grade Management System.
     *
     * @param args command line arguments (not used)
     */
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Create an array to store 3 students
        Student[] students = new Student[3];

        // Display welcome message
        System.out.println("=== Student Grade Management System ===");

        // Input information for 3 students
        for (int i = 0; i < 3; i++) {
            System.out.println("\nEnter details for Student " + (i + 1) + ":");

            // Prompt for and read student name
            System.out.print("Enter name of student " + (i + 1) + ": ");
            String name = scanner.nextLine();

            // Prompt for and read student ID
            System.out.print("Enter ID: ");
            int id = scanner.nextInt();

            // Prompt for and read grades for three subjects
            System.out.print("Enter grade for subject 1: ");
            double grade1 = scanner.nextDouble();

            System.out.print("Enter grade for subject 2: ");
            double grade2 = scanner.nextDouble();

            System.out.print("Enter grade for subject 3: ");
            double grade3 = scanner.nextDouble();

            // Consume the newline character left in the buffer
            scanner.nextLine();

            // Create student object with the entered data
            Student student = new Student(name, id, grade1, grade2, grade3);

            // Display the student report immediately after entering data
            student.displayInfo();

            // Add the student to the array
            students[i] = student;
        }

        // Close the scanner to prevent resource leak
        scanner.close();
    }
}
