public class B
{
	public static void main(String[] args)
	{
		int[] x = new int[3];
		//default values
		System.out.println(x[0]);
		System.out.println(x[1]);
		System.out.println(x[2]);
		x[0] = 10;
		x[1] = 20;
		x[2] = 30;
		//recently assigned values
		System.out.println(x.length);
		System.out.println(x[0]);//10
		System.out.println(x[1]);//20
		System.out.println(x[2]);//30
	}
}
/*
1. An array is an indexed collection of fixed number of homogenious data elements.
2. We can use an array to represent a group of values of same the type.
3. Onces we create an array we cant resize it. it is fixed.
4. Array are also objects in java.
5. Array has indexes  and index will starting from 0
6. We can develop any dimentional array with the help of rows and columns.
7. Array elements must be of the same type .different type not possible.
8. To create array object int array type x is a reference are passing new object with the size3
*/