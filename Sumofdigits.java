import java.util.Scanner;
class Sumofdigit 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int sum=0;
		int a=s.nextInt();
		while(a>0){
		int r=a%10;
		sum+=r;
		a/=10;
		}
	
		System.out.println(sum);
			
	}
}
