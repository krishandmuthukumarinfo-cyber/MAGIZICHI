class LinearRecursion
{
	public static void main(String args [])
	{
	    int arr[] = {10,20,30,40,50};
		int target = 30;
		
		int res = linearRec(arr,0,target);
		
		if(res != -1)
		{
			System.out.println("ELEMENT FOUND IN THE INDEX :"+res);
		}
		else
		{
			System.out.println("SORRY ELEMENT NOT FOUND");
		}
		
		
		
	}
	static int linearRec(int arr[],int index,int target)
	{
		if(index == arr.length)
		{
			return -1;
		}
		
		if(arr[index] == target)
		{
			return index+1;
		}
		
		return linearRec(arr,index+1,target);
	}	
}