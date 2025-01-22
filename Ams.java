class Ams 
{
	static int ct=0;
	static int s=0,r;
	public static void main(String[] args) 
	{
		int n=444;
		int t=n;
		while(t>0){
			ct++;
			t/=10;
		}

  int a=am(n,ct);
  System.out.println(a);
	}
	static int am(int n,int ct){
	if(n>0){
	 r=n%10;
	int sq=(int)Math.pow(r,ct);
	s=s+sq;
	
	 am(n/10,ct);
	}
   return s;
	}
	

}
