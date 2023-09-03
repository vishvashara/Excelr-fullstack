class a 
{
	public static void main(String[] args) 
	{
		System.out.println("from main");
	}
	public static void test() 
	{
		System.out.println("from test");
	}
}
/*
-By using method we can execute a set of statement any no. of times.
-each time we can able to supply different values for a method.
-we can execute a set of statement any no. of times. and in each time all the statements which are in the method will be executed.
-main is also a method which is the starting point of the program.
-jvm will start the execution from the main method.
-jvm will be always searching for public static void main(String[] args) declaration.
-main method is also called as an entry point of a java program.
-we can keep any no. of statement-
-to call the static method we dont have to create object for that class.
-main method also is a static method.that means there is no need for jvm to create an object in order to call the main.
-if we dont keep any access specifier for a user created method,method ,compiler only adding  "default" access specifier at time of compilation.
-method name must be vaild identifier.
-if method name is more than two words follow the camel case.

*/