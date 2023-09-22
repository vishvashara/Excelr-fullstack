class Driver7 
{
	public static void main(String[] args) 
	{
		//A class is super class and B is sub class.
		//if you are supplying sub type to the super type then auto-upcasting will happen
		//type promotion
		//super class reference can hold sub-class object
		A a1 = new B();//a1(A) new B(); -->autoupcasting
		B b1 = new C();
		C c1 = new D();
		System.out.println("Hello World!");
	}
}
