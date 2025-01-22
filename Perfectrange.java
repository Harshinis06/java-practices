import java.util.Scanner;
class Perfectrange 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int sum=0;
		//int num;
		for(int i=1;i<=n;i++){
		
		for(int j=1;j<i;j++){
		if(i%j==0){
			sum=sum+j;
		}

	
		}
			
		if(i==sum){
				System.out.println(i+"perfect");}
				
			sum=0;
			
		}	
	}
}
