import java.util.Scanner;

class Greatest
 {
	public static void main(String args[])
	{
	int a,b,c;
	Scanner s= new Scanner(System.in);
	System.out.println("Enter value of a");
	a= s.nextInt();
	System.out.println("Enter value of b");
	b= s.nextInt();
	System.out.println("Enter value of c");
	c= s.nextInt();

	if(a>b && a>c)
	{System.out.println("Greatest value is a = "+ a);}
	else if(b>c)
	{System.out.println("Greatest value is b = "+ b);}
	else
	{System.out.println("Greatest value is c = "+ c);}
	}
}