package interfc;

class CreditCardPayment implements Payment {
 
    public void pay(double amount)
    {
        System.out.println("Credit Card Payment Successful");
        System.out.println("Amount Paid = ₹" + amount);
    }   
}
