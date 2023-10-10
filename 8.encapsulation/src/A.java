class A
{
	//data members/ variables

	private int id;

	private String name;

	private int age;

	//getter methods
	public int getId()
	{
		return this.id;
	}
	public String getName()
	{
		return this.name;
	}
	public int getAge()
	{
		return this.age;
	}

	//setter methods
	public void setId(int i)
	{
		this.id = i;
	}
	public void setName(String str)
	{
		this.name = str;
	}
	public void setAge(int j)
	{
		this.age = j;
	}
}
class B 
{
	public static void main(String[] args)
	{
		A a1 = new A();
		a1.setId(1);
		a1.setName("vijay");
		a1.setAge(90);
		System.out.println(a1.getId());
		System.out.println(a1.getName());
		System.out.println(a1.getAge());
	}
}

/*
1. Encapsulation in Java is a process of wrapping code and data together 
into a single unit, for example, a capsule which is mixed of several medicines.
2. We can create a fully encapsulated class in Java by making all the data 
   members of the class private.
3. By providing only a setter or getter method, you can make the class read-only
   or write-only. In other words, you can skip the getter or setter methods.
4. It provides you the control over the data. Suppose you want to set the value 
   of id which should be greater than 100 only, you can write the logic inside the setter method.
   You can write the logic not to store the negative numbers in the setter methods.
5. It is a way to achieve data hiding in Java because other class will not be able 
   to access the data through the private data members.
*/
//myself
/*
1. Encapsulation in java is a process of Wrapping of a code and data together in the single class are called Encapsulation.
2. We are achiving security .
3. No one can direct access of data member.
4. By making data class as a private.
5. By using only getter and setter can access the private class,getter and setter must be public.
6. Encapsulation we can control over a data.
*/