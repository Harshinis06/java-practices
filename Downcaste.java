class A{
	void m1() {
		System.out.println("m1");
	}
}

class B extends A{
	void m2(){
		System.out.println("m2");
		}
}
public class Downcaste {
    public static void main(String[] anbs) {
    	A a=new B();
		B b=(B)a;
    	a.m2();
    	
    }
}
