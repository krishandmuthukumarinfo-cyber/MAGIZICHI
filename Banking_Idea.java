import java.util.Scanner;
class Banking_Idea
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("==========================");
		System.out.println("Bank Loan Eligibily System");
		System.out.println("==========================");
		
		System.out.print("ENTER YOUR NAME = ");
        String name = sc.nextLine();

		System.out.print("ENTER YOUR AGE = ");
		byte age = sc.nextByte();
		
		System.out.print("ENTER MONTHLY SALARY = ");
		long salary = sc.nextLong();
		
		System.out.print("ENTER CIBIL SCORE = ");
		int score = sc.nextInt();
		
		System.out.print("ARE YOU AN EXISTING CUSTOMER? TRUE/FALSE : ");
		boolean customer = sc.nextBoolean();
		
		//NESTED IF 
		if(age>=21)
		{
			if(salary>=20000)
			{
				if(score>=750)
				{
					if(customer)
					{
						System.out.print("ELIGIBILITY FOR PREMIUM LOAN");
					
					}
				}
			}
		}				
		else 
		    {
				System.out.println("NOT ELIGIBILITY FOR PREMIUM LOAN");
			}
			
		//if else if ladder
		if((score>=650) && (score<=749))
		{
			System.out.println("ELIGIBLE FOR LOW AMOUNT LOAN");
		}
		else if(score<650)
		{
			System.out.println("Not Eligible (Low CIBIL Score)");
		}
		else if(salary<20000)
		{
			System.out.println("Not Eligible (Low Salary)");
		}
		else if(age<21)
		{
			System.out.println("Not Eligible (Age criteria not satisfied)");
		}
		else
		{
			System.out.println("SORRY BETTER LUCK NEXT TIME ...");
		}
		
		
		
		
		
	}
}