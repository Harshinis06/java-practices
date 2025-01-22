import java.util.Scanner;
class  EveOdd
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner (System.in);
		float val=s.nextFloat();
		if(val%2==0.0){
		System.out.println("even");
		}
		else{
			System.out.println("odd");
	     }
		}
}
