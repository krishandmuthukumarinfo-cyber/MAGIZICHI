class BubbleSorting
{
	public static void main(String [] args)
	{
		int arr[] = {5,1,4,2,8,3};
		
		BubbleSorting bs = new BubbleSorting();
		bs.bubbleSort(arr);
		
		System.out.println("SORTED ARRAY :");
		System.out.println("                          ");
		
		
		for(int k = 0 ; k < arr.length ; k++)
		{
			System.out.print(arr[k]+"");
		}
	}
	void bubbleSort(int arr[])
	{
		int passes = 0;
		
		for(int i = 0 ; i < arr.length ; i++)
		{
			for(int j = 0 ; j < arr.length-1 ; j++)
			{
				if(arr[j]>arr[j+1])
				{
				int temp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = temp;
				}
			}
			passes++;
		}
		
		System.out.println("                          ");
		System.out.println("NUMBER OF PASSES = "+passes);
		System.out.println("                          ");
		
	}
}