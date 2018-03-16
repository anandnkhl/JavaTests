//Experement 5.4//
interface InterfaceClass54{
	public void modules(int a, int b);
	public void division(int c, int d);
}

class class54 implements InterfaceClass54{
	public void modules(int a, int b){
		a=10;
		b=2;
		int x=a%b;
		System.out.println(x);
	}
	public void division(int c, int d){
		c=10;
		d=2;
		int y=c/d;
		System.out.println(y);
	}
}

class test54 extends class54{
	public void modules(int a, int b){
		int x=a+b;
		System.out.println(x);
		}
		public void division(int c, int d){
		int y=c-d;
		System.out.println(y);
		}
	public static void main(String args[]){
		test54 obj= new test54();
		obj.modules(10,2);
		obj.division(10,2);
	}
}