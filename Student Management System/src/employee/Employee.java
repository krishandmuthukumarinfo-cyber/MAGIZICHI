package employee;
import java.util.ArrayList;
import java.util.Scanner;

public class Employee {
    
    

    int employeeId;
    String employeeName;
    String department;
    double basicSalary;
    int employeId;

    Employee(int employeeId, String employeeName,
             String department, double basicSalary) {

        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.department = department;
        this.basicSalary = basicSalary;
    }

    double calculateNetSalary() {
        double hra = basicSalary * 0.20;
        double da = basicSalary * 0.10;
        double pf = basicSalary * 0.05;

        return basicSalary + hra + da - pf;
    }

    void display() {
        System.out.println("Employee ID   : " + employeeId);
        System.out.println("Employee Name : " + employeeName);
        System.out.println("Department    : " + department);
        System.out.println("Basic Salary  : " + basicSalary);
        System.out.println("Net Salary    : " + calculateNetSalary());
        System.out.println("-----------------------------");
    }
}

