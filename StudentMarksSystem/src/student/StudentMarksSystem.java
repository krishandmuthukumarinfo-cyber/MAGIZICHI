package student;

import java.util.Scanner;

public class StudentMarksSystem {
    
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int marks = -1;
        int choice;

        do {
            System.out.println("\n--- STUDENT MARKS SYSTEM ---");
            System.out.println("1. Enter Marks");
            System.out.println("2. Display Marks");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            try {

                switch (choice) {

                    case 1:
                        System.out.print("Enter marks (0-100): ");
                        int inputMarks = sc.nextInt();

                        if (inputMarks < 0 || inputMarks > 100) {
                            throw new IllegalArgumentException(
                                "Marks must be between 0 and 100"
                            );
                        }

                        marks = inputMarks;
                        System.out.println("Marks stored successfully.");
                        break;

                    case 2:
                        if (marks == -1) {
                            System.out.println("No marks entered.");
                        } else {
                            System.out.println("Student Marks: " + marks);
                        }
                        break;

                    case 3:
                        System.out.println("Exiting system.");
                        break;

                    default:
                        System.out.println("Invalid choice.");
                }

            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }

        } while (choice != 3);

        sc.close();
    }
    
}
