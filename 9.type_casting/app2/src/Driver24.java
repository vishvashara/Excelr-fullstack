class Driver24 
{
	public static void main(String[] args) 
	{
		A a1  = new B();
		System.out.println(a1 instanceof A);
		System.out.println(a1 instanceof B);
		System.out.println(a1 instanceof C);
		System.out.println(a1 instanceof D);
	}
}
/*
interview que 
what is the purpose of instanceof?
ans-instanceof is a opertor as well as intanceof is an keyword also.
2. intance is an object only
*/