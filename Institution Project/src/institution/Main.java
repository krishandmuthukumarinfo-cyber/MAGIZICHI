package institution;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Institution in = new Institution();

        Institution.Student ins = in.new Student();

        Scanner sc = new Scanner(System.in);

        int choice;

        do {

            System.out.println("**********************");
            System.out.println(" STUDENTS DETAIL/MARK ");
            System.out.println("**********************");

            System.out.println("1. Add Student");
            System.out.println("2. Add Marks");
            System.out.println("3. Calculate Grade");
            System.out.println("4. Display Student Details");
            System.out.println("5. Exit");

            System.out.print("ENTER YOUR CHOICE = ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:

                    sc.nextLine();

                    System.out.print("ENTER YOUR NAME = ");
                    String name = sc.nextLine();

                    System.out.print("ENTER YOUR ROLL NUMBER = ");
                    int roll = sc.nextInt();

                    System.out.print("ENTER THE NUMBER OF SUBJECT = ");
                    int size = sc.nextInt();

                    ins.addStudent(name, roll);

                    // Creating array dynamically
                    ins.mark = new int[size];

                    System.out.println("Student Added Successfully!");

                    break;


                case 2:

                    if (ins.mark == null) {
                        System.out.println("Please Add Student First!");
                        break;
                    }

                    System.out.println("\nENTER THE SUBJECT MARKS:");

                    for (int i = 0; i < ins.mark.length; i++) {

                        System.out.print(
                            "ENTER SUBJECT MARK [" + (i + 1) + "] = "
                        );

                        ins.mark[i] = sc.nextInt();
                    }

                    System.out.println("Marks Added Successfully!");

                    break;


                case 3:

                    if (ins.mark == null) {
                        System.out.println("Please Add Student First!");
                        break;
                    }

                    ins.calculateGrade();

                    System.out.println("**********************");
                    System.out.println(" RESULT");
                    System.out.println("**********************");

                    System.out.println("Average = " + ins.average);
                    System.out.println("Grade   = " + ins.grade);

                    break;


                case 4:

                    if (ins.mark == null) {
                        System.out.println("Please Add Student First!");
                        break;
                    }

                    ins.display();

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