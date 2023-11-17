import java.util.Scanner;

public class GradeManager {

    // A constant array of units
    private static final String[] UNITS = {"Java", "HCI", "Application Programming", "Network", "Cabling"};

    // A constant variable for the number of units
    private static final int UNIT_COUNT = UNITS.length;

    // A method to get the user input for marks
    private static int[] getMarks() {
        // Create a scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Create an array to store the marks
        int[] marks = new int[UNIT_COUNT];

        // Loop through the units and prompt the user for marks
        for (int i = 0; i < UNIT_COUNT; i++) {
            System.out.println("Enter the mark for " + UNITS[i] + ":");
            marks[i] = scanner.nextInt();
        }

        // Close the scanner
        scanner.close();

        // Return the marks array
        return marks;
    }

    // A method to compute the average of an array of marks
    private static double computeAverage(int[] marks) {
        // Create a variable to store the sum of marks
        int sum = 0;

        // Loop through the marks and add them to the sum
        for (int mark : marks) {
            sum += mark;
        }

        // Compute and return the average
        return (double) sum / UNIT_COUNT;
    }

    // A method to display the grades on the console screen using control structures
    private static void displayGrades(int[] marks, double average) {
        // Print a header
        System.out.println("Unit\tMark\tGrade");

        // Loop through the units and marks and print them with the corresponding grade
        for (int i = 0; i < UNIT_COUNT; i++) {
            System.out.print(UNITS[i] + "\t" + marks[i] + "\t");

            // Use an if-else statement to determine the grade based on the mark
            if (marks[i] >= 90) {
                System.out.println("A");
            } else if (marks[i] >= 80) {
                System.out.println("B");
            } else if (marks[i] >= 70) {
                System.out.println("C");
            } else if (marks[i] >= 60) {
                System.out.println("D");
            } else {
                System.out.println("F");
            }
        }

        // Print the average and the overall grade
        System.out.println("Average\t" + average + "\t" + getGrade(average));
    }

    // A helper method to get the grade based on the average
    private static String getGrade(double average) {
        // Use an if-else statement to determine the grade based on the average
        if (average >= 90) {
            return "A";
        } else if (average >= 80) {
            return "B";
        } else if (average >= 70) {
            return "C";
        } else if (average >= 60) {
            return "D";
        } else {
            return "F";
        }
    }

    // The main method
    public static void main(String[] args) {
        // Get the marks from the user
        int[] marks = getMarks();

        // Compute the average
        double average = computeAverage(marks);

        // Display the grades
        displayGrades(marks, average);
    }
}
