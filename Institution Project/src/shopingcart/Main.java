package shopingcart;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ShoppingCart cart = new ShoppingCart();

        ShoppingCart.Item item = cart.new Item();

        Scanner sc = new Scanner(System.in);

        int choice;

        do {

            System.out.println("\n**********************");
            System.out.println("    SHOPPING CART");
            System.out.println("**********************");

            System.out.println("1. Add Item");
            System.out.println("2. Update Price History");
            System.out.println("3. Calculate Total Bill");
            System.out.println("4. Display Cart Details");
            System.out.println("5. Exit");

            System.out.print("ENTER YOUR CHOICE = ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:

                    sc.nextLine();

                    System.out.print("Enter Cart Owner Name: ");
                    cart.cartOwnerName = sc.nextLine();

                    System.out.print("Enter Item Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Quantity: ");
                    int quantity = sc.nextInt();

                    item.addItem(name, quantity);

                    System.out.println("Item Added Successfully!");

                    break;


                case 2:

                    System.out.print("Enter Number of Price Updates: ");
                    int size = sc.nextInt();

                    item.priceHistory = new double[size];

                    System.out.println("\nEnter Prices:");

                    for (int i = 0; i < size; i++) {

                        System.out.print("Price " + (i + 1) + ": ");
                        item.priceHistory[i] = sc.nextDouble();
                    }

                    System.out.println("Price History Updated!");

                    break;


                case 3:

                    if (item.priceHistory == null) {
                        System.out.println("Please add price history first!");
                        break;
                    }

                    item.calculateTotalBill();

                    break;


                case 4:

                    if (item.priceHistory == null) {
                        System.out.println("Please add item and price history first!");
                        break;
                    }

                    item.calculateTotalBill();
                    item.display();

                    break;


                case 5:

                    System.out.println("Thank You!");
                    System.out.println("Program Exited.");

                    break;


                default:

                    System.out.println("Invalid Choice!");

            }

        } while (choice != 5);

        sc.close();
    }
}