class p
{
	int i;
	static void test(p obj)//obj=p1
	{
		System.out.println("test: " + obj.i);
	}	
	public static void main(String[] args)
	{
		p p1 = new p();
		System.out.println("main: " + p1.i);
		p1.i = 10;
		test(p1);
	}
}
/*
-
*/