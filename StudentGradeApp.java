import java.util.Scanner;

public class StudentGradeApp {
    public static void main(String[] args) {
        // Create an array of 1 students
        StudentGrade[] students = new StudentGrade[1];
        // Enter grade info using keyboard
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < students.length; i++) {
            students[i] = new StudentGrade();
            System.out.println("Enter student name " + (i + 1) + ":");
            students[i].name = sc.nextLine();
 System.out.println("Enter ID of student " + (i + 1) + ":");
            students[i].id = sc.nextLine();
            System.out.println("Enter java grade of student " + (i + 1) + ":");
            students[i].javagrade = sc.nextDouble();
            System.out.println("Enter operating system grade of student " + (i + 1) + ":");
            students[i].OSgrade = sc.nextDouble();
            System.out.println("Enter Finance grade of student " + (i + 1) + ":");
            students[i].Financegrade = sc.nextDouble();
            sc.nextLine(); // consume the newline character
 }
        // Display a menu with options
        int choice;
        do {
            System.out.println("Menu:");
            System.out.println("1. View coursework result");
            System.out.println("2. View exam result");
            System.out.println("3. Exit the program");
            System.out.println("Enter your choice:");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    // View coursework result
                    System.out.println("Enter the ID of the student you want to view:");
 String id = sc.next();
                    for (StudentGrade student : students) {
                        if (student.id.equals(id)) {
                            student.printCourseworkResult();
                            break;
                        }
                    }
                    break;
                case 2:
                    // View exam result
                    System.out.println("Enter the ID of the student you want to view:");
                    id = sc.next();
 for (StudentGrade student : students) {
                        if (student.id.equals(id)) {
                            student.printExamResult();
                            break;
                        }
                    }
                    break;
                case 3:
                    // Exit the program
                    System.out.println("Thank you for using the program. Goodbye!");
                    break;
                default:
                    // Invalid choice
    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 3);
        sc.close();
    }
}

class StudentGrade {
    String name;
    String id;
    double javagrade;
    double OSgrade;
 double Financegrade;

    public void printInfo() {
        System.out.println("Name = " + name);
        System.out.println("ID = " + id);
        System.out.println("java = " + javagrade);
        System.out.println("operating system = " + OSgrade);
        System.out.println("Finance = " + Financegrade);
        System.out.println("Average = " + average());
    }

    public double average() {
        return ((javagrade + OSgrade + Financegrade) / 3);
    }
 public char grade() {
        if (average() >= 80) {
            return 'A';
        } else if (average() >= 60 && average() < 80) {
            return 'B';
        } else if (average() >= 40 && average() < 60) {
            return 'C';
        } else {
            return 'D';
        }
    }

    public void printCourseworkResult() {
 System.out.println("Coursework result of " + name + " (" + id + "):");
        System.out.println("java = " + javagrade);
        System.out.println("operating system = " + OSgrade);
        System.out.println("Finance = " + Financegrade);
    }

    public void printExamResult() {
        System.out.println("Exam result of " + name + " (" + id + "):");
        System.out.println("Average = " + average());
        System.out.println("Grade = " + grade());
    }
}