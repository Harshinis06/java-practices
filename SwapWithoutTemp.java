import java.util.Scanner;
class SwapWithoutTemp
{
	public static void main(String[] args){
      Scanner s=new Scanner (System.in);
	  int a=s.nextInt();
	  int b=s.nextInt();
	
	  a=a+b;
	   System.out.println(a);
	  b=a-b;
	  // System.out.println(b);
	  //b=d;
	//  System.out.println(a);
	   a=a-b;
System.out.println("a"+ a);
System.out.println("b"+b);
	}
}
