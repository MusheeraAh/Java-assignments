/**
 * Represents a student with grades for three subjects.
 * This class provides methods to calculate average grade, 
 * determine pass/fail status, and display student information.
 */
public class Student {
    // Private instance variables to store student information
    private String name;
    private int id;
    private double grade1;
    private double grade2;
    private double grade3;

    /**
     * Constructs a new Student with the specified details.
     *
     * @param name   the student's name
     * @param id     the student's ID
     * @param grade1 the grade for subject 1
     * @param grade2 the grade for subject 2
     * @param grade3 the grade for subject 3
     */
    public Student(String name, int id, double grade1, double grade2, double grade3) {
        this.name = name;
        this.id = id;
        this.grade1 = grade1;
        this.grade2 = grade2;
        this.grade3 = grade3;
    }

    /**
     * Calculates and returns the average of the three grades.
     *
     * @return the average grade as a double value
     */
    public double calculateAverage() {
        return (grade1 + grade2 + grade3) / 3.0;
    }

    /**
     * Determines if the student has passed based on their average grade.
     * A student passes if their average grade is 50 or higher.
     *
     * @return true if the student passed, false otherwise
     */
    public boolean isPassed() {
        return calculateAverage() >= 50;
    }

    /**
     * Displays the student's information in a formatted report.
     * The report includes name, ID, average grade, and pass/fail status.
     */
    public void displayInfo() {
        // Calculate average and determine pass/fail status
        double average = calculateAverage();
        String status = isPassed() ? "Passed" : "Failed";
        
        // Display student information in a formatted way
        System.out.println("\n--- Student Report ---");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.printf("Average: %.2f\n", average);
        System.out.println("Result: " + status);
        System.out.println("----------------------\n");
    }

    // Getter methods for all attributes
    
    /**
     * Returns the student's name.
     *
     * @return the student's name
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the student's ID.
     *
     * @return the student's ID
     */
    public int getId() {
        return id;
    }

    /**
     * Returns the grade for subject 1.
     *
     * @return the grade for subject 1
     */
    public double getGrade1() {
        return grade1;
    }

    /**
     * Returns the grade for subject 2.
     *
     * @return the grade for subject 2
     */
    public double getGrade2() {
        return grade2;
    }

    /**
     * Returns the grade for subject 3.
     *
     * @return the grade for subject 3
     */
    public double getGrade3() {
        return grade3;
    }
}