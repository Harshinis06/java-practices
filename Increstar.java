import java.util.Scanner;
class Increstar 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();int x=0,y;
		for(int i=1;i<=n;i++){
		for(int j=1;j<=n;j++){
			x++;
		if(i%2!=0){
			
			System.out.print(x);}
			//if(i>j)
			//System.out.print(" "+ n*2 +" "); 
			else{
			y=n*2;	
			//if(j==5)
			y--;
				System.out.print(y);
			
			}
		
		//else{
		//System.out.print(" "+ x++ +" ");
		//}

		}
		System.out.println();
		}

	}
}
