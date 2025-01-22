import java.util.Scanner;

public class RangeAms {
//	 Scanner s=new Scanner(System.in);
//	 int n=s.nextInt();
	
	
	 int ams(int k) {
		 int a;
		 int count=0,ams,sum=0;
		a=k;
		 while(a>0) {
			 count++;
			 a/=10;
		 }
		 a=k;
		 while(a>0) {
			 int r=a%10;
			  ams=1;
			 for(int i=1;i<=count;i++) {
				 ams=ams*r;
				 
			 }
			 sum=sum+ams;
			 a/=10;
			 
		 }
		
		return sum;
	}

	
  public  static void main(String[] args) {
	  RangeAms rm=new RangeAms ();
	  Scanner s=new Scanner(System.in);
	  int first=s.nextInt();
	  int last=s.nextInt();
for(int i=first;i<=last;i++) {
		  int ans=rm.ams(i);
		  if(ans==i) {
			  System.out.println("ams"+i);
		  }
		  
}
  }
	  
  }

