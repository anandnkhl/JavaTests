import java.util.Scanner;

class Area1 {
	void Area (double r)
	{
		System.out.println(" " + 3.14*r*r);
	}
	void Area (int l, int b)
	{
		System.out.println(" " + l * b);
	}
}

class CalculateArea {
	public static void main(String arg[]){
		int n,r,l,b;
		Scanner s = new Scanner(System.in);
		Area1 a= new Area1();
		
		System.out.println("Press 1 for Circle | Press 2 for rectangle");
		n=s.nextInt();
		
		switch(n){
			case 1: 
			{
				System.out.println("Enter the radius:");
				r=s.nextInt();
				a.Area(r);
				break;
			}
			case 2: 
			{
				System.out.println("Enter the length and breadth:");
				l=s.nextInt();
				b=s.nextInt();
				a.Area(l,b);
				break;
			}
		}
	}
}