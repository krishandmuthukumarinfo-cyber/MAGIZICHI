import java.util.Scanner;
class ArrayScanner
{
	public static void main(String [] args)
	{
		//SCANNER IN ARRAY
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ENTER THE ARRAY SIZE = ");
		int size = sc.nextInt();
		
		int[] nums = new int[size];
		int total = 0;
		int max = 0;
		int min = 0;
		for(int i=0; i<size; i++)
		{
			System.out.print("ENTER THE"+(i+1)+"INDEX VALUE :");
		    nums[i] = sc.nextInt(); 
			total+=nums[i];
		}
		System.out.println("TOTAL = "+total);
		
		
		for(int i=0;i<size; i++)
		{
			if(max>nums[i])
			{
				System.out.println(" THE MAX VALUE ="+max);
				max = nums[i];
			}
			else if(min<nums[i])
			{
				System.out.println("THE MINIMUM VALUE ="+min);
				min = nums[i];
			}
		}
		
		
		
	}
}