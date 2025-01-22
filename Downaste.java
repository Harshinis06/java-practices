

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
public class Downaste {
    public static void achu(String[] anbs) {
    	A a=new B();
    	a.m1();
    	
    }
}
