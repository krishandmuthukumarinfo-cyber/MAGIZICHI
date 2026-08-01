
package interfc;

import java.util.Scanner;

class Main {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Payment Amount: ");
        double amount = sc.nextDouble();

        Payment p1 = (Payment) new CreditCardPayment();
        Payment p2 = new UPIPayment();

        System.out.println("\nUsing Credit Card:");
        p1.pay(amount);

        System.out.println("\nUsing UPI:");
        p2.pay(amount);

        sc.close();
    }
}    

