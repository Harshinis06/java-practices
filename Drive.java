class Car
{
	int regnum;
	static int x=1000;
	Car(){
	regnum=x++;
	}
	void start(){
	System.out.println(regnum+"start");
	}
	void accela(){
	System.out.println(regnum+"acce");
	}
	void brake(){
	System.out.println(regnum+"brake");
	}
}
class Drive1{
	void dd(Car n){
	n.start();
	n.accela();
	n.brake();
	}
	}
class Drive 
{
	public static void main(String[] args) 
	{
		Car c=new Car();
		Car c1=new Car();
		Drive1 d=new Drive1();
         d.dd(c);
		 d.dd(c1);
		
	}
}
