
public class Alternate {
   public static void main(String[] args) {
	   int a,sum;
	   for(int i=10;i<=150;i++) {
			   a=i;
			   sum=0;
			   while(a>0) {
				   int r=a%10;
				   sum=r+sum*10;
				   a/=10;  
			   }
			   if(sum==i) {
				  // System.out.println(i);
			   if(i%2==0) 
			   System.out.println(i);  
//			   else
//				   System.out.println("alt"+i);  
			   }
	   }
   }
}
