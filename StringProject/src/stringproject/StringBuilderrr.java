package stringproject;

import java.util.Scanner;

public class StringBuilderrr {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);  
            
        System.out.println("                  ");
        System.out.print("ENTER YOUR NAME = ");
      

        String name = sc.nextLine();
        
        System.out.println("                  ");
        System.out.print("ENTER YOUR DEPARMENT = ");

        String depar = sc.nextLine();

        System.out.println("                  ");
        System.out.print("ENTER YOUR AGE = ");
        int age = sc.nextInt();
        
                
        System.out.println("                  ");
        System.out.println("GENERATED.....");
        System.out.println("               ");
        
        
        System.out.println("********DISPLAY********");
        System.out.println("NAME : "+name);
        System.out.println("DEPARMENT : "+depar);
        System.out.println("AGE : "+age);
        System.out.println("***********************");
        System.out.println("                  ");

         StringBuilder code = new StringBuilder();

        code.append(name.substring(0, 3).toUpperCase());
        code.append("-");
        code.append(depar.substring(0, 3).toUpperCase());
        code.append("-");
        code.append(age);

        System.out.println("Generated Code: " + code);

        
    }
    
}
