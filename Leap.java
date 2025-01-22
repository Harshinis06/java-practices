import java.util.Scanner;

class Leap 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int y=s.nextInt();
		int m=s.nextInt();
		
		if(y%400==0 || (y%4==0 && y%100!=0)){
		if(m==2){
			System.out.println("29 days");
			}
		}
			else{
				if(m==4 || m==6 || m==9 || m==11){
                   System.out.println("30 days");
				}
				else if(m==2){
				System.out.println("28 days");
				}
				else{
					System.out.println("31 days");
				}
			}
	}
}
