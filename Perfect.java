import java.util.Scanner;
class Perfect 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int sum=0;
			System.out.println("enter a number");
		int a=s.nextInt();
		for(int i=1;i<a;i++){
			//System.out.println(i);
		if(a%i==0){
			//System.out.println(i);
		sum+=i;
		}
			}if(sum==a)
				System.out.println("perfect number"+sum);
			else
					System.out.println("not perfect number"+sum);
	
			
	}

}
