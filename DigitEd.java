import java.util.Scanner;
class DigitEd 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int eve=0,odd=0;
		while(a>0){
          int r=a%10;
		  if(r%2==0){
		  eve+=r;
		  }
		  else{
			  odd+=r;
		  }
		  a/=10;
		  	
		}
		System.out.println("even"+eve);
	    System.out.println("odd"+odd);
	}
}
