class Exp41 {
	private void privatemethod()
	{
		System.out.println("I am private method" );
	}
}

class test41 extends Exp41{
	
	public static void main(String args[]){
		
		System.out.println("I am sub class" );
			test41 obj = new test41();
			obj.privatemethod();
	}
}