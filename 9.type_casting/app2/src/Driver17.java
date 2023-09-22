class Driver17 
{
	static C test()
	{
		A a1 = new D();
		return a1;//we can not send super type to sub type C.
	}
	public static void main(String[] args) 
	{
		D d1=test();
		System.out.println("Hello World!");
	}
}
