import java.util.Scanner;
class EorSwap 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		a=a^b;
		System.out.println(a);
		b=a^b;
		a=a^b;
        System.out.println(a+" "+b );
		System.out.println(b);
	}
}
