package bank;

public class Bank {
    
      static final String bankName = "ABC Bank";
      static final float interestRate = 7.5f;
    
    public static void main(String[] args)
    {
        Bank b = new Bank();
        
        Bank.calculateInterest(interestRate, 2);
       
        
    }
    
    public static void calculateInterest(double principal, int years)
    {
        principal = 10000;
        double interest = (principal * interestRate * years) / 100;
        System.out.println("BANK NAME = "+bankName);
        System.out.println("INTEREST RATE = "+interestRate);
        System.out.println("INTEREST = "+interest);
    }
}
