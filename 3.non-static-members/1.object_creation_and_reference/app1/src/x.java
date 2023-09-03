class X
{
	int i;
	static void test(X x1, X x2)
	{
		int i = x1.i;//tempery variable
		x1.i = x2.i;
		x2.i = i;
	}
	public static void main(String[] args)
	{
		X x1 = new X(), x2 = new X();
		x1.i = 10;
		x2.i = 20; 
		System.out.println(x1.i);
		System.out.println(x2.i);
		test(x1, x2); 
		System.out.println(x1.i);
		System.out.println(x2.i);
	}
}
//Q:-how can swap two no without using third variable?