class Driver9 
{
	public static void main(String[] args) 
	{
		A a1 =null;
		B b1 =null;
		C c1 =null;
		D d1 =null;
	    a1 =b1;//(A) b1
	    b1 =c1;//(B) c1
	    c1 =d1;//(C) d1
		Object o1=c1;
		System.out.println("Hello World!");
	}
}
