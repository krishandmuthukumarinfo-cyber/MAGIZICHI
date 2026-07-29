class Deopsit
{
	int balance = 1000;
	
	void depo(int amount)
	{
		balance = balance + amount;
		System.out.println("AMOUNT DEPOSITED ");
	}
}