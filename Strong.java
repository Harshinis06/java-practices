import java.util.Scanner;
class Strong 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int n=a;
		int p=1;
		int sum=0;
		while(a>0){
		int r=a%10;
         p=1;
		for(int i=1;i<=r;i++){
			
		 p=p*i;
		}
		sum=sum+p;
		//System.out.println(p);
		// System.out.println(sum);
		
		 a=a/10;
		/*System.out.println(sum);
			a/=10;
			if(sum==n)
				System.out.println("strong");
			else
				System.out.println("not Strong");*/
		}
		
		//System.out.println(p);
		System.out.println(sum);
		if(sum==n)
				System.out.println("strong");
			else
				System.out.println("not Strong");
	}
}
