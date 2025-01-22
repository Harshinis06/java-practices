import java.util.Scanner;
class One
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int x=0;
		for(int i=1;i<=n;i++){
		  for(int j=1;j<=n;j++){
		   x++;
		   System.out.print(x+" ");
		  }
		  System.out.println();
		}
			
	}
}
