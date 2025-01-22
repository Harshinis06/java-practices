
public class Polindromeornot {
	public static void main(String[] args) {
		 int a=414;int j;int sum=0;
		 int n=a;
		 while(a>0) {
			 int r=a%10;
			 sum=r+sum*10;
			 
			 a/=10;
		 }
		 System.out.println(sum);
		 if(sum==n) {
			 System.out.println("polindrome");
		 }
		 else {
			 System.out.println("not polindrome");
		 }
	 }

}
