package employee;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeePayRoll {
    
   
    static ArrayList<Employee> employees = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    static Employee findEmployee(int id) {
        for (Employee e : employees) {
            if (e.employeeId == id) {
                return e;
            }
        }
        return null;
    }

    static void addEmployee() {
        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();

        if (findEmployee(id) != null) {
            System.out.println("Employee ID already exists!");
            return;
        }

        sc.nextLine();

        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Department: ");
        String department = sc.nextLine();

        System.out.print("Enter Basic Salary: ");
        double salary = sc.nextDouble();

        employees.add(new Employee(id, name, department, salary));

        System.out.println("Employee added successfully!");
    }

    static void viewEmployees() {
        if (employees.isEmpty()) {
            System.out.println("No employees found.");
            return;
        }

        for (Employee e : employees) {
            e.display();
        }
    }

    static void searchEmployee() {
        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();

        Employee e = findEmployee(id);

        if (e != null) {
            e.display();
        } else {
            System.out.println("Employee not found.");
        }
    }

    static void updateSalary() {
        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();

        Employee e = findEmployee(id);

        if (e != null) {
            System.out.print("Enter New Basic Salary: ");
            e.basicSalary = sc.nextDouble();

            System.out.println("Salary updated successfully!");
        } else {
            System.out.println("Employee not found.");
        }
    }

    static void calculateSalary() {
        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();

        Employee e = findEmployee(id);

        if (e != null) {
            double hra = e.basicSalary * 0.20;
            double da = e.basicSalary * 0.10;
            double pf = e.basicSalary * 0.05;
            double netSalary = e.calculateNetSalary();

            System.out.println("Basic Salary : " + e.basicSalary);
            System.out.println("HRA (20%)    : " + hra);
            System.out.println("DA (10%)     : " + da);
            System.out.println("PF (5%)      : " + pf);
            System.out.println("Net Salary   : " + netSalary);
        } else {
            System.out.println("Employee not found.");
        }
    }

    static void deleteEmployee() {
        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();

        Employee e = findEmployee(id);

        if (e != null) {
            employees.remove(e);
            System.out.println("Employee deleted successfully!");
        } else {
            System.out.println("Employee not found.");
        }
    }

    public static void main(String[] args) {

        while (true) {
            System.out.println("\n===== EMPLOYEE PAYROLL SYSTEM =====");
            System.out.println("1. Add Employee");
            System.out.println("2. View All Employees");
            System.out.println("3. Search Employee");
            System.out.println("4. Update Basic Salary");
            System.out.println("5. Calculate Net Salary");
            System.out.println("6. Delete Employee");
            System.out.println("7. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    addEmployee();
                    break;

                case 2:
                    viewEmployees();
                    break;

                case 3:
                    searchEmployee();
                    break;

                case 4:
                    updateSalary();
                    break;

                case 5:
                    calculateSalary();
                    break;

                case 6:
                    deleteEmployee();
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
    


    

