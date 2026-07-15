class MatrixProject_1
{
	public static void main(String [] args)
	{
		int matrix1[][] = {{1,2},{3,4}};
		int matrix2[][] = {{5,6},{7,8}};
		int matrix3[][] = new int[2][2];
		
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				matrix3[i][j]=matrix1[i][j]+matrix2[i][j];
				System.out.print(matrix3[i][j]+" ");
			}
			System.out.println();
		}
	}
}