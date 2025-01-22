 class Phone
{
	  final static int a;

  static{
   a=90;
   }

Phone(){
System.out.println(" phoe microconstructor");
}
	 static void call(){
		System.out.println(a);
		System.out.println("phone method");
	}
}
  class Microphone extends Phone
{
	
	Microphone(){
		System.out.println(" microconstructor");
	}
 
	 static void call(){
		 System.out.println(a);
		System.out.println("micro method");
	}
}
class Override
{
	public static void main(String[] args) 
	{
		Microphone m=new Microphone();
		m.call();

      /*Phone p=new Phone();
	  p.call();*/
	}
}
