class A 
{
	//method overloading 
	void test1()
	{
		System.out.println("from test1");
	}
	int test1(int i)
	{
		System.out.println("from test1(int)");
		return 0;
	}
	boolean test1(int i, int j)
	{
		System.out.println("from test1(int,int)");
		return false;
	}

	public static void main(String[] args) 
	{
		A a1 = new A();
		System.out.println(a1.test1());
		System.out.println(a1.test1(90));
		System.out.println(a1.test1(90, 100));
		System.out.println("done");
	}
}
/*
1. Method overloading is a compile time polymophism. 
2. I case of method overloading must be same argument must be different.
3. In case of  Method overloading access specifier may be same or different.
4. In case of  Method overloading return type different.
5. Gerenaly we are achieving in same class but overloading is poissible sub class also.
6. In case of  Method overloading can be static. 
*/