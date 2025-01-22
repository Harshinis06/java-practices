import java.util.Scanner;
class EvenOdd 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int eve=0,odd=0;
		for(int i=1;i<=n;i++){
		if(i%2==0){
			eve+=i;
		}
		else{
		odd+=i;
		}
		}
		System.out.println(eve);
		System.out.println(odd);
	}
}
