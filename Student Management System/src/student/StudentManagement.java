package student;
 
import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagement {
    static ArrayList<Student> students = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    static boolean findRollNumber(int rollNumber) {
        for (Student s : students) {
            if (s.rollNumber == rollNumber) {
                return true;
            }
        }
        return false;
    }

    static void addStudent() {
        System.out.print("Enter Roll Number: ");
        int roll = sc.nextInt();

        if (findRollNumber(roll)) {
            System.out.println("Roll Number already exists!");
            return;
        }

        sc.nextLine();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Course: ");
        String course = sc.nextLine();

        System.out.print("Enter Marks: ");
        double marks = sc.nextDouble();

        students.add(new Student(roll, name, age, course, marks));
        System.out.println("Student added successfully!");
    }

    static void viewStudents() {
        if (students.isEmpty()) {
            System.out.println("No students found.");
            return;
        }

        for (Student s : students) {
            s.display();
        }
    }

    static void searchStudent() {
        System.out.print("Enter Roll Number: ");
        int roll = sc.nextInt();

        for (Student s : students) {
            if (s.rollNumber == roll) {
                s.display();
                return;
            }
        }

        System.out.println("Student not found.");
    }

    static void updateMarks() {
        System.out.print("Enter Roll Number: ");
        int roll = sc.nextInt();

        for (Student s : students) {
            if (s.rollNumber == roll) {
                System.out.print("Enter New Marks: ");
                s.marks = sc.nextDouble();
                System.out.println("Marks updated successfully!");
                return;
            }
        }

        System.out.println("Student not found.");
    }

    static void deleteStudent() {
        System.out.print("Enter Roll Number: ");
        int roll = sc.nextInt();

        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).rollNumber == roll) {
                students.remove(i);
                System.out.println("Student deleted successfully!");
                return;
            }
        }

        System.out.println("Student not found.");
    }

    public static void main(String[] args) {

        while (true) {
            System.out.println("\n===== STUDENT MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Marks");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    addStudent();
                    break;

                case 2:
                    viewStudents();
                    break;

                case 3:
                    searchStudent();
                    break;

                case 4:
                    updateMarks();
                    break;

                case 5:
                    deleteStudent();
                    break;

                case 6:
                    System.out.println("Thank you!");
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
    

