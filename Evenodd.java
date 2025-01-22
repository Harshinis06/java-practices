import java.util.Scanner;
class Evenodd
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int even=0,odd=0;
			
	for(int i=n;i>0;i/=10){
	//	int i=n;
	//	do{
		int r=i%10;
		if(r%2==0){
		even+=r;
		}
		else{
			odd+=r;
		}
	  // i/=10;
		}//while(i>0);
			System.out.println("even"+even);
			System.out.println("odd"+odd);
		
		
	}
}
