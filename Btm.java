import java.util.Scanner;
class Btm 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		int sum=0;
		String com="";
         for(int i=a;i<=b;i++){
			com+=i;
			if(i<b)
		     com+="+";
            sum=sum+i;
           // String com3=com1+i;
			
		 }
		 System.out.println(com+"="+sum);
	}
}
