import java.util.Scanner;
class Magic 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int sum=0,r,a=n;
		while(n>0){
			r=n%10;
			sum+=r;
			n/=10;
		}
        System.out.println(sum);
		int v=a/sum;
		System.out.println(v);
		int f=v*sum;
		System.out.println(f);
		if(f==a)
			System.out.println("magic");
		else
			System.out.println("not magic");
	}
}
