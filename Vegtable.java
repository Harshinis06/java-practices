
class Vegtable 
{
    
}
class Carrot extends Vegtable
{
	void halwa(){
		System.out.println("prepar Halwa");
	}
}
class Potato extends Vegtable
{
	void fries(){
		System.out.println("prepare fries");
	}
}
class Obj
{
	Vegtable check(String s){
		if(s.equals("Carrot"))
		return new Carrot();
		else
			return new Potato();
	}
}

class Main
	{
	
	public static void main(String[] args) 
	{
//		Vegtable a=new Carrot();
//		Carrot s=(Carrot)a;
//				s.halwa();     
Obj b=new Obj();
Vegtable v=b.check("Carrot");
Carrot c=(Carrot)v;
//Carrot v=(Carrot)b.check(new Carrot());
c.halwa();
	}
}
