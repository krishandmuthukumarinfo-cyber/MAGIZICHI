import java.util.Scanner;
 class StudentMarksSystem {
    static Scanner sc = new Scanner(System.in);
    static int[] marks;
    static int n;

    public static void main(String[] args) {
        int choice;

        do {
            System.out.println("\n1. Enter marks");
            System.out.println("2. Calculate total");
            System.out.println("3. Calculate average");
            System.out.println("4. Find grade");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();

            if (choice == 1) {
                getMarks();
            } else if (choice == 2) {
                System.out.println("Total = " + total());
            } else if (choice == 3) {
                System.out.println("Average = " + average());
            } else if (choice == 4) {
                System.out.println("Grade = " + grade());
            } else if (choice == 5) {
                System.out.println("Exited.");
            } else {
                System.out.println("Invalid choice.");
            }

        } while (choice != 5);
    }

    static void getMarks() {
        System.out.print("Enter number of subjects: ");
        n = sc.nextInt();
        marks = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
        }
    }

    static int total() {
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += marks[i];
        }

        return sum;
    }

    static double average() {
        return (double) total() / n;
    }

    static String grade() {
        double avg = average();

        if (avg >= 90)
            return "A";
        else if (avg >= 75)
            return "B";
        else if (avg >= 60)
            return "C";
        else if (avg >= 40)
            return "D";
        else
            return "F";
    }
}