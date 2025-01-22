import java.util.Scanner;
class Righttri 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=1;i<=n;i++){
			int x=1;
			if(i<=n/2){
			for(int j=1;j<=n;j++){
	            if(x<=i)
					System.out.print("@");
				else
					System.out.print(" ");
			}
			x++;
		
		}
		else{
		for(int j=1;j<=x+1;j++){
		System.out.print("@");
		}
		x--;
		}
		System.out.println();
		}
	}
}
