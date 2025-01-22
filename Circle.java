class Circle 
{ 
	String color;

Circle(String s){
	 //a=40;
	color=s;
       //this.b=b;
}
}
class Tes
{

 void dis(Circle l){
 l.color="red";
 } 
}
class Test{
	
	public static void main(String[] args) 
	{
		Circle c=new Circle("black");
		System.out.println(c.color);
		Tes t=new Tes();
		t.dis(c);
		System.out.println(c.color);
	}
}
