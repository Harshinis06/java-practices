import java.util.Scanner;
class Lastone 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int sum=0;
		do{
			while(n>0){
		int r=n%10;
		sum+=r;
		n/=10;
			}
			n=sum;
		}while(sum>9);
			System.out.println(sum);
	}
}
