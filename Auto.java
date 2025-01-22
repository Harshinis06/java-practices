import java.util.Scanner;
class Auto 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		boolean flag=true;
		int sq=n*n;
		System.out.println(sq);
		int count=0,a=sq,r=0;
        if(sq>0){
		count++;
		sq/=10;
		}
		
		for(int i=1;i>=count;i++){
			
			do{
				int j=10;
			r=0;
			r=a%j;
			// System.out.println(r);
			if(r==a)
		flag=true;
			
			
			j*=10;
			}while(r==a);
			System.out.println(r);
			/*for(int j=10;r!=a;j*=10){
				r=0;
			r=sq%j;
			 //System.out.println(r);
			if(r==a)
			System.out.println(r);
			
			//a/=10;
				
			}
           //System.out.println(r);*/
		}

	
	}
}
