import java.util.Scanner;
 class BankingSystem_1 {
    static Scanner sc = new Scanner(System.in);
    static double balance = 0;

    public static void main(String[] args) {
        int choice;

        do {
            System.out.println("\n1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check balance");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();

            if (choice == 1) {
                deposit();
            } else if (choice == 2) {
                withdraw();
            } else if (choice == 3) {
                checkBalance();
            } else if (choice == 4) {
                System.out.println("Thank you!");
            } else {
                System.out.println("Invalid choice.");
            }

        } while (choice != 4);
    }

    static void deposit() {
        System.out.print("Enter deposit amount: ");
        double amount = sc.nextDouble();

        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful.");
        } else {
            System.out.println("Invalid amount.");
        }
    }

    static void withdraw() {
        System.out.print("Enter withdrawal amount: ");
        double amount = sc.nextDouble();

        if (amount <= 0) {
            System.out.println("Invalid amount.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful.");
        }
    }

    static void checkBalance() {
        System.out.println("Current balance: " + balance);
    }
}