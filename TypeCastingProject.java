class TypeCastingProject
{
	public static void main(String [] args)
	{
		//1. IMPLICIT CONVERSION
		System.out.println("***********");
        int num = 25;
        double num1 = num;
		System.out.println(num1);		
		System.out.println("***********");

		//2. CHAR TO INT CONVERSION
		char a = 'B';
		int b = a;
		System.out.println(b);
		System.out.println("***********");

		//3. DOUBLE TO INT CONVERSION
		double x = 45.89;
		int y = (int)x;
		System.out.println(y);
		System.out.println("***********");
   		
		//4. INT TO BYTE CONVERSION
		int k = 130;
		byte l = (byte)k;
		System.out.println(l);
		System.out.println("***********");
	}
}