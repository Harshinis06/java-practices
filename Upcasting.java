class A
{ static int i;
	static void m1(){
	System.out.println(i=3);
	}
	String name="sjvnlkd";
}
class B extends A
{
	static int i;
	static void m1(){
	System.out.println(i=4);
	}
	String name="dlkbnslrk";
}
class Upcasting 
{
	public static void main(String[] args) 
	{
		A b=new B();
		b.m1();
		 System.out.println(b.name);
	}
}
