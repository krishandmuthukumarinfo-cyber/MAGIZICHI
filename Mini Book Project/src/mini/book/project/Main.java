package mini.book.project;

import java.util.Scanner;

class Main 
{
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);


        System.out.println("***************************");
        System.out.println("MINI BOOK FILE WELCOMES YOU");
        System.out.println("***************************");
        System.out.println("1. ADD A NEW BOOK");
        System.out.println("2. DISPLAY ALL BOOKS ");
        System.out.println("3. BORROW A BOOK");
        System.out.println("4. RETURN THE BOOK");
        System.out.println("5. EXIT");
        System.out.println("         ");
        System.out.println("ENTER THE CHOICE = ");
        int choice = sc.nextInt();
        
          MiniBookProject mbp ;
        
                  System.out.println("*****************");
                  System.out.println("ADD YOUR FAV BOOK");
                  System.out.println("*****************");
                  System.out.println("ENTER BOOK ID =");
                  int bookID_1 = sc.nextInt();

                  System.out.println("                ");
                  System.out.println("ENTER THE TITLE OF BOOK = ");
                  String title_1 = sc1.nextLine();

                  System.out.println("                     ");
                  System.out.println("ENTER THE AUTHOR NAME = ");
                  String author_1 = sc1.nextLine();

                  System.out.println("                 ");
                  boolean isAvailable_1 = true;

              mbp  = new MiniBookProject(bookID_1, title_1, author_1, isAvailable_1);                 

    }

}
