import java.util.Scanner;
class Autorange 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int r=0,sq=0,i;
		for( i=1;i<=n;i++){
			int num=i;
		 sq=i*i;
		int j=10;
		while(i>0){
		 r=sq%j;
		j*=10;
		i/=10;
		}
		i=num;
		if(r==i)
			System.out.println(r+"auto");
		}
		
	}
}
