import java.util.Scanner;
class ArraySum{
	public static void main(String args[]){
		Scanner S= new Scanner(System.in);
		int arr[]= new int[10];
		int sq[]= new int[10];
		int i;
		int sum=0;
		
		System.out.println("Enter the 10 numbers:");
		
		for(i=0;i<10;i++){
			arr[i]=S.nextInt();
		}
		
		System.out.println("Squares of your numbers are:");
		for(i=0;i<10;i++){
			sq[i]= arr[i]*arr[i];
			System.out.print(sq[i]+" ");
		}
		System.out.print("\n");
		
		for(i=0;i<10;i++){
			sum= sum+sq[i];
		}
		
		System.out.println("Sum of squares is: " + sum);
	}
}