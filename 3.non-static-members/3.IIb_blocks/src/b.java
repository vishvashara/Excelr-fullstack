class B 
{
	B()
	{
		System.out.println("B()");
	}
		//iib(Intance Initialization Block)
		//if there is a common implemention for all the objects then we can keep it in the IIB
	{ 			
		System.out.println("IIB");
	}
	public static void main(String[] args) 
	{
		B b1 =new B();
		System.out.println("------");
		B b2 =new B();
		System.out.println("------");
	}
}
/*
-Before constructor iib block will execute
-All iib block will executing once from top to bottom.
-Thier is no default iib block.
*/
