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
-contructor is used to inizial the object each and every class they will be a no argument contructor.
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
-constructor special type of method but it is not having return type.
-constructor can not develop two constructor with the same type of argument.
-Default constructor is no argument constructor.
-In the default constructor their will no statement that is empty constructor.
-At the time of object ceration corsponding constructor will be executing.
-constructor can take any of argurment. 
note:-
object are created in a run time program.
object can have properties or as well as behaviours.

*/