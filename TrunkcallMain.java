import java.util.*;
class TrunkCall {
	void charges(int min) {
		System.out.println("Total time caller takes : "+ min + " minutes");  
	} 
}
class TrunkCallOrdinary extends TrunkCall  {
	void charges(int min) {
		System.out.println("charges for ordinary trunk call are :"+(100*min));  }  }
class TrunkCallUrgent extends TrunkCall  {
	void charges(int min) {
		System.out.println("charges for urgent trunk call are :"+(200*min));  
	} 	
}
class TrunkCallLightning extends TrunkCall {
	void charges(int min) {
		System.out.println("charges for lightning trunk call are :"+(300*min));  
	} 
}
class TrunkcallMain extends TrunkCall  {
	public static void main(String args[])  {
		Scanner s=new Scanner(System.in);
		System.out.println("Charges as per the type of call : ");
		System.out.println("100 for ordinary trunkcall per minute \n"+"200 for urgent trunkcall per minute \n"+"300 for lightning trunkcall per minute \n");
		System.out.println("Enter the no of min caller takes : ");
		int min=s.nextInt();
		TrunkCall ob=new TrunkCall();
		ob.charges(min);
		TrunkCall ob1=new TrunkCallOrdinary();
		ob1.charges(min);
		TrunkCall ob2=new TrunkCallUrgent();
		ob2.charges(min);
		TrunkCall ob3=new TrunkCallLightning();
		ob3.charges(min);  
	} 
}