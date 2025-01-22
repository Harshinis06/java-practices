import java.util.Scanner;
class Polin
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i=10,sum=0;
		while(n>0){
		int r=n%10;
		sum=sum+r*i;
		i*=10;
		n/=10;
		}
		System.out.println(sum);
	}
}
