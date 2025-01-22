import java.util.Scanner;
class Table
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter table");
		int t=s.nextInt();	
		System.out.println("enter table limit");
		int n=s.nextInt();
		//System.out.println(enter);
		int tab;
		for(int i=1;i<=n;i++){
			String com=""+i;
			String com1=com+"*"+t;
			tab=i*t;

			System.out.println(com1+"="+tab);
		}
	}                                       
}
