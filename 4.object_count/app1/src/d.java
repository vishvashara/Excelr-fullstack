class D 
{
	static int count;
	D()
	{
		count++;
	}
	public static void main(String[] args) 
	{
		D obj1 = new D();
		System.out.println("a: " + count);//1
		D obj2 = new D();
		System.out.println("b: " + count);//2
		D obj3 = new D();
		System.out.println("c: " + count);//3
		D obj4 = new D();
		System.out.println("d: " + count);//4
		D obj5 = new D();
		System.out.println("e: " + count);//5
		
		System.out.println("f: " + obj1.count);//5
		System.out.println("g: " + obj2.count);//5
		System.out.println("h: " + obj3.count);//5
		System.out.println("i: " + obj4.count);//5
		System.out.println("j: " + obj5.count);//5
	}
}
