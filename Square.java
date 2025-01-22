import java.util.Scanner;
class Square 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int count=0,sum=0;int s=1;
		int n=sc.nextInt();
		int a=n;
		while(n>0){
			count++;
			n/=10;
		}
		System.out.println("count" +count);
		
		while(a>0){
			s=1;
		int r=a%10;
		//System.out.println(r);
	//	System.out.println("count" +count);
	    for(int i=1;i<=count;i++){
		 s=s*r;
		}
		//System.out.println("count" +count);
	//	System.out.println(s);
		sum+=s;
		//System.out.println(sum);
		a/=10;
		}
		System.out.println(sum);
	}
}
