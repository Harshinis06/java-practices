import java.util.Scanner;
class Hallowdia 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();int x=0,y=20;
		for(int i=1;i<=n;i++){
		for(int j=1;j<=n;j++){
		if(i==j || j==1 )
			System.out.print("*");
		if(j+1==j && n-1==i)
			System.out.print("*");
		else
			System.out.print(" ");
		}
		System.out.println();

	}
}
}
