import java.util.Scanner;

public class PrimeRange {
	static boolean prime(int n) {
		if(n<=1) {
			return false;
		}
		else
		{
			for(int i=2;i<=n/2;i++) {
				if(n%i==0) 
					return false;
			}
				
		}
	 return true;	
	}

	public static void main(String [] args) {
		Scanner s=new Scanner(System.in);
		int start=s.nextInt();
		int end=s.nextInt();
		 for(int i=start;i<=end;i++) {
			 boolean val=PrimeRange.prime(i);
			 if(val==true) {
				 System.out.println(i);
			 }
		 }
		 }
	}

