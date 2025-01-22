 import java.util.Scanner;
 class Small
{
	public static void main(String[] args) 
	{
        Scanner s=new Scanner(System.in);

		int a=s.nextInt();
		int r=0,r1=9,val=0;
		while(a>0){
		 r=a%10;
               if(r1>=r){
			   val=r;
				   r1=r;
			   }
			   a/=10;
			  
		}
		System.out.print(val);
	}
}
