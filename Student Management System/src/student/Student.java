
package student;
 import java.util.ArrayList;
import java.util.Scanner;

public class Student {

  

    int rollNumber;
    String name;
    int age;
    String course;
    double marks;

    Student(int rollNumber, String name, int age, String course, double marks) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.age = age;
        this.course = course;
        this.marks = marks;
    }

    void display() {
        System.out.println("Roll Number : " + rollNumber);
        System.out.println("Name        : " + name);
        System.out.println("Age         : " + age);
        System.out.println("Course      : " + course);
        System.out.println("Marks       : " + marks);
        System.out.println("-------------------------");
    }
}

    

