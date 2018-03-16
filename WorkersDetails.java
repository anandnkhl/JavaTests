import java.util.*;
class Workers{
	String name;
	int salary;
	void ComPay(int hrs) {
	int hours;
	hours=hrs;
	System.out.println("No of hours of work : "+hours); 
	}

}
class WorkersDaily extends Workers{
	int hours;
	void ComPay(int hrs) {
	hours=hrs;
	Scanner s1=new Scanner(System.in);
	System.out.println("Enter Name of a daily worker: ");
	name=s1.next();
	System.out.println("Enter per hour salary of daily worker");
	salary=s1.nextInt();
	System.out.println("Name of worker is : "+name);
	System.out.println("Salary of a daily worker per week is : " + (hours*salary*7));  
	} 

}
class WorkersSalaried extends Workers{
	int hours;
	void ComPay(int hrs){
	hours=hrs;
	Scanner s2=new Scanner(System.in);
	System.out.println("Enter Name of a salaried worker : ");
	name=s2.next();
	System.out.println("Enter per hour salary of salaried worker");
	salary=s2.nextInt();
	System.out.println("Name of worker is : "+name);
	System.out.println("number of hours of work in a week : "+ hours);
	System.out.println("Salary of a Salaried worker per week : "+ (40*salary)); 
	} 
}

class WorkersDetails extends Workers{
	public static void main(String args[]) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter number of hours Workers work per day : ");
	int hrs=s.nextInt();
	Workers ob=new Workers();
	ob.ComPay(hrs);
	Workers ob1=new WorkersDaily();
	ob1.ComPay(hrs);
	Workers ob2=new WorkersSalaried();
	ob2.ComPay(hrs); 
	} 
}
