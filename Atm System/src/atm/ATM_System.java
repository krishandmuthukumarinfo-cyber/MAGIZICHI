package atm;
import java.util.Scanner;


public class ATM_System {



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double balance = 5000;
        int choice;

        do {
            System.out.println("--- ATM MENU ---");
            System.out.println("1. Withdraw Money");
            System.out.println("2. Check Balance");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            try {
                switch (choice) {

                    case 1:
                        System.out.print("Enter withdrawal amount: ");
                        double amount = sc.nextDouble();

                        if (amount > balance) {
                            throw new ArithmeticException("Insufficient Balance");
                        }

                        balance = balance - amount;
                        System.out.println("Withdrawal successful.");
                        System.out.println("Remaining balance: " + balance);
                        break;

                    case 2:
                        System.out.println("Current balance: " + balance);
                        break;

                    case 3:
                        System.out.println("Thank you for using ATM.");
                        break;

                    default:
                        System.out.println("Invalid choice.");
                }

            } catch (ArithmeticException e) {
                System.out.println("Error: " + e.getMessage());
            }

        } while (choice != 3);

        sc.close();
    }
}
    

