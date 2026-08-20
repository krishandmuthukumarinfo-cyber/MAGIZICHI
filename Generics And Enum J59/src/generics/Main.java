package generics;

    import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        Box<Integer> intBox = new Box<>();
        Box<String> stringBox = new Box<>();

        int choice;

        do {
            System.out.println("\n--- Generic Storage Box ---");
            System.out.println("1. Store Integer");
            System.out.println("2. Store String");
            System.out.println("3. Display Value");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter Integer: ");
                    int num = sc.nextInt();
                    intBox.store(num);
                    System.out.println("Integer stored successfully!");
                    break;

                case 2:
                    System.out.print("Enter String: ");
                    String text = sc.nextLine();
                    stringBox.store(text);
                    System.out.println("String stored successfully!");
                    break;

                case 3:
                    System.out.println("\nInteger Box:");
                    intBox.display();

                    System.out.println("String Box:");
                    stringBox.display();
                    break;

                case 4:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 4);

        sc.close();
    }

    private static class Box<T> {

        public Box() {
        }

        private void store(int num) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private void store(String text) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private void display() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }
}
    

