import java.util.Scanner;

public class Nextpolindome {
	                                                                                                       
	 public int poli(int n) {
		  int sum=0;
	 while(n>0) {
		 int r=n%10;
		 sum=r+sum*10;
		 n/=10;
	 }
	 return sum;
	
 }
	 public static void main(String[] args) { 
		 Scanner s=new Scanner(System.in);
		 int a=s.nextInt();
		 int count=0,n=a;
		 while(a>0) {
			 Nextpolindome p=new Nextpolindome();
			int val=p.poli(a);
			if(val==a && n<a) {
				count++;	
			 if(count==1) {
				 System.out.println(a);
				 break;
			 }
			} 
			 a++;
		 }
		
	 }
	 
}
