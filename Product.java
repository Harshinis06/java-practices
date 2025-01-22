import java.util.Scanner;
class Product 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int mul=1;
		String st="";
		for(int i=1;i<=n;i++){
			st=st+i;
			//st+=i;
			if(i<n)
			//st+="*";
			 st+="*";//com+="*";
			//String com3=com1+mul;			
			mul*=i;//mul=mul*i;
			//System.out.println(com1+"="+mul);
			
			//System.out.println(i+"*"+mul+"="+mul);
		}
		System.out.println(st+"="+mul);
	}
}
