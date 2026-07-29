class WithDraw
{
	
    void withdraw(int amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Amount withdrawn");
        } else {
            System.out.println("Insufficient Balance");
        }
    }

}