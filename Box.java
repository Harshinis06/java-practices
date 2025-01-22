class Box 
{
	int height;
	int width;
	int length;
	Box(){
	}
	Box(int i,int j,int k){
	height=i;
	width=j;
	length=k;
	}
	void dis(){
	System.out.println("h"+height+"j"+width+"k"+length);
	}
	Box(int a){
	height=width=length=a;
	}
}
class Box2
{

	public static void main(String[] args) 
	{
	    Box b=new Box();
		Box b1=new Box(10,20,30);
		 Box b3=new Box(6);
		b.dis();
		b1.dis();
		b3.dis();
	}
}
