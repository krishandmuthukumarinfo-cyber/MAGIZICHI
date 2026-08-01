package interfc;

class UPIPayment implements Payment
{
    public void pay(double amount)
    {
        System.out.println("UPI Payment Successful");
        System.out.println("Amount Paid = ₹" + amount);
    }
}

    

