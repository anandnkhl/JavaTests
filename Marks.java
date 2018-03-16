import java.util.*;
class Marks{
	public static void main(String args[]){
		int arr[]=new int[10];
		int i;
		String grade;
		Scanner s= new Scanner(System.in);
		for(i=0;i<10;i++)
		{
			System.out.println("Enter the "+ (i+1) + " marks");
			arr[i]= s.nextInt();
		}
		
		Arrays.sort(arr);
		
		for(i=0;i<10;i++)
		{
			if(arr[i]<40){
				grade="Fail";
			}
			else if(arr[i]>=40 && arr[i]<50){
				grade="Pass";
			}
			else if(arr[i]>=50 && arr[i]<75){
				grade="Merit";
			}
			else{
				grade="Distinction";
			}
			System.out.println(arr[i] + " " + grade);
		}
	}
}