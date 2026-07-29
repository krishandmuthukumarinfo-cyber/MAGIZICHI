import java.util.Scanner;
class Main_1 
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);

        BankAccount amount = new BankAccount();

        System.out.println("BANKING SYSTEM");
        System.out.println("1. DEPOSIT");
        System.out.println("2. WITHDRAW");
        System.out.println("3. DISPLAY BALANCE");
        System.out.println("4. EXIT");
        System.out.print("ENTER THE CHOICE = ");

        int choice = sc.nextInt();

        switch (choice)
		{
            case 1:
                System.out.print("ENTER THE DEPOSIT AMOUNT = ");
                int depositAmount = sc.nextInt();
                amount.deposit(depositAmount);
                amount.display();
                break;

            case 2:
                System.out.print("ENTER THE WITHDRAW AMOUNT = ");
                int withdrawAmount = sc.nextInt();
                amount.withdraw(withdrawAmount);
                amount.display();
                break;

            case 3:
                amount.display();
                break;

            case 4:
                System.out.println("EXITED... THANK YOU... :)");
                break;

            default:
                System.out.println("INVALID CHOICE");
        }
    }
}