//byte < short < int < long < float < double
class A
{
	public static void main(String[] args)
	{
		int i = 10;
		double d = (double)i;//auto-upcasting
		System.out.println(d);
		System.out.println(i);
		System.out.println("done");
	}
}
/*
1. converting from one datatype to another datatype
2.Their are two type os type casting
   i)primative type casting
   ii)reference type casting
3. we have 2 mechanism
   i)autocasting - done by compiler
   ii)explicity - done by programmer
*/