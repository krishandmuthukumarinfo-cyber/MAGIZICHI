import java.util.Scanner;
class Funtions
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ENTER THE NUMBER = ");
		int n = sc.nextInt();
	    
	    fibonnaci(n);
    }
	
	 static void fibonnaci(int n)
	{
		int a = 0;
		int b = 1;
		
    		System.out.println("                ");
			System.out.println("FIBONNACI SERIES");
			System.out.println("----------------");
			
		
		for(int i=0; i<n; i++)
		{
			System.out.println(a+" ");
			
			int next= a+b;
			a = b;
			b = next;
		}
			
	}
	
}