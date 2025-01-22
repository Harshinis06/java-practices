import java.util.Scanner;
public class Amstrong {
 public static void main(String[] args) {
	 Scanner s=new Scanner(System.in);
	 int n=s.nextInt();
	 int a,count=0,ams,sum=0;
	 a=n;
	 while(a>0) {
		 count++;
		 a/=10;
	 }
	 a=n;
	 while(a>0) {
		 int r=a%10;
		  ams=1;
		 for(int i=1;i<=count;i++) {
			 ams=ams*r;
			 
		 }
		 sum=sum+ams;
		 a/=10;
	 }
	 if(sum==n) {
	 System.out.println("ams" + sum);
	 }
	 else {
		 System.out.println("not amss" + sum);
		 }
	 
	// System.out.println(count);
 }
}
