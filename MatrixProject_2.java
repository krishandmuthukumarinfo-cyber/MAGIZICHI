class MatrixProject_2
{
	public static void main(String [] args)
	{
		int matrix[][] = {{1,8,3},{4,2,6}};
        int largest = matrix[0][0];

        for(int i=0;i<matrix.length;i++)
		{
			for(int j=0;j<matrix[i].length;j++)
			{
				System.out.print(matrix[i][j]+" ");
				if(matrix[i][j]>largest)
				{
					largest=matrix[i][j];
				}
			}
			       System.out.println(" ");
		}			
			       System.out.println("                       ");
		         System.out.println("LARGEST NUMBER = "+largest);
	}
}