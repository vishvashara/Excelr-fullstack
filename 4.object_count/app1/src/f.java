class F 
{
	static int count;
	F()
	{
		count++;
	}
	F(int i)
	{
		count++;
	}
	F(int i, int j)
	{
		count++;
	}
	//
	//common code that we suppose to keep in every constructor body
	{
		count++;
	}
	public static void main(String[] args) 
	{
		F e1 = new F();//2
		F e2 = new F(10);//4
		F e3 = new F(10, 20);//6
		F e4 = new F(20);//8
		F e5 = new F();//10
		System.out.println(count);
	}
}
