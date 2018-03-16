import java.util.Scanner;
class ThreeDigits{
	public static void main(String args[]){
		int i;
		int arr[]= new int[3];
		Scanner s = new Scanner(System.in);
		//Taking Input//
		for(i=0;i<3;i++){
			System.out.println("Enter a digit");
			arr[i]=s.nextInt();
		}
		//Case 1//
		if(arr[0]==arr[1] && arr[1]==arr[2]){
			System.out.println("Only one possibility:");
			System.out.println(arr[0]+arr[1]+arr[2]);
		}
		else if(arr[0]==arr[1] && arr[1]!=arr[2]){
			//Print logic
		}
		else if(arr[0]!=arr[1] && arr[1]==arr[2]){
			//Print logic
		}
		else if(arr[0]==arr[2] && arr[1]!=arr[2])
	}
}