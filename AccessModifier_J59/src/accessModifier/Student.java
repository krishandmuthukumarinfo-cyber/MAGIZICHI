package accessModifier;

import java.util.Scanner;

class Student
{
    Scanner sc = new Scanner(System.in);
    
    private String name;
    private int id;
    private  int age;
    
    public void student(String name, int id, int age)
    {
    this.age = age;
    this.id = id;
    this.name = name;
    }
    
    
    public void displayStudent()
    {
        System.out.println("-----STUDENT DETAILS-----");
        System.out.println("ID = "+id);
        System.out.println("AGE = "+age);
        System.out.println("NAME = "+name);
    }
    
    
    
}
