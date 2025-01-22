import java.util.Scanner;
class Autoo 
{
	public static void main(String[] args) 
	{
		Scanner sn=new Scanner(System.in);
		int n=sn.nextInt();
		int j=10,r=0,a=n;
		int sq=n*n;
		System.out.println(sq);
		while(n>0){
		  r=sq%j;
		// System.out.println(r);
		j*=10;
		n/=10;
		
		}
		System.out.println(r);
		if(r==a)
			System.out.println("automorphic");
		else
			System.out.println("not automorphic");
	}
}
