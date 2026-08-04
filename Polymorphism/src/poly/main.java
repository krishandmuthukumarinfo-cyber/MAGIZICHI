
package poly;

import java.util.Scanner;

class TransportManagementSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Transport transport = null;

        int choice;

        do {
            System.out.println("\n---- TRANSPORT MANAGEMENT SYSTEM ----");
            System.out.println("1. City Bus Booking");
            System.out.println("2. Luxury Bus Booking");
            System.out.println("3. Calculate Fare");
            System.out.println("4. Display Ticket");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                case 2:

                    System.out.print("Enter Passenger ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Passenger Name: ");
                    String name = sc.nextLine();

                    System.out.println("\nSelect Route:");
                    System.out.println("1. Chennai -> Bangalore");
                    System.out.println("2. Chennai -> Coimbatore");
                    System.out.println("3. Chennai -> Madurai");
                    System.out.println("4. Chennai -> Trichy");
                    System.out.println("5. Chennai -> Salem");
                    System.out.print("Enter Route Choice: ");

                    int route = sc.nextInt();

                    String from = "Chennai";
                    String to = "";
                    double distance = 0;

                    switch (route) {
                        case 1:
                            to = "Bangalore";
                            distance = 350;
                            break;
                        case 2:
                            to = "Coimbatore";
                            distance = 500;
                            break;
                        case 3:
                            to = "Madurai";
                            distance = 460;
                            break;
                        case 4:
                            to = "Trichy";
                            distance = 330;
                            break;
                        case 5:
                            to = "Salem";
                            distance = 340;
                            break;
                        default:
                            System.out.println("Invalid Route!");
                            continue;
                    }

                    if (choice == 1) {
                        transport = new CityBus(id, name, from, to, distance);
                    } else {
                        transport = new LuxuryBus(id, name, from, to, distance);
                    }

                    System.out.println("Ticket Booked Successfully");
                    break;

                case 3:

                    if (transport != null) {
                        transport.calculateFare();   // Runtime Polymorphism
                        System.out.println("Fare Calculated Successfully");
                    } else {
                        System.out.println("Please book a ticket first.");
                    }

                    break;

                case 4:

                    if (transport != null) {
                        transport.displayTicket();
                    } else {
                        System.out.println("No Ticket Available.");
                    }

                    break;

                case 5:
                    System.out.println("Thank You! Visit Again.");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 5);

        sc.close();
    }
}