class Ad 
{
	int a,b,c;
    Ad(int i,int j){
	a=i;
	b=j;
	
		}
		void dis(){
			c=a+b;
		System.out.println("a"+"="+a+"\n"+"b"+"="+b);
         System.out.println(c);
		}
}
class Test
{

	public static void main(String[] args) 
	{
		Ad a=new Ad(10,20);
		a.dis();
	}
}
