 class A
{ int i;
   	/*final static double j;
	int a;
	
	{
	System.out.println("a non");
	a=10;
	}
	static{
		System.out.println("a static");
		j=3.14;
	}
	static void  m1(){
      System.out.println("A's method");
	}*/
	A(){
		i=40;
	
		System.out.println ( "Acontructor");
	}
}
class B extends A
{
	int j;
	/*static{
		System.out.println("b static"+j);
	}
	{
	System.out.println("b non"+super.a);
	}
    static void  m1(){
      System.out.println("B's method");
	}*/
	B(){
		j=30;
		System.out.println ( "Bcontructor");
	}
	
}
class Inher
{
	public final static void main(String[] args) 
	{
		//System.out.println("Hello World!");
	   B b=new B();
	   System.out.println(b.i);
	    System.out.println(b.j);
	  // b.m1();
	
		//System.out.println("Hello World!");
	}
}
