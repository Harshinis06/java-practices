class Lcm 
{
	public static void main(String[] args) 
	{
		int a=10,b=4;
		int n=a>b?a:b;
		int i=n;
		while(true){
			if(n%a==0 && n%b==0)
			break;
			//continue;
			n=n+i;
		
			}
				System.out.println(n);
			
	}
}
