import java.util.Scanner;
class ATM 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int amt=s.nextInt();
		int count=0,bal=0;
		if(amt>=2000){
		     count=amt/2000;
		     System.out.println("2000 X" + count);
		     bal=amt%2000;

		if(bal>=500){
			count=bal/500;
			System.out.println("500 X" + count);
			bal=bal%500;

       if(bal>=100){
            count=bal/100;
			System.out.println("100 X" + count);
			bal=bal%100;

	   }
		}


		}
	}
}
