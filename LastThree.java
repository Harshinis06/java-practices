
public class LastThree {
  public static void main() {
	  int count=0,j=1,a,sum;
	  for(int i=50;i<=100;i++) {
		  a=i;
		  sum=0;
		  while(i>0) {
			  int r=i%10;
			  sum=sum+r*10;
			  i/=10;
			  
		  }
		  if(sum==a)
			  count++;
		  if(j<=count) {
			  System.out.println(i);
		  }
	  }
  }
}
