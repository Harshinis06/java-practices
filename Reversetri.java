import java.util.Scanner;
class Reversetri
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		
		int n=s.nextInt();
		int a=1,b=n-1;
		for(int i=1;i<=n;i++){
		for(int j=1;j<=b;j++){
			System.out.print(" ");
			}
			for(int j=1;j<=a;j++){
			System.out.print("*");
			}
			if(i<=n/2){
		a++;
		b--;
			}
			else{
			a--;
			b++;
			}
		System.out.println();
		}
	}
}

