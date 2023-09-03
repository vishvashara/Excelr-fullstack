class A
{
	A()
	{
		System.out.println("from a()");
	}
	public static void main(String[] args) 
	{
		A a2= new A();
		System.out.println("done");
	}
}
/*
-contructor is used to inizal the object each and every class they will be a no argument contructor.
-this default contructor is kept by the compiler if and only if their is no contructor is available in class only,that is developer kept that constructor
-constructor name must be same as class name.
-constructor can take any no of arguments in one class we can keep any no of constructor.
-we can not develop dupilcate -we can not develop dupilcate constructor.
-constructor must not have any return type.
-constructor can have access spicifer.
-constructor are  treat as method internaly but constructor and method are not same.
-constructor are going to executed whenever we create create object.
-constructor must be having a body.
-constructors belong to non static.
-constructor 
*/