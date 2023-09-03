class f 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		test1();
		System.out.println("----------");
		test1();
		System.out.println("main end");

	}
	public static void test1()
	{
		System.out.println("from test1");
		System.out.println("from test1");
		System.out.println("from test1");
	}
}
/*
mehtod execution will be following the stack opertion.
-variable and method are process inside stack merory.
we can call a method any no.of items.
*/
