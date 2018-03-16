////Experement 5.2//
interface A{
	public void meth1();
	public void meth2();
}

class MyClass implements A{
	public void meth1(){
		System.out.println("I am meth1");
	}
	public void meth2(){
		System.out.println("I am meth2");
	}
}

class test52{
	public static void main(String args[]){
		MyClass obj= new MyClass();
		obj.meth1();
		obj.meth2();
	}
}