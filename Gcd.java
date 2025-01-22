import java.util.Scanner;
class Gcd 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
        int b=s.nextInt();
	//	int n=s.nextInt();
	int c=0;
		int n=a<b?a:b;
		for(int i=2;i<=n;i++){

			if(a%i==0 && b%i==0)
				 c=i;
		}
		System.out.println(c);

	}
}
