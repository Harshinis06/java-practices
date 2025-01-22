class Multi 
{
	static int a=10;
	static{
		 a=20;
		}
		int b=9;
	{
	b=0;
	}
	public static void main(String[] args) 
	{
		Multi m=new Multi();
		System.out.println(a+" "+m.b);
	}
}
