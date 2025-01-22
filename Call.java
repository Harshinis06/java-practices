class Callto 
{
	int i,j;
	Callto(int i){
		this.i=i;
	}
	Callto(int i,int j){
	this(i);
	this.j=j;
	}
	void dis(){
	System.out.println(i+" "+j);
	}
	Callto(){}

}
class Call
{

	public static void main(String[] args) 
	{
	Callto ct=new Callto(4,5);
	ct.dis();
    Callto ct1=new Callto(6);
	ct1.dis();
	}
}
