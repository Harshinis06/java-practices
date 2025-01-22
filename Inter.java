interface I{
	void m1();
}
class A implements I
{
	public void m1(){
		System.out.println("method m1");
	}
}
class Inter 
{
	public static void main(String[] args) 
	{
		I i=new A();
		i.m1();
	}
}
