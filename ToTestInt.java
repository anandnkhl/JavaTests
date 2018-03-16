//Experement 5.1//
interface test{
	public int square(int a);
}

class ArithmaticClass implements test{
	public int square(int n)
	{
		int c=n*n;
		return c;
	}
}
	
class ToTestInt{
	public static void main(String args[])
	{
		ArithmaticClass a= new ArithmaticClass();
		System.out.println(a.square(5));
	}
}