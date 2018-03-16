class Fibonacci{
	public static void main(String args[]){
		int i,n,t1=0,t2=1,next;
		n=Integer.parseInt(args[0]);
		
		for(i=0;i<n;i++){
			if(i==0)
			{	System.out.print(t1+" ");
				continue;
			}
			
			if(i==1)
			{	System.out.print(t2+" ");
				continue;
			}
		
			next=t1+t2;
			t1=t2;
			t2=next;
			System.out.print(next+" ");
		}
	}
}