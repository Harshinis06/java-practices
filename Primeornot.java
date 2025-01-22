import java.util.Scanner;

public class Primeornot {
  
	boolean prime(int n) {
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
		int n=s.nextInt();
		Primeornot pri=new Primeornot();
		boolean ans=pri.prime(n);
		if(ans==true)
			System.out.println("its prime"+n);
		else
			System.out.println("not prime"+n);
	}
}
