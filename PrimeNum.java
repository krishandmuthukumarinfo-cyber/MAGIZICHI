import java.util.Scanner;
class PrimeNum
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ENTER A NUM = ");
		int n = sc.nextInt();
		
		if(prime(n))
		{
			System.out.println(n+" is prime num");
		}
		else
		{
			System.out.println(n+" is not prime num");
		}
	}	
		
		static boolean prime(int n)
		{
			if(n<=1)
			{
				return false;
			}
			for (int i=2;i<n;i++)
			{
				 if (n%i==0)
				 {
					 return false;
				 }
			}
				 return true;
		}
	
}