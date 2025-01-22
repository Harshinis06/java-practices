class Obj 
{ 
	int a;
	
	static String st;
	public static void main(String[] args) 
	{
		int a=2;
		st="yguyg";
        Obj ob=new Obj();
		ob.a++;
		System.out.println(ob.a);
		System.out.println(ob.st);
		//System.out.println(Obj.st);
	}
}
