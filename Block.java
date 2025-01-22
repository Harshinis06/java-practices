class Block 
{
	int i,j;
	static int k;
	Block(int i,int j,int k){
	this.i=i=10;
	this.j=j;
	this.k=k;
	//System.out.println(a);
	}
	Block(Block n){
	this.i=n.i=20;
	this.j=n.j;
	this.k=n.k=89;
	}
	Block(){

	}
void dis1(Block m,Block v){
	
	m.k=v.i+m.j;
	System.out.println(m.k);
}

	void dis(){
	System.out.println(i+" "+j+" "+" "+k);
	}
	public static void main(String[] args) 
	{
		Block b=new Block(4,5,6);
		b.dis();
		Block b1=new Block(b);
		b1.dis();
		Block b3=new Block();
         b3.dis1(b1,b);
	}
}
