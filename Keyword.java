class A
{
	String name;
	int s;
	
	A(String n){
	name=n;
	}
A(int s,String f){
	this(f);//call to this
	this.s=s;
		}
}
class B extends A
{

	int n;
    B(String s,int a){
    super(s);
	n=a;
	}
}
class C extends A
{
	int i;
	String n;
	double j;
		C(double d,String n,int a){
			super(n);
             j=d;
			 i=a;
	}
  C(C k){
  this(k.j,k.n,k.i);//copy  constructor
  }
}
class Keyword 
{
	public static void main(String[] args) 
	{
		 
		C c=new C(7.8,"jftrf",78);
			System.out.println(c.j);
		System.out.println(c.name);
		System.out.println(c.i);
			C c1=new C(c);//copy  constructor
		System.out.println(c1.i);
		/*System.out.println("-----------");
		B b=new B("hau",23);
		System.out.println(b.name);
		System.out.println(b.n);
        System.out.println("-----------");*/
			
				A a=new A(767,"jugv");//call to this
			System.out.println(a.name);
            	System.out.println(a.s);
	}
}
