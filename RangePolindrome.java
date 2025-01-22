

public class RangePolindrome {
   public static void main(String []args) {
	  int a,i,sum;
	   for( i=1;i<=50;i++) {
		   a=i;
		   sum=0;
		   while(a>0) {
		   int r=a%10;
		   sum=r+sum*10; 
		  a/=10;
		   }
		  if(sum==i)
			  System.out.println(i);  
 
	   }
	  
   }
}
