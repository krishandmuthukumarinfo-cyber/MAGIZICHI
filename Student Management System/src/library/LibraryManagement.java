
package library;

import java.util.ArrayList;
import java.util.Scanner;


    public class LibraryManagement {
    static ArrayList<Book> books = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    static Book findBook(int id) {
        for (Book b : books) {
            if (b.bookId == id) {
                return b;
            }
        }
        return null;
    }

    static void addBook() {
        System.out.print("Enter Book ID: ");
        int id = sc.nextInt();

        if (findBook(id) != null) {
            System.out.println("Book ID already exists!");
            return;
        }

        sc.nextLine();

        System.out.print("Enter Book Title: ");
        String title = sc.nextLine();

        System.out.print("Enter Author Name: ");
        String author = sc.nextLine();

        books.add(new Book(id, title, author));

        System.out.println("Book added successfully!");
    }

    static void viewBooks() {
        if (books.isEmpty()) {
            System.out.println("No books found.");
            return;
        }

        for (Book b : books) {
            b.display();
        }
    }

    static void searchBook() {
        System.out.print("Enter Book ID: ");
        int id = sc.nextInt();

        Book b = findBook(id);

        if (b != null) {
            b.display();
        } else {
            System.out.println("Book not found.");
        }
    }

    static void issueBook() {
        System.out.print("Enter Book ID: ");
        int id = sc.nextInt();

        Book b = findBook(id);

        if (b == null) {
            System.out.println("Book not found.");
        } else if (b.status.equals("Issued")) {
            System.out.println("Warning: Book is already issued!");
        } else {
            b.status = "Issued";
            System.out.println("Book issued successfully!");
        }
    }

    static void returnBook() {
        System.out.print("Enter Book ID: ");
        int id = sc.nextInt();

        Book b = findBook(id);

        if (b == null) {
            System.out.println("Book not found.");
        } else if (b.status.equals("Available")) {
            System.out.println("Warning: Book is already available!");
        } else {
            b.status = "Available";
            System.out.println("Book returned successfully!");
        }
    }

    static void deleteBook() {
        System.out.print("Enter Book ID: ");
        int id = sc.nextInt();

        Book b = findBook(id);

        if (b != null) {
            books.remove(b);
            System.out.println("Book deleted successfully!");
        } else {
            System.out.println("Book not found.");
        }
    }

    public static void main(String[] args) {

        while (true) {
            System.out.println("\n===== LIBRARY MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Book");
            System.out.println("2. View All Books");
            System.out.println("3. Search Book");
            System.out.println("4. Issue Book");
            System.out.println("5. Return Book");
            System.out.println("6. Delete Book");
            System.out.println("7. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    addBook();
                    break;

                case 2:
                    viewBooks();
                    break;

                case 3:
                    searchBook();
                    break;

                case 4:
                    issueBook();
                    break;

                case 5:
                    returnBook();
                    break;

                case 6:
                    deleteBook();
                    break;

                case 7:
                    System.out.println("Thank you!");
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
    



