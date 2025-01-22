import java.util.Scanner;
class Speratedigit 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=n;i>0;i=i/10){
		int d=i%10;
		System.out.println(d);

		}
	}
}
