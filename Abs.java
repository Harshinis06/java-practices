abstract class A
{ 
	A(){
	System.out.println("a s constructor");
	}
	static int a,b;
	final int c=55;
	 int maths(int a,int b){
	 return 0;}
	 //abstract int maths(int a,int b);
    void display(){
	//System.out.println(a+" "+b+" "+c);
	}
}
class B extends A
{
	int m;
	int maths(int i,int j){
		int k=super.c;
		 m=i+j+k;
		 return m;
	}
	void display(){
	System.out.println(m);
	}

}
class C extends A
{
	int n;
    int maths(int i,int j){
			int k=super.c;
	 n=i*j*k;
	 return n;
	}
	void display(){
	System.out.println(n);
	}
}
class Abs 
{
	public static void main(String[] args) 
	{
	 A b=new B();                           
		 int k=b.maths(6,9);
		 	System.out.println(k);
		//b.display();
       b=new C();
	  int l= b.maths(1,3);
	  	System.out.println(l);
	  // b1.display();
	  
	//  B b=new B();
	}
}
