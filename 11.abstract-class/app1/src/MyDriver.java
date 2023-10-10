abstract class  MyDriver 
{
	void howTodrive()
	{
		System.out.println("I got a licence , & know how to drive");
	}
	abstract void technicalThings();
}
class Car extends MyDriver
{
	void technicalThings()
	{
		System.out.println("Technical things");
	}
	public static void main(String[] args) 
	{
		Car c1=new Car();
		c1.howToDrive();
		c1.technicalThings();
		System.out.println("Hello World!");
	}
}
