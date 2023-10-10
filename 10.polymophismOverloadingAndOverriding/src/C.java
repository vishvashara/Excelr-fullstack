class C
{
	//Method overriding
	void test1()
	{
		System.out.println("from test1.C");
	}
}

class D extends C
{
	void test1()
	{
		System.out.println("from test1.D");
	}
	public static void main(String[] args) 
	{
		D d1 = new D();
		d1.test1();
		C c1 = new D();
		c1.test1();
	}
}
/*
1. Method overriding refer to the run time polymophism.
2. In case of overriding method name must be same and argument must be same.
3. Access specifier can be same or wider.
4. Method overriding is not possible in same class.
5. For Method overriding compulsory used inheritance.
6.In case of method overriding return type must be same.
*/