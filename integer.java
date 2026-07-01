import java.util.Scanner;
class integer
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter FirstNumber :");
		int FirstNumber = sc.nextInt();
		System.out.print("Enter SecondNumber :");
		int SecondNumber = sc.nextInt();
		System.out.println("1. ADDITION");
		System.out.println("2. SUBRACTION");
		System.out.println("3. MULTIPLICATION");
		System.out.println("4. DIVISION");
		System.out.print("Enter The Operators :");
		int Operators = sc.nextInt();
		switch(Operators)
		{
			case 1:
		int	addTotal = FirstNumber+SecondNumber;
		System.out.print(addTotal);
		break;
			case 2:
        int subTotal = FirstNumber-SecondNumber;
		System.out.print(subTotal);
		break;
		     case 3:
		int muliTotal = FirstNumber*SecondNumber;
		System.out.print(muliTotal);
		break;
		     case 4:
		int divTotal = FirstNumber/SecondNumber;
		System.out.print(divTotal);
		break;
		
		
		
		
		
		
		
			
		}
        		
		
	}
}
 