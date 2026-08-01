package abstraction;

import java.util.Scanner;

abstract class Employee 
{
   
Scanner sc = new Scanner(System.in);

String name;

void name_1()
{
    System.out.print("ENTER YOUR NAME = ");
    name = sc.nextLine();
}

abstract void calculateSalary();

   void displayName()
   {
       System.out.println("                ");
       System.out.println("EMPLOYEE NAME IS "+name);
       
   }
   
   
}
