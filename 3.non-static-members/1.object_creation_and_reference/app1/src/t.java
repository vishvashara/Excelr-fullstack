class T
{
	int i;
	static T test()//t method return class  type is possiable.
	{
		T t1 = new T();
		//t1.i = 20;
		return t1;
	}
	public static void main(String[] args)
	{
		T obj = test();
		System.out.println(obj.i);
	}
}