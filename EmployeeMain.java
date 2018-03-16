import java.util.Scanner;
class employee{
String name;
int empid;
double salary;
employee()
{
}
employee(String name,int empid,Double salary) {
this.name=name;
this.empid=empid;
this.salary=salary;
System.out.println("Name of Employee:"+name);
System.out.println("I.D of Employee:"+empid);
System.out.println("Salary of Employee:"+salary); 
}
String getname() {
return name; 
}
double salary() {
return salary; 
}
void increasedSalary() {
System.out.println("Increased Salary of Worker:"+(salary+salary*0.2)); 
} 
}
class manager extends employee {
String department;
void getdepart(String depart) {
System.out.println("Department:"+depart); 
} 
}
class EmployeeMain{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
System.out.println("Enter Name");
String name=s.next();
System.out.println("Enter Emp-id");
int empid=s.nextInt();
System.out.println("Enter Salary");
Double salary=s.nextDouble();
employee e=new employee(name,empid,salary);
System.out.println("Enter Department");
String depart=s.next();
manager m=new manager(); 
e.getname();
e.salary();
m.getdepart(depart);
e.increasedSalary();  
}
}
