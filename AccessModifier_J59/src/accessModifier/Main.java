package accessModifier;

import java.util.Scanner;

 class Main {
     
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         Scanner sc1 = new Scanner(System.in);
         
         Student std = new Student();
         int choice;
         
         do
         {
                System.out.println("STUDENT MANAGEMENT SYSTEM");
                System.out.println("1. ADD STUDENT DETAILS");
                System.out.println("2. DISPLAY STUDENT DETAILS");
                System.out.println("3. EXIT");
                System.out.println("                           ");
                System.out.print("ENTER YOUR CHOICE = ");
                choice = sc.nextInt();

                switch(choice)
                {
                    case 1:
                        System.out.print("ENTER YOUR ID = ");
                        int id = sc.nextInt();

                        System.out.print("ENTER YOUR NAME = ");
                        String name = sc1.nextLine();

                        System.out.print("ENTER YOUR AGE = ");
                        int age = sc.nextInt();

                        std.student(name, id, age);
                        break;

                    case 2:
                        std.displayStudent();
                        break;

                    case 3:
                        System.out.println("EXITED...THANK YOU....");
                        break;
                    default :
                        System.out.println("INVALID CHOICE....");
                        return;
                }
         }
         
         while(choice != 3);
     }
    
}
