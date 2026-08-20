
package generics;

import java.util.Scanner;

public class GenericCalculator {
  
  
    public static void main(String[] args) 
{

        Scanner sc = new Scanner(System.in);

        Calculator<Integer> intCalc = new Calculator<>();
        Calculator<Double> doubleCalc = new Calculator<>();

        int choice;

        do {
            System.out.println("\n--- Generic Calculator ---");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("\n1. Integer");
                    System.out.println("2. Double");
                    System.out.print("Choose type: ");

                    int type = sc.nextInt();

                    if (type == 1) {
                        System.out.print("Enter first Integer: ");
                        int a = sc.nextInt();

                        System.out.print("Enter second Integer: ");
                        int b = sc.nextInt();

                        System.out.println("Result = " +
                                intCalc.add(a, b));

                    } else if (type == 2) {
                        System.out.print("Enter first Double: ");
                        double a = sc.nextDouble();

                        System.out.print("Enter second Double: ");
                        double b = sc.nextDouble();

                        System.out.println("Result = " +
                                doubleCalc.add(a, b));
                    }

                    break;

                case 2:
                    System.out.println("\n1. Integer");
                    System.out.println("2. Double");
                    System.out.print("Choose type: ");

                    type = sc.nextInt();

                    if (type == 1) {
                        System.out.print("Enter first Integer: ");
                        int a = sc.nextInt();

                        System.out.print("Enter second Integer: ");
                        int b = sc.nextInt();

                        System.out.println("Result = " +
                                intCalc.subtract(a, b));

                    } else if (type == 2) {
                        System.out.print("Enter first Double: ");
                        double a = sc.nextDouble();

                        System.out.print("Enter second Double: ");
                        double b = sc.nextDouble();

                        System.out.println("Result = " +
                                doubleCalc.subtract(a, b));
                    }

                    break;

                case 3:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 3);

        sc.close();
    }
}
    

