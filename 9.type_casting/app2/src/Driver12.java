class Driver12
{
	static C test()
	{
		D d1=new D();
		return d1;
	}
	public static void main(String[] args) 
	{
		A a1 =test();
		System.out.println("Hello World! " +a1);
	}
}
