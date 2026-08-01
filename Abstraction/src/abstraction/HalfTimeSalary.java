
package abstraction;

class HalfTimeSalary extends Employee {

    @Override
    void calculateSalary() {
        
        
        System.out.println("            ");
        System.out.print("ENTER YOUR WORKING HOURS = ");
        int hour_worked = sc.nextInt();
        
        System.out.println("            ");
        System.out.print("ENTER HOURLY RATE = ");
        int hour_rate = sc.nextInt();
        
        double salary_1 = hour_worked*hour_rate;
        
        
         System.out.println("            ");
        System.out.print("PART TIME SALARY = "+salary_1);
    }

    
    
    
}
