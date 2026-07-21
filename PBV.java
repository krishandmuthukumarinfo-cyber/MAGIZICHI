class PBV
{
	public static void main(String[] args)
	{
		int a = 12;
		PBV obj = new PBV();
		obj.passValue(a);
		System.out.println(a);
	}
	
	public void passValue(int b)
	{
		b = 11;
		System.out.println(b);
	}
	
}