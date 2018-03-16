class Calculator{
	public static void main(String args[]){
		int a;
		switch (args[1]){
			case "+" : 
			{
				a=Integer.parseInt(args[0])+Integer.parseInt(args[2]);
				System.out.println(a);
				break;
			}
			case "*" : 
			{
				a=Integer.parseInt(args[0]) * Integer.parseInt(args[2]);
				System.out.println(a);
				break;
			}
			case "-" : 
			{
				a=Integer.parseInt(args[0])-Integer.parseInt(args[2]);
				System.out.println(a);
				break;
			}
			case "/" : 
			{
				a=Integer.parseInt(args[0])/Integer.parseInt(args[2]);
				System.out.println(a);
				break;
			}
		}
	}
}
