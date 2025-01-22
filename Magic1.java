import java.util.Scanner;
class Magic1 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int sum=0,i=1,fin=0,b=n;
		while(n>0){
		int r=n%10;
		sum+=r;
		n/=10;
		}
			System.out.println(sum);
			int a=sum;
		while(sum>0){
			int r=sum%10;
			 fin=r*10+i;
			 		System.out.println(fin);
			 int val=fin*a;
			 		System.out.println(val);
			if(val==b){
				System.out.println("magic number");
				break;
				}
			i*=10;+
			sum/=10;
		}
//		System.out.println(fin);
	}
}
