import java.util.Scanner;
class Decrenumb 
{
	public static void main(String[] args) 
	{
	   Scanner s=new Scanner(System.in);
	   int n=s.nextInt();  
	    int c=1,d=5,a=0,b=0,e=0,f=0 , x=1;
	   for(int i=1;i<=n;i++){
	  
	   a=c;
	   b=d;
	   if(i!=x){
		  
	   for(int j=1;j<=a;j++){
	   System.out.print(b--);
	   }
	   a++;
	//	b--;
		c=a;
		d=b;
	   }
	   
       if(i<=x){
       //  e=c;
		 f=d;
		for(int j=1;j<=f;j++){
		System.out.print(j);}
		//e++;
		f--;
		//c=e;
		d=f;
		} 
		 x+=2;
System.out.println();
	   }
	}
}
