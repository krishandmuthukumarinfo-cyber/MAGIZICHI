class BankAccount 
{
    int balance = 1000;

    void deposit(int amount)
	{
        balance = balance + amount;
        System.out.println("Amount Deposited");
    }

    void withdraw(int amount) 
	{
        if (amount <= balance)
		{
            balance = balance - amount;
            System.out.println("Amount Withdrawn");
        }
		else 
		{
            System.out.println("Insufficient Balance");
        }
    }

    void display() 
	{
			System.out.println("Balance = " + balance);
    }
}
