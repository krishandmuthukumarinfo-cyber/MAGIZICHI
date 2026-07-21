class Delete
{
	public static void main(String[] args)
	{
		int ar[] = {10,20,30,40,50};
		int index = 4;
		
		
		int br[] = new int[ar.length-1];
		
		for(int i  = 0; i<index;i++)
		{
			br[i]=ar[i];
		}
		
		
		for(int i = index; i<br.length;i++)
		{
			br[i]=ar[i+1];
		}
		
		
		for(int i = 0; i<br.length;i++)
		{
			System.out.print(br[i]+",");
		}
	}
}