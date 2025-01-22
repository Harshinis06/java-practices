import java.util.Scanner;
class RangeFib
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
	int en=s.nextInt();	
		int n=0;
		 int b=1;
		for(int i=1;i<=en;i++){
		 int c=n+b;
		System.out.println(n);
		n=b;
		b=c;
	
		}
	}
}
