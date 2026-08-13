package student;
import java.util.Scanner;


public class StudentLoginSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String correctUsername = "admin";
        String correctPassword = "1234";

        int attempts = 0;
        boolean loggedIn = false;
        int choice;

        do {
            System.out.println("\n--- LOGIN SYSTEM ---");
            System.out.println("1. Login");
            System.out.println("2. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {

                if (attempts >= 3) {
                    System.out.println("Account is locked.");
                    continue;
                }

                System.out.print("Enter username: ");
                String username = sc.nextLine();

                System.out.print("Enter password: ");
                String password = sc.nextLine();

                if (username.equals(correctUsername)
                        && password.equals(correctPassword)) {

                    System.out.println("Login successful!");
                    loggedIn = true;

                } else {

                    attempts++;

                    int remaining = 3 - attempts;

                    System.out.println("Incorrect username or password.");

                    if (remaining > 0) {
                        System.out.println("Remaining attempts: " + remaining);
                    } else {
                        System.out.println("Account locked!");
                    }
                }

            } else if (choice == 2) {
                System.out.println("Exiting system.");

            } else {
                System.out.println("Invalid choice.");
            }

        } while (choice != 2 && !loggedIn);

        sc.close();
    }
}

    

