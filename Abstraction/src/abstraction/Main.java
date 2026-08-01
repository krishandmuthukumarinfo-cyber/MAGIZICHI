package abstraction;

class Main {
    
    public static void main(String[] args) {
        
        
        FullTimeSalary fts = new FullTimeSalary();
       
        fts.name_1();
        fts.displayName();
        fts.calculateSalary();
        
        HalfTimeSalary hts = new HalfTimeSalary();
      
       
        hts.calculateSalary();
        
        
    }
    
}
