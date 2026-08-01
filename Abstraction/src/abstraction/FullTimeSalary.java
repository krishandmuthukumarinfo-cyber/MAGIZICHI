package abstraction;

class FullTimeSalary extends Employee {

    long salary;
    
    @Override
    void calculateSalary() {
        
        System.out.print("ENTER YOUR SALARY = ");
        salary = sc.nextLong();
        
        System.out.println("                 ");
        System.out.println("FULL TIME SALARY = "+salary);
        
    }
          

    
}
