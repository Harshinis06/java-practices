
public class Large {
 public static void main(String[]args) {
	 int a=87538;
	 int r=0,r1=0,val=0;
	 while(a>0) {
		 r=a%10;
		 if(r1<r) {
			 val=r;
		 r1=r;}
		 a/=10;
	 }
	 System.out.println(val);
 }
}
