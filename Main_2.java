import java.util.Scanner;
class Main_2
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);
		
		Project sdsss = new Project();
        
		
		while(true)
		{	
			System.out.println("*********************");
			System.out.println("          ");
	
			System.out.println("STUDENT DETAIL");
			System.out.println("1. Student name");
			System.out.println("2. Student Age");
			System.out.println("3. Display Details");
			System.out.println("4. Exited");
			System.out.println("          ");
			System.out.print("ENTER THE CHOICE = ");
			
			int choice = sc.nextInt();
			
			switch(choice)
			{
				case 1:
				
				System.out.println("          ");
				System.out.println("*********************");
				System.out.println("                         ");
			
				System.out.print("ENTER THE STUDENT NAME = ");
				String name = sc1.nextLine();
				System.out.println("                         ");
			    System.out.println("*********************");
				System.out.println("                         ");
				
				
				sdsss.name = name;
				break;
				
				case 2:		
				
				System.out.println("          ");
				System.out.println("*********************");
				System.out.println("                         ");
					
				System.out.print("ENTER THE AGE = ");
				int age = sc.nextInt();
				System.out.println("                         ");
       			System.out.println("*********************");
				System.out.println("                         ");
				
				sdsss.age = age;
				break;
				
				case 3:
			
				sdsss.display(sdsss.name, sdsss.age);
				break;
				
				case 4:
				System.out.println("*********");
				System.out.println("                         ");
				
				System.out.println("THANK YOU");
				
				System.out.println("                         ");
				System.out.println("*********");
				
				return;
				
				default:
				System.out.println("INVALID CHOICE");
			}
		}
	}
}