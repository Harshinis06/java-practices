import java.util.Scanner;
class Neonrange 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=1;i<=n;i++){
		int num=i,r,sum=0;
		int sq=i*i;
		while(i>0){
			r=sq%10;
			sum+=r;
			i/=10;
			
		}
		i=num;
		if(i==sum)
			System.out.println(i+"Neon");
			}
	}
}
